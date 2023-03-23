<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN ADMIN</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>

<body>
<form method="post" action="Login" Style="with=30px;">
  <div class="mb-3"style="margin-left: 35%;margin-top: 300px;">
    <label for="exampleInputUser1" class="form-label">Usuario</label>
    <input type="text" class="form-control" id="exampleInputUser1" aria-describedby="emailHelp" name="User">
    
  </div>
  <div class="mb-3"style="margin-left: 35%;">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password">
  </div>
 
  <button type="submit" class="btn btn-primary"style="margin-left: 35%;">Submit</button>
</form>
</body>
</html>