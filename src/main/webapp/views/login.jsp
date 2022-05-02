<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no, target-densitydpi=medium-dpi" />
  <meta http-equiv="Content-Security-Policy" content="upgrade-insecure-requests">
  <title>로그인</title>
  <link rel="stylesheet" type="text/css" href="views/style.css">
</head>

<body class="page01 tC">
    <div class="mXY">
        <img src="views/img/logo.png">

        <div class="a01">
        	<form method="post" action="">
            	<div><span>ID</span><input type="text" name="uid"></div>
            	<div><span>PW</span><input type="password" name="upw"></div>
            	<button>Log in</button>
       		</form>
        </div>

        <div class="cscenter">
            <a href="join01.jsp">회원가입</a>
        </div>
    </div>
</body>
</html>
