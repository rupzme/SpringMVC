<%@ taglib prefix="security"
           uri="http://www.springframework.org/security/tags" %>
<html>
<body>
	<h1>Hello <!--security:authentication property="principal.username" /-->! You've logged in!</h1>

    <a href="/logout">Logout</a>
</body>
</html>