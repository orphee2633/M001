<!-- Page Navigation -->
<%@ page import="MILASA.Productos.Sistema" %>
<nav id="pageNavigation" class="navbar navbar-inverse">
  <div class="navbar-inner">
    <ul class="nav">
      <li class="active"><a href="#"><g:message code="MILASA.Navigation.Home" /></a></li>
      <li class="divider-vertical"></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><g:message code="MILASA.Navigation.Products" /></a>
        <ul class="dropdown-menu">
          <g:render template="/layouts/Sistemas" collection="${Sistema.list()}" />
        </ul>
      </li>
      <li class="divider-vertical"></li>
      <li><a href="#"><g:message code="MILASA.Navigation.Development" /></a></li>
      <li class="divider-vertical"></li>
      <li><a href="#"><g:message code="MILASA.Navigation.Contact" /></a></li>
      <li class="divider-vertical"></li>
      <li><a href="#"><g:message code="MILASA.Navigation.FAQ" /></a></li>
      <li class="divider-vertical"></li>
    </ul>
    <ul class="nav pull-right">
      <g:render template="/layouts/Sesion" />
    </ul>
  </div>
</nav>
<!-- end Page Navigation -->
