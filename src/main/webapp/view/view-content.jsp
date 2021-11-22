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

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

	
	 <div id="page-wrapper">
	 <form class="content" action="${pageContext.request.contextPath}/content"
									method="post">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">View Content</h1>
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                    
                    <div class="row">
                        <div class="col-lg-15">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    View content list
                                </div>
                                <!-- /.panel-heading -->
                                <div class="panel-body">
                                    <div class="table-responsive">
                                        <table class="table table-striped table-bordered table-hover">
                                            <thead>
                                                <tr>
                                                    <th>#</th>
                                                    <th>Title</th>
                                                    <th>Brief</th>
                                                    <th>Created date</th>
                                                    <th>Actions</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                              <c:forEach var="row" items="${list}">
                                              	<tr>
                                              		<td>${row.cid }</td>
                                              		<td>${row.tittle}</td>
                                              		<td>${row.brief1}</td>
                                              		<td>${row.createdate1}</td>
                                              		<td><a href="showeditcontent?nid=<c:out value='${row.cid}'/>">Sửa</a>
						   						  &nbsp; <a href="deletecontent?nid=<c:out value='${row.cid}'/>">Xóa</a></td>
                                              		
                                              	</tr>
                                              
                                              </c:forEach> 
                                                
                                                
                                            </tbody>
                                        </table>
                                    </div>
                                    <!-- /.table-responsive -->
                                </div>
                                <!-- /.panel-body -->
                            </div>
                            <!-- /.panel -->
                        </div>
                        <!-- /.col-lg-6 -->
                        
                   
                     
                    </div>
                   
                </div>
                <!-- /.container-fluid -->
                </form>
            </div>
              <!-- jQuery -->
        <script src="<c:url value ="/style/js/jquery.min.js"/>"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="<c:url value ="/style/js/bootstrap.min.js"/>"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="<c:url value ="/style/js/metisMenu.min.js"/>"></script>

        <!-- DataTables JavaScript -->
        <script src="<c:url value ="/style/js/dataTables/jquery.dataTables.min.js"/>"></script>
        <script src="<c:url value ="/style/js/dataTables/dataTables.bootstrap.min.js"/>"></script>

        <!-- Custom Theme JavaScript -->
        <script src="<c:url value ="/style/js/startmin.js"/>"></script>

        <!-- Page-Level Demo Scripts - Tables - Use for reference -->
        <script>
            $(document).ready(function() {
                $('#dataTables-example').DataTable({
                        responsive: true
                });
            });
            
        </script>
