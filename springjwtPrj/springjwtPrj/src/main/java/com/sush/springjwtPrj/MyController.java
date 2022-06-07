package com.sush.springjwtPrj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
	
	@Autowired
	private AuthenticationManager authenticationManager ;
	
	@Autowired
	private JwtUtility jwtUtil ;
	
	@Autowired
	private MyUserDetailsService userDetailsService;

    @GetMapping("/hello")
	public String myPage() {
		return "<h3>Hello JWT</h3>";
	}
    
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) {
    	
    	try {
    	authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername()
    			,authenticationRequest.getPassword())) ;
    	}
    	catch (BadCredentialsException e) {
    	   System.out.println(e) ;
    	}
    	
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        
        final String jwt = jwtUtil.generateToken(userDetails);
        
        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    	
    }
}
