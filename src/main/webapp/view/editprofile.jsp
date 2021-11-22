<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!-- Bootstrap Core CSS -->
        <link href="<c:url value ="/style/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">

        <!-- MetisMenu CSS -->
        <link href="<c:url value ="/style/css/metisMenu.min.css"/>" type="text/css">

        <!-- Custom CSS -->
        <link href="<c:url value ="/style/css/startmin.css"/>" type="text/css">

        <!-- Custom Fonts -->
        <link href="<c:url value ="/style/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
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
            <div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">Edit Profile</h1>
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    Profile Form Elements
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <form role="form" name="editprofile" id="editprofile" action="" >
                                                <div class="form-group">
                                                    <label>First Name</label>
                                                    <input class="form-control" placeholder="Enter the first name" name="firstname" id="firstname">
                                                </div>
                                                <div class="form-group">
                                                    <label>Last Name</label>
                                                    <input class="form-control" placeholder="Enter your last name" name="lastname" id="lastname">
                                                </div>
                                                <div class="form-group">
                                                    <label>Email</label>
                                                    <p class="form-control-static">email@example.com</p>
                                                </div>
                                                <div class="form-group">
                                                    <label>Phone</label>
                                                    <input class="form-control" placeholder="Enter your phone number" name="phone" id="phone">
                                                </div>
                                                <div class="form-group">
                                                    <label>Description</label>
                                                    <textarea class="form-control" rows="3" name="description" id="description"></textarea>
                                                </div>
                                                <button type="submit" class="btn btn-default">Submit Button</button>
                                                <button type="reset" class="btn btn-default">Reset Button</button>
                                            </form>
                                        </div>
                                        <!-- /.col-lg-6 (nested) -->
                                        <!-- /.col-lg-6 (nested) -->
                                    </div>
                                    <!-- /.row (nested) -->
                                </div>
                                <!-- /.panel-body -->
                            </div>
                            <!-- /.panel -->
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                </div>
                <!-- /.container-fluid -->
            </div>
            <!-- /#page-wrapper -->
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
        	$("#editprofile").validate({
        		onfocusout: false,
        		onkeyup: false,
        		onclick: false,
        		rules: {
        			"firstname": {
        				required: true,
        				maxlength: 30,
        				minlength: 3
        			},
        			"lastname": {
        				required: true,
        				minlength: 5
        			},
        			"phone": {
        				required: true,
        				maxlength: 13,
        				minlength: 9
        			},
        			"description": {
        				maxlength: 200
        			},
        		},
        		messages: {
        			"firstname": {
        				required: "First name is required",
        				maxlength: "Max 30 charater",
        				minlength: "Min 3 charater"
        			},
        			"lastname": {
        				required: "Last name is required",
        				minlength: "Min 5 charater"
        			},
        			"phone": {
        				required: "Phone is required",
        				maxlength:"Max 13 charater",
        				minlength: "Min 9 charater"
        			},
        			"description": {
        				maxlength:"Max 30 charater"
        			},
        		}
        	});
        	
        });
        </script> 