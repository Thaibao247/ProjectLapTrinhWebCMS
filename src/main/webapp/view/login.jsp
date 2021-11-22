<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Login</title>

<!-- Bootstrap Core CSS -->
<link href="<c:url value ="/style/css/bootstrap.min.css"/>"
	rel="stylesheet" type="text/css">

<!-- MetisMenu CSS -->
<link href="<c:url value ="/style/css/metisMenu.min.css"/>"
	type="text/css">

<!-- Custom CSS -->
<link href="<c:url value ="/style/css/startmin.css"/>" type="text/css">

<!-- Custom Fonts -->
<link href="<c:url value ="/style/css/font-awesome.min.css"/>"
	rel="stylesheet" type="text/css">
        <link href="<c:url value ="/style/css/validate.css"/>" rel="stylesheet" type="text/css">
       
	  <style>
		label.error{
			color: red;
		}
	    </style>
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Please Sign In</h3>
					</div>
					<div class="panel-body">
						<form  id="login"
							action="${pageContext.request.contextPath}/login" method="post">
							<c:if test="${alert != null}">
								<p class="alert alert-danger">${alert}</p>
							</c:if>

							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="E-Mail" name ="email" id = "email"
										 type="email" autofocus>
										
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Password" name="password" id="password"
										 type="password" value="">
										
								</div>
								<div class="checkbox">
									<label> <input name="remember" type="checkbox"
										value="Remember Me">Remember Me
									</label>
								</div>
								<!-- Change this to a button or input when using this as a form -->
								<button type="submit" class="btn btn-lg btn-success btn-block" value ="login">Login</button>
								<br /> 
								<a href="<c:url value ="/view/register.jsp"/>">Click here to register</a>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- jQuery -->
	 <script src="<c:url value ="/style/js/jquery.min.js"/>"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<c:url value ="/style/js/bootstrap.min.js"/>"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="<c:url value ="/style/js/metisMenu.min.js"/>"></script>

	<!-- Custom Theme JavaScript -->
	<script src="<c:url value ="/style/js/startmin.js"/>"></script>
	<script src="<c:url value ="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"/>"></script>
	<script src="<c:url value ="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"/>" type="text/javascript"></script>
	  
	    
	  
        <script>
        $().ready(function() {
        	$("#login").validate({
        		onfocusout: false,
        		onkeyup: false,
        		onclick: false,
        		rules: {
        			"email": {
        				required: true,
        				maxlength: 50,
        				minlength: 5
        			},
        			"password": {
        				required: true,
        				maxlength: 50,
        				minlength: 8
        			},
        		},
        		messages: {
        			"email": {
        				required: "Email is required",
        				maxlength: "Max 50 character",
        				minlength: "Min 5 character"
        			},
        			"password": {
        				required: "Password is required",
        				maxlength:"Max 50 character",
        				minlength: "Min 8 character"
        			},
        		}
        	});
        	
        });
        </script>

</body>
</html>
