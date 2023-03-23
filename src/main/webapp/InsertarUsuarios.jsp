<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertar usuarios</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>
<ul class="nav justify-content-end"Style="background-color:grey;">
  <li class="nav-item">
     <a class="nav-link active" aria-current="page" href="Menu" Style="color: orange;">Menu</a>
  </li>
  
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="Insertar" Style="color: orange;">Insertar</a>
  </li>
  
  <li class="nav-item">
    <a class="nav-link active" href="ModificarUsuarios"  Style="color: orange;">Modificar</a>
  </li>
  <li class="nav-item">
    <a class="nav-link disabled">Disabled</a>
  </li>
</ul>
<form method="post" action="Insertar">
  <div class="mb-3" Style="margin-left:2%; with:20%; margin-top: 2%">
    <label for="exampleInputPassword1" class="form-label">Nombre</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="nombre">
  </div>
  <div class="mb-3" Style="margin-left:2%; with:20%;">
    <label for="exampleInputPassword1" class="form-label">Dni</label>
    <input type="text" class="form-control" id="exampleInputPassword2" name="dni">
  </div>
  <div class="mb-3" Style="margin-left:2%; with:20%;">
    <label for="exampleInputPassword1" class="form-label">Codigo</label>
    <input type="text" class="form-control" id="exampleInputPassword3" name="codigo">
  </div>
  <div class="mb-3" Style="margin-left:2%; with:20%;">
    <label for="exampleInputPassword1" class="form-label">password</label>
    <input type="password" class="form-control" id="exampleInputPassword3" name="password">
  </div>
  <div class="mb-3" Style="margin-left:2%; with:20%;">
    <label for="exampleInputPassword1" class="form-label">Fecha_login</label>
    <input type="Date" class="form-control" id="exampleInputPassword3" name="fecha_login">
  </div>
  <button type="submit" class="btn btn-primary"Style="margin-left:2%; with:50%;">Guardar</button>
</form>

</body>
</html>