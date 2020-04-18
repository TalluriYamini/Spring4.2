<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<h1>Hi ${student.sname};Your Registration Successful</h1>
	<h1>Given details are:::</h1>
	<br />
	<c:out value="${student.sid}" />
	<br />
	<c:out value="${student.email}" />
	<br />
	<c:out value="${student.phone}" />
	<br />
	<c:forEach var="tim" items="${student.timings}">
		<c:out value="${tim}" />
		<br />
	</c:forEach>
	<c:out value="${student.gender}" />
	<br />
	<c:out value="${student.qualification}" />
	<br />
	<c:out value="${student.remarks}" />
	<br />
	<h1>this is your Home Page</h1>
</body>
</html>