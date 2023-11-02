<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos Page</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //Work on HTTP version 1.1
	
	response.setHeader("Pragma", "no-cache"); // for Http 1.0 version
	
	response.setHeader("Expires","0"); // Proxy Server
	
		if(session.getAttribute("username")== null)
		{
			response.sendRedirect("login.jsp");
			
		}
		
	
	%>
	<iframe width="560" height="315" src="https://www.youtube.com/embed/lvdBNkaesZg?si=dwJ0ab3svjTC3w05" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
	

</body>
</html>