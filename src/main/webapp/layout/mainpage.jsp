<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style type="text/css">
* {
  box-sizing: border-box;
}

body {
  margin: 0;
}

header {
	text-align: center;

}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}

aside {
	float: left;

}

section {
	

}


</style>
</head>
<body>
	<header>
		<tiles:insertAttribute name="header" />
	</header>
	
	<div class="row">
		<aside>
			<tiles:insertAttribute name="sidebar" />
		</aside>
		<section>
			<tiles:insertAttribute name="body" />
		</section>
	</div>
</body>
</html>