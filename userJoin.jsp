<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="user.UserDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;" charset="UTF-8">
<meta name="viewport"
	content="width=device, initial-scale=1, shrink-to-fit=no">
<title>W&C 게시판</title>
<!-- 부트스트랩 CSS 추가하기 -->
<link rel="stylesheet" href="./css/bootstrap.min.css">
<!-- 커스텀 CSS 추가하기 -->
<link rel="stylesheet" href="./css/custom.css">

<link rel="stylesheet" href="assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>

</head>
<body>
	<%
	String userID = null;
	if(session.getAttribute("userID") != null){
		userID = (String)session.getAttribute("userID");
	}
	if(userID != null){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('이미 로그인이 된 상태입니다.')");
		script.println("location.href = 'index.html';");
		script.println("</script>");
		return;
	}
	
%>
	<div id="page-wrapper">
		<!-- Header -->
		<header id="header" class="alt">
			<h1 id="logo">
				<a href="index.html">Warm & Cool <span>BY Open Source
						01-03</span></a>
			</h1>
			<nav id="nav">
				<ul>
					<li class="current"><a href="index.html">HOME</a></li>
					<li class="submenu"><a href="#">BOARD</a>
						<ul>
							<li><a href="index.jsp">ALL</a></li>
							<li><a href="BoardSpring.jsp">WARM SPRING</a></li>
							<li><a href="BoardSummer.jsp">COOL SUMMER</a></li>
							<li><a href="BoardAutumn.jsp">WARM AUTUMN</a></li>
							<li><a href="BoardWinter.jsp">COOL WINTER</a></li>
						</ul></li>
					<li class="submenu"><a href="#">MORE</a>
						<ul>
							<li><a href="personal_color.html">퍼스널컬러란?</a></li>
							<li><a href="warm_spring.html">봄 웜톤</a></li>
							<li><a href="cool_summer.html">여름 쿨톤</a></li>
							<li><a href="warm_autumn.html">가을 웜톤</a></li>
							<li><a href="cool_winter.html">겨울 쿨톤</a></li>
						</ul></li>
					<li><a href="userLogin.jsp" class="button primary">Log in</a></li>
				</ul>
			</nav>
		</header>

		<!-- Banner -->
		<section id="banner">

			<!--
						".inner" is set up as an inline-block so it automatically expands
						in both directions to fit whatever's inside it. This means it won't
						automatically wrap lines, so be sure to use line breaks where
						appropriate (<br />).
					-->
			<div class="inner">

				<header>
					<h2>Warm & Cool</h2>
				</header>
				<p>
					앱을 토해 자신의 퍼스널 컬러를 찾았다면? <br /> 이곳에서 자유롭게 의견을 공유해보세요! <br />
				</p>
				<footer>
					<ul class="buttons stacked">
						<li><a href="personal_color.html" class="button fit scrolly">퍼스널컬러란?</a></li>
					</ul>
				</footer>

			</div>
		</section>
	</div>
	<section class="container mt-3" style="max-width: 560px;">
		<form method="post" action="./userJoinAction.jsp">
			<div class="form-group">
				<label>아이디</label> <input type="text" name="userID"
					class="form-control">
			</div>
			<div class="form-group">
				<label>비밀번호</label> <input type="password" name="userPassword"
					class="form-control">
			</div>
			<div class="form-group">
				<label>이름</label> <input type="text" name="userName"
					class="form-control" maxlength="20">
			</div>
			<div class="form-group">
				<label>이메일</label> <input type="email" name="userEmail"
					class="form-control" maxlength="50">
			</div>
			<button type="submit"
				style="background: #83d3c9; border-color: #ffffff; color: #fff"
				class="fit">로그인</button>
			<button type="submit"
				style="background: #83d3c9; border-color: #ffffff; color: #fff"
				class="fit">회원가입</button>
		</form>

	</section>
	<footer class="bg-dark mt-4 p-5 text-center" style="color: #FFFFFF;">
		Copyright &copy; 2020 오픈소스개발프로젝트 03팀 </footer>
	<!-- 제이쿼리 자바스크립트 추가하기 -->
	<script src="./js/jquery.min.js"></script>
	<!-- popper 자바스크립트 추가하기 -->
	<script src="./js/popper.js"></script>
	<!-- 부트스트랩 자바스크립트 추가하기 -->
	<script src="./js/bootstrap.min.js"></script>

</body>
</html>