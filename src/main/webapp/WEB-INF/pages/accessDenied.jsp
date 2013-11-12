<%@ taglib prefix="security"
           uri="http://www.springframework.org/security/tags" %>
<html>
<body>
	<h1>Hello <!--security:authentication property="principal.username" /-->! You do not have the necessary role to access this resource..</h1>

    <a href="/">Home</a>
    <a href="/logout">Logout</a>
</body>
</html>