<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Bootstrap Core CSS -->
<link href="<c:url value ="/style/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">

<!-- MetisMenu CSS -->
<link href="<c:url value ="/style/css/metisMenu.min.css"/>" rel="stylesheet" type="text/css">

<!-- Custom CSS -->
<link href="<c:url value ="/style/css/startmin.css"/>" rel="stylesheet" type="text/css">

<!-- Custom Fonts -->
<link href="<c:url value ="/style/css/font-awesome.min.css"/>" rel="stylesheet"
	type="text/css">

<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search">
			<form action="search" method="POST">
				<div class="input-group custom-search-form">
					<input type="text" class="form-control" placeholder="Search..." name="title">
					<span class="input-group-btn">
						<button class="btn btn-primary" type="button">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div> <!-- /input-group -->

			</form>
				
			</li>
			<li><a href="content"><i class="fa fa-table fa-fw"></i>
					View Contents</a></li>
			<li><a href="addcontent.tiles"><i class="fa fa-edit fa-fw"></i> Form
					content</a></li>
		</ul>
	</div>
</div>	