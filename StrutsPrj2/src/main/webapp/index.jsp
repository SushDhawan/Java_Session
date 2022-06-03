<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="book">

<s:textfield name="name" Label="Name of course" ></s:textfield>
<s:submit value="OK"></s:submit>

</s:form>