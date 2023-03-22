<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modificar Usuarios</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>

<ul class="nav justify-content-end">
	<li class="nav-item">
     	<a class="nav-link active" aria-current="page" href="Menu">Menu</a>
 	 </li>
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="Insertar">Insertar</a>
  </li>
  <li class="nav-item">
    <a class="nav-link active" href="ModificarUsuarios">Modificar</a>
  </li>
  <li class="nav-item">
    <a class="nav-link disabled">Disabled</a>
  </li>
</ul>


<form method="POST" action="Modificar">
  <div class="mb-3" style="margin-left: 25px;">
    <label for="exampleInputUser1" class="form-label">Id</label>
    <input type="text" class="form-control" id="exampleInputUser1" aria-describedby="emailHelp" name="id">
  </div>
  <div class="mb-3" style="margin-left: 25px;">
    <label for="exampleInputPassword1" class="form-label">nombre</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="nombre">
  </div>
    <div class="mb-3" style="margin-left: 25px;">
    <label for="exampleInputPassword1" class="form-label">Dni</label>
    <input type="text" class="form-control" id="exampleInputPassword2" name="dni">
  </div>
    <div class="mb-3" style="margin-left: 25px;">
    <label for="exampleInputPassword1" class="form-label">Codigo</label>
    <input type="text" class="form-control" id="exampleInputPassword3" name="codigo">
  </div>
  <div class="mb-3" style="margin-left: 25px;">
    <label for="password" class="form-label">password</label>
    <input type="text" class="form-control" id="exampleInputPassword3" name="password">
  </div>
  <button type="submit" class="btn btn-primary" style="margin-left: 25px;">Guardar</button>
</form>


</body>
</html>