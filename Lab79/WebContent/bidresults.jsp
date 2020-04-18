<html>
<body>
	<center>
		<br>
		<h1>Java Learning Center</h1>
		<br />
		<h2>Student Search Form</h2>

		<c:forEach var="STO" items="${SLIST}">
			<c:out value="${STO.sid}">Student ID </c:out>
			<br />
			<c:out value="${STO.bid}">Batch ID </c:out>
			<br />
			<c:out value="${STO.name}">Student Name </c:out>
			<br />
			<c:out value="${STO.email}">Email ID </c:out>
			<br />
			<c:out value="${STO.phone}">Phone No </c:out>
			<br />
		</c:forEach>

	</center>
</body>
</html>