<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<body>
<p>
<h1> ****** ${userName}'s Dashboard ******</h1>
</p>
 <c:forEach var="role" items="${userRoles}">
 	<c:if test="${role=='ROLE_USER'}">
	   <h2>User Dashboard !!!</h2>
	</c:if>
	<c:if test="${role=='ROLE_ADMIN'}">
	     <h2>Admin Dashboard !!!</h2>
	</c:if>
</c:forEach>                      
</body>
</html>