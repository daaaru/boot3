<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	alert('${msg}');
	location.href="${path}"
	
	//서버로 요청하는 방식 5가지
	//서버요청 필수 요소 : URL, Method
	//1. web browser의 주창에 직접 주소를 입력
	//2. html에 a태그
	//3. html에 form태그
	//4. JS에서 loction 객체의 href속성
	//5. ajax
	
</script>