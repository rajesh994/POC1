<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Log in with your account</title>
</head>

<body>



<!-- 	<form action="/login"  method="get"> -->


<!-- 		<div class="container" > -->
<!-- 			<label for="username"><b>username</b></label> <input type="text" -->
<!-- 				placeholder="Enter username" name="username" required/> <label -->
<!-- 				for="pwd"><b>Password</b></label> <input type="password" -->
<!-- 				placeholder="Enter Password" name="pwd" required/> -->
<!-- 		</div> -->
<!-- <!-- 			<button type="submit">Login</button> --> 
<!-- 	<input type="submit" value="login" /> -->
		
<!-- 	</form> -->
	
	<div class="container" style="margin:50px">
		<h3>Login Example</h3>
		<c:if test="${param.error ne null}">
			<div style="color: red">Invalid credentials.</div>
		</c:if>
		<form action="/login" method="GET">
			<div class="form-group">
				<label for="username">UserName: <input type="text"
					class="form-control" id="username" name="username">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" id="pwd" name="pwd">
			</div>

			<button type="submit" class="btn btn-success">Submit</button>

			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
	</div>
	
	
	
	<form action="/register" autocomplete="on" method="post">

		<p class="signin button" style="text-align: left">
			<input type="submit" value="Register" /> Click here to Register
		</p>
	</form>
</body>
</html>