<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Register</title>

        <!-- Bootstrap Core CSS -->
        <link href="<c:url value ="/style/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">

        <!-- MetisMenu CSS -->
        <link href="<c:url value ="/style/css/metisMenu.min.css"/>" type="text/css">

        <!-- Custom CSS -->
        <link href="<c:url value ="/style/css/startmin.css"/>" type="text/css">

        <!-- Custom Fonts -->
        <link href="<c:url value ="/style/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
        
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
                    <div class="login-panel panel panel-default" style="margin-top:50%;">
                        <div class="panel-heading">
                            <h3 class="panel-title">Register</h3>
                        </div>
                        <div class="panel-body">
                            <form role="form"  id="form-1" method="post" action="<%=request.getContextPath()%>/register" >
                               	    <c:if test="${alert != null}">
										<p class="alert alert-danger">${alert}</p>
									</c:if>
                                <fieldset>
                                   <div class="form-group" >                                       
                                        <input id="username" class="form-control" placeholder="User name" name="username" type="text" autofocus>
                                        <span  class="form-message" ></span>
                                    </div>
                                    <div class="form-group">
                                        <input id="email" class="form-control" placeholder="E-mail" name="email" type="email" autofocus>
                                        <span  class="form-message" ></span>
                                    </div>
                                    <div class="form-group">
                                        <input id="password" class="form-control" placeholder="Password" name="password" type="password" value="">
                                        <span  class="form-message" ></span>
                                    </div>
                                    <div class="form-group">
                                        <input id="repassword" class="form-control" placeholder="Re Password" name="repassword" type="password" value="">
                                        <span  class="form-message" ></span>
                                    </div>
                                    <button type="submit" class="btn btn-lg btn-success btn-block">Register</button>
                                    <br />
                                    <a href="<c:url value="/view/login.jsp"/>">Click here to login</a>
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- jQuery -->
        <script src="../js/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="../js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="../js/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="../js/startmin.js"></script>
        
        <script src="<c:url value ="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"/>"></script>
		<script src="<c:url value ="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"/>" type="text/javascript"></script>
	  
        <script>
        $().ready(function() {
        	$("#form-1").validate({
        		onfocusout: false,
        		onkeyup: false,
        		onclick: false,
        		rules: {
        			"username": {
        				required: true,
        				maxlength: 30,
        				minlength: 3
        			},
        			"email": {
        				required: true,
        				minlength: 5
        			},
        			"password": {
        				required: true,
        				maxlength: 30,
        				minlength: 8
        			},
        			"repassword": {
        				equalTo:"#password",
        				maxlength: 30,
        				minlength: 8
        			},
        		},
        		messages: {
        			"username": {
        				required: "Username is required",
        				maxlength: "Max 30 charater",
        				minlength: "Min 3 charater"
        			},
        			"email": {
        				required: "Email is required",
        				minlength: "Min 5 charater"
        			},
        			"password": {
        				required: "Password is required",
        				maxlength:"Max 30 charater",
        				minlength: "Min 8 charater"
        			},
        			"repassword": {
        				equalTo:"Password must common",
        				maxlength:"Max 30 charater",
        				minlength: "Min 8 charater"
        			},
        		}
        	});
        	
        });
        </script>

    </body>
</html>
