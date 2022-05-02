<%@page import="domain.LoginVO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
  	LoginVO vo = (LoginVO) request.getAttribute("vo");  
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원수정</title>
<link rel="stylesheet" type="text/css" href="views/style.css">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no, target-densitydpi=medium-dpi" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>

<body class="page07">
	<div class="jointit w100 tC">
		<b>회원가입</b>
	</div>

	<div class="pd16">
		<form method="post" action="mymodiAct.jsp">
			<input type="hidden" name="uid" id="uid" value="<%=vo.getUid() %>">
			<div>
				<h4>이름</h4>
				<input type="text" name="uname" id="uname" value="<%=vo.getUname() %>">
			</div>

			<div>
				<h4>학교</h4>
				<input type="text" name="schoolname" id="sc" value="<%=vo.getSchoolname() %>">
			</div>

			<div>
				<h4>학년/반</h4>
				<input type="text" name="gradeclass" id="cl" value="<%=vo.getGradeclass() %>">
			</div>

			<div>
				<h4>노선</h4>
				<div class="sltbox">
					<select name="route">
						<option value="A" <%="A".equals(vo.getRoute())?"selected":"" %>>A노선</option>
						<option value="B" <%="B".equals(vo.getRoute())?"selected":"" %>>B노선</option>
						<option value="C" <%="C".equals(vo.getRoute())?"selected":"" %>>C노선</option>
					</select>
				</div>
			</div>

			<div>
				<h4 class="inline">탑승장소</h4>
				<span>(※노선을 먼저 선택해주세요)</span>
				<div class="sltbox">
					<select name="boardingplace">
						<option value="A" <%="A".equals(vo.getBoardingplace())?"selected":"" %>>A장소</option>
						<option value="B" <%="B".equals(vo.getBoardingplace())?"selected":"" %>>B장소</option>
						<option value="C" <%="C".equals(vo.getBoardingplace())?"selected":"" %>>C장소</option>
					</select>
				</div>
			</div>

			<div class="jw100 tC">
				<button type="submit" id="go">수정하기</button>
			</div>
		</form>
	</div>
	<script>

    $(document).ready(function(){
 
    	$("#go").click(function(){
    		if($("#uname").val() == ''){
        		alert("이름을 입력하세요.");
        		return false;
        	}
    		
    		if($("#sc").val() == ''){
        		alert("학교를 입력하세요.");
        		return false;
        	}
    		
    		if($("#cl").val() == ''){
        		alert("학년과 반을 입력하세요.");
        		return false;
        	}
    		
    		if($("#upw").val() == ''){
        		alert("비밀번호를 입력하세요.");
        		return false;
        	}
    		
    		if($("#route").val() == 'N'){
        		alert("노선을 고르세요.");
        		return false;
        	}
    		
    		if($("#pl").val() == 'N'){
        		alert("탑승장소를 고르세요.");
        		return false;
        	}
    		return true;
    	});
    });
    </script>
</body>
</html>
