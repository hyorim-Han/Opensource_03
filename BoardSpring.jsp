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


</head>
<body>
	<%
	String userID = null;
	if(session.getAttribute("userID") != null){
		userID = (String)session.getAttribute("userID");
	}
	if(userID == null){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('로그인을 해주세요.로그인 페이지로 이동합니다.')");
		script.println("location.href = 'userLogin.jsp';");
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
					<li><a href="userLogoutAction.jsp" class="button primary">Log out</a></li>
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
					앱을 통해 자신의 퍼스널 컬러를 찾았다면? <br /> 이곳에서 자유롭게 의견을 공유해보세요! <br />
				</p>
				<footer>
					<ul class="buttons stacked">
						<li><a href="personal_color.html" class="button fit scrolly">퍼스널컬러란?</a></li>
					</ul>
				</footer>

			</div>
		</section>
	</div>
	<section class="container">
		<form method="get" action="./index.jsp" class="form-inline mt-3">
			<select name="seasonDivide" class="form-control mx-1 mt-2">
				<option value="ALL">ALL</option>
				<option value="SPRING" selected>WARM SPRING</option>
				<option value="SUMMER">COOL SUMMER</option>
				<option value="AUTUMN">WARM AUTUMN</option>
				<option value="WINTER">COOL WINTER</option>
			</select> 
			<a class="btn btn-primary mx-1 mt-2" data-toggle="modal"
				href="#registerModal">등록</a> 
				<a class="btn btn-primary mx-1 mt-2"
				href="BoardSummer.jsp">이동</a>
		</form>
		<div class="card bg-light mt-3">
			<div class="card-header bg-light">
				<div class="row">
					<div class="col-8 text-left">
						안녕 &nbsp;<small>WARM SPRING</small>
					</div>
					<div class="col-4 text-right">
						ID:<span style="color: blue;">ID</span>
					</div>
				</div>
			</div>
			<div class="card-body">
				<p class="card-text">반가워</p>
				<div class="row">
					<div class="col-9 text-left">
						<span style="color: green;">(추천: 1)</span>
					</div>
					<div class="col-3 text-right">
						<a onclick="return confirm('추천하시겠습니까?')"
							href="./likeAction.jsp?commentID=">추천</a> <a
							onclick="return confirm('삭제하시겠습니까?')"
							href="./deleteAction.jsp?commentID=">삭제</a>
					</div>
				</div>
			</div>
		</div>

		<div class="card bg-light mt-3">
			<div class="card-header bg-light">
				<div class="row">
					<div class="col-8 text-left">
						웜앤쿨 자가진단 꽤 괜찮은 것 같아요!&nbsp;<small>WARM SPRING</small>
					</div>
					<div class="col-4 text-right">
						ID:<span style="color: blue;">신주영주영</span>
					</div>
				</div>
			</div>
			<div class="card-body">
				<p class="card-text">앱으로 자가진단 하고 돈내고 받으러 갔는데 앱 결과랑 일치해서 놀랐어요.</p>
				<div class="row">
					<div class="col-9 text-left">
						<span style="color: green;">(추천: 11)</span>
					</div>
					<div class="col-3 text-right">
						<a onclick="return confirm('추천하시겠습니까?')"
							href="./likeAction.jsp?commentID=">추천</a>
					</div>
				</div>
			</div>
		</div>
	</section>

	<div class="modal fade" id="registerModal" tabindex="-1" role="dialog"
		aria-labelledby="modal" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="modal">글쓰기</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-labbel="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="./postRegisterAction.jsp" method="post">
						<div class="form-row">
							<div class="form-group col-sm-6">
								<label>제목</label> <input type="text" name="postTitle"
									class="form-control" maxlength="40">
							</div>
							<div class="form-group col-sm-6">
								<label>게시판</label> <select name="typeName" class="form-control">
									<option value="WARM SPRING" selected>WARM SPRING</option>
									<option value="COOL SUMMER">COOL SUMMER</option>
									<option value="WARM AUTUMN">WARM AUTUMN</option>
									<option value="COOL WINTER">COOL WINTER</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label>내용</label>
							<textarea name="commentWriting" class="form-control"
								maxlength="2048" style="height: 180px;"></textarea>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">취소</button>
							<button type="submit" class="btn btn-primary">등록하기</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="reportModal" tabindex="-1" role="dialog"
		aria-labelledby="modal" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="modal">신고하기</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-labbel="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="./reportAction.jsp" method="post">
						<div class="form-row">
							<div class="form-group col">
								<label>제목</label> <input type="text" name="reportTitle"
									class="form-control" maxlength="40">
							</div>
						</div>
						<div class="form-group">
							<label>내용</label>
							<textarea name="reportWriting" class="form-control"
								maxlength="2048" style="height: 180px;"></textarea>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">취소</button>
							<button type="submit" class="btn btn-danger">신고하기</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
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