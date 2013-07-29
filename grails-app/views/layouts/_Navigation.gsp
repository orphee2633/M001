<!-- Page Navigation -->
<%@ page import="MILASA.Productos.Sistema" %>
<nav class="navbar navbar-inverse">
  <div class="navbar-inner">
    <ul class="nav">
      <li class="active"><a href="#">Inicio</a></li>
      <li class="divider-vertical"></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Productos</a>
        <ul class="dropdown-menu">
          <g:render template="/layouts/Sistemas" collection="${Sistema.list()}" />
        </ul>
      </li>
      <li class="divider-vertical"></li>
      <li><a href="#">Desarrollos</a></li>
      <li class="divider-vertical"></li>
      <li><a href="#">Preguntas Frecuentes</a></li>
      <li class="divider-vertical"></li>
    </ul>
    <ul class="nav pull-right">
      <g:render template="/layouts/Sesion" />
    </ul>
  </div>
</nav>
<!-- end Page Navigation -->
