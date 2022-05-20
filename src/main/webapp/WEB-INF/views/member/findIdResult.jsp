<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import url="../temp/header.jsp"></c:import>

<div class="container">
	<h1>ID 찾기 결과 Page</h1>
	
	<div class="row">
		<c:choose>
			<c:when test="${not empty idResult}">
				<spring:message code="member.findId" arguments="${idResult.id}"></spring:message>
			</c:when>
			<c:otherwise>
				<spring:message code="member.notFindId"></spring:message>
			</c:otherwise>
		</c:choose>
	
	</div>
	
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>