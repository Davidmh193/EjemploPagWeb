<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Clases.Clases"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu principal</title>
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
<table class="table table-dark table-striped">

	<%
	ArrayList<Clases> usuarios = (ArrayList<Clases>) request.getAttribute("usuarios");
	%>
	<%
	for(int i = 0; i<usuarios.size();i++){
        out.print("<tr>");
        out.print("<td>" + usuarios.get(i).getId() + "</td>");
        out.print("<td>" + usuarios.get(i).getNombre() + "</td>");
        out.print("<td><a class='btn btn-primary' href='/ProyectoWebPolideportivo/ModificarUsuarios?id=" + usuarios.get(i).getId() + "'>Modificar</a></td>");
        out.print("<td><a class='btn btn-danger' href='/ProyectoWebPolideportivo/EliminarUsuario?id=" + usuarios.get(i).getId() + "'>Eliminar</a></td>");
        out.print("</tr>");
        
    }
	%>
	
</table>
</body>
</html>