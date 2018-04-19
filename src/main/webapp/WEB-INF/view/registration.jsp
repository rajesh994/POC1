<%-- #<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
#<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

 --%>

<!DOCTYPE html>
<html lang="en">
<head>Registration
</head>

<body>

	

	<form action="/save" autocomplete="on" method="get">


		<h1>Sign Up</h1>
		<p>
			<label for="username" class="username">Username</label> <input
				id="username" name="username" required="required" type="text" />
		</p>

		<p>
			<label for="pwd" class="pwd">Your password </label> <input id="pwd"
				name="pwd" required="required" type="password" />
		</p>
		<p class="signin button">
			<input type="submit" value="Sign up" />
		</p>
	</form>
</body>
</html>