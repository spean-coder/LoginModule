<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<%
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //Work on HTTP version 1.1
		
		response.setHeader("Pragma", "no-cache"); // for Http 1.0 version
		
		response.setHeader("Expires","0"); // Proxy Server
		
	
	
	if(session.getAttribute("username") == null)
	{
		response.sendRedirect("login.jsp");
			
	}
	%>
	
	Welcome, ${username}
	<br>
	<a href="videos.jsp">Videos here</a>
	
	<form action="Logout">
		<input type="submit" value="logout">
	
	
	</form>

</body>
</html>