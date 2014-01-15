<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring"uri="http://www.springframework.org/tags"%>
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
    <div id="wrap" style="padding: 0 0 0px;">

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
              <li class="active"><a href="#"><spring:message code="nav.menu.home"/></a></li>
              <li><a href="ssh.html"><spring:message code="nav.menu.ssh"/></a></li>
            </ul>
            <ul class="nav navbar-nav pull-right">
               <li><a href="signin.html"><spring:message code="nav.menu.signin"/></a></li>
               <li><a href="signup.html"><spring:message code="nav.menu.signup"/></a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>

      <!-- Begin page content -->
      <div class="container">
        <div class="row">
        	<div class="col-md-4 col-md-offset-4">
    
    <div class="account-form thumbnail signup">
      <h1>Sign Up <br><small>Register your information</small></h1>

      <form accept-charset="UTF-8" action="/users" class="form-vertical" id="new_user" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="✓"><input name="authenticity_token" type="hidden" value="1GA/aZXj92pftEapPyb1KWXzzhQBHWdxcWru1V3EOG0="></div>


        
        <div class="control-group">
          <label class="control-label" for="user_name">Your Username</label>
          <div class="controls">
            <input class="focus" id="user_name" name="user[username]" placeholder="Username" size="30" type="username">
          </div>
        </div>
        <div class="control-group">
          <label class="control-label" for="user_email">Your Email</label>
          <div class="controls">
            <input class="focus" id="user_email" name="user[email]" placeholder="Email" size="30" type="email">
          </div>
        </div>
        <div class="control-group">
          <label class="control-label" for="user_password">Choose A Password</label>
          <div class="controls">
            <input autocomplete="off" id="user_password" name="user[password]" placeholder="Password" size="30" type="password">
          </div>
        </div>
        
        <hr>

        <div class="actions">
          <input class="btn btn-primary" data-disable-with="Signing in..." name="commit" type="submit" value="Create an Account">
        </div>
        
</form>    </div>
    
    <div class="account-extras">
      Already have an account? <a href="signin.html">Sign In</a>
    </div>
    
  </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
