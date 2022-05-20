<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<c:import url="../temp/header_css.jsp"></c:import>
<c:import url="../temp/header_script.jsp"></c:import>

<title>Insert title here</title>
</head>
<body>
	<c:import url="../temp/header.jsp"></c:import>

	<div class="container mt-4">
		<div class="row mt-4">
			<div class="alert alert-light" role="alert">
				<h4 style="text-transform: uppercase;">${board} Login</h4>
			</div>
		</div>


		<div class="row mt-4">
			<form action="login" method="post">
				<div class="row mb-3">
					<label for="id" class="col-sm-2 col-form-label">ID</label>
					<div class="col-sm-10">
						<input type="text" name="id" class="form-control" id="id">
					</div>
				</div>

				<div class="row mb-3">
					<label for="pw" class="col-sm-2 col-form-label">Password</label>
					<div class="col-sm-10">
						<input type="password" name="pw" class="form-control" id="pw">
					</div>
				</div>

				<button type="submit" class="btn btn-primary">Login</button>
				
				<div class="row">
					<button id="find" type="button" class="btn btn-danger">ID찾기</button>	
				</div>
				
			</form>

		</div>


	</div>



	<script type="text/javascript">
		$("#find").click(function() {
			location.href="./findId";
		})
	</script>
</body>
</html>