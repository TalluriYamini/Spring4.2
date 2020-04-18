<%@ taglib prefix="jlc" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>Course Information:</h2>
<ul>
	<jlc:forEach var="cou" items="${ALL}">
		<li><h1>${cou}</h1>
	</jlc:forEach>
</ul>