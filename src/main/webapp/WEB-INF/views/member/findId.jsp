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

	<div class="container mt-4">
		<div class="row mt-4">
			<div class="alert alert-light" role="alert">
				<h4 style="text-transform: uppercase;">${board} Find ID</h4>
			</div>
		</div>


		<div class="row mt-4">
			<form action="findId" method="post">
				<div class="row mb-3">
					<label for="email" class="col-sm-2 col-form-label">Email</label>
					<div class="col-sm-10">
						<input type="text" name="email" class="form-control" id="email">
					</div>
				</div>

				

				<button type="submit" class="btn btn-primary">ID찾기</button>
				

			</form>

		</div>


	</div>

</body>
</html>