<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.hysec.cas.dashboard.ssh2.*" %>
<%@ taglib prefix="spring"uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="img/favicon.png">

    <title><spring:message code="application.title"/></title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
	
    <!-- Wrap all page content here -->
    <div id="wrap">

      <!-- Fixed navbar -->
      <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><spring:message code="application.title"/></a>
          </div>
          <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
              <li><a href="index.jsp"><spring:message code="nav.menu.home"/></a></li>
              <li class="active"><a href="#about"><spring:message code="nav.menu.ssh"/></a></li>
            </ul>
            <ul class="nav navbar-nav pull-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle user-portrait-padding" data-toggle="dropdown"><img src="img/portrait.gif" alt="..." class="img-thumbnail user-portrait-img">&nbsp;&nbsp;User Name<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Profile</a></li>
						<li><a href="#">Password</a></li>
						<li><a href="#">Message</a></li>
						<li><a href="#">Sign Out</a></li>
					</ul>
				</li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>

	    <!-- Begin page content -->
	    <div class="container">
			<div class="row">
				<div class="col-sm-8">
					<img src="img/map.jpg" alt="..." class="img-thumbnail">
				</div>
				<!-- 
				<div class="col-sm-3">
					<div class="row">
	        			<div class="list-group">
							<div class="list-group-item active">
						    	<div class="input-group">
									<input type="text" class="form-control" placeholder="Search">
									<span class="input-group-addon">@</span>
								</div>
						  	</div>
						  	<a href="#" class="list-group-item">
						    	<div class="row">
						    		<div class="col-sm-3"><img src="img/portrait.gif" alt="..." class="img-thumbnail"></div>
						    		<div class="col-sm-6">
						    			<div class="row sensation-item-text">
						    				Item name
						    			</div>
						    			<div class="row sensation-item-text">
						    				<span>Latitude:99</span>
						    				<span>Longitude:99</span>
						    			</div>
						    		</div>
						    		<div class="col-sm-3">
						    			<button class="btn btn-primary btn-sm btn-block" type="button">Action</button>
						    		</div>
						    	</div>
						  	</a>
						  	<a href="#" class="list-group-item">
						    	<h4 class="list-group-item-heading">List group item heading</h4>
								<p class="list-group-item-text">...</p>
						  	</a>
						  	<a href="#" class="list-group-item">
						    	<h4 class="list-group-item-heading">List group item heading</h4>
								<p class="list-group-item-text">...</p>
						  	</a>
						  	<a href="#" class="list-group-item">
						    	<h4 class="list-group-item-heading">List group item heading</h4>
								<p class="list-group-item-text">...</p>
						  	</a>
						</div>
	        		</div>
				</div>
				 -->
				<div class="col-sm-4">
					<div clas="row">
						<div class="panel panel-default">
							<div class="panel-heading">
								<div class="input-group">
									<input type="text" class="form-control" placeholder="Search">
									<span class="input-group-addon">@</span>
								</div>
							</div>
						  	<div class="panel-body pre-scrollable">
						    	<div class="list-group">
								  	<a href="#" class="list-group-item">
								    	<div class="row">
								    		<div class="col-sm-3"><img src="img/portrait.gif" alt="..." class="img-thumbnail"></div>
								    		<div class="col-sm-6">
								    			<div class="row sensation-item-text">
								    				Item name
								    			</div>
								    			<div class="row sensation-item-text">
								    				<span>Latitude:99</span>
								    				<span>Longitude:99</span>
								    			</div>
								    		</div>
								    		<div class="col-sm-3">
								    			<button class="btn btn-primary btn-sm btn-block" type="button">Action</button>
								    		</div>
								    	</div>
								  	</a>
								  	<a href="#" class="list-group-item">
								    	<h4 class="list-group-item-heading">List group item heading</h4>
										<p class="list-group-item-text">...</p>
								  	</a>
								  	<a href="#" class="list-group-item">
								    	<h4 class="list-group-item-heading">List group item heading</h4>
										<p class="list-group-item-text">...</p>
								  	</a>
								  	<a href="#" class="list-group-item">
								    	<h4 class="list-group-item-heading">List group item heading</h4>
										<p class="list-group-item-text">...</p>
								  	</a>
						  	</div>
						</div>
					</div>
				</div>
				
			</div>
	    </div>
    </div>

    <div id="footer">
      <div class="container">
        <p class="text-muted credit">©2013 <a href="http://hysec.com"><spring:message code="footer.copyright"/></a></p>
      </div>
    </div>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    
    <script type="text/javascript">
   	$(document).ready(function() {
   		
   	});
    </script>
  </body>
</html>
