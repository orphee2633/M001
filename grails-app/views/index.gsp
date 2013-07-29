<!DOCTYPE html>
<html lang="es">
  <head>
    <!-- Etiquetas meta con la descripcion de la pagina y el juego de caracteres -->
    <meta name="description" content="Distribuidor Master de CONTPAQi">
    <meta name="keywords" content="contabilidad, administracion, nominas, bancos, factura, electronica, facturacion, facturacion electronica, adminpaq, contpaq">
    <meta name="author" content="Arnoldo Iglesias Ramos 2013">
    <meta charset="UTF-8">
    <!-- Fin meta -->
    
    <!-- Estilos Visuales -->
    <link href="${resource(dir: 'css/bootstrap', file: 'bootstrap.css', absolute:true)}" rel="stylesheet" />
    <link href="${resource(dir: 'css/bootstrap', file: 'bootstrap-responsive.css', absolute:true)}" rel="stylesheet" />
    <link href="${resource(dir: 'css/custom', file: 'general.css', absolute:true)}" rel="stylesheet" />
    <link href="${resource(dir: 'css/custom', file: 'header.css', absolute:true)}" rel="stylesheet" />
    <link href="${resource(dir: 'css/custom', file: 'navigation.css', absolute:true)}" rel="stylesheet" />
    <!-- Fin Estilos Visuales -->
    
    <!-- Javascript -->
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
    <script src="${resource(dir:'js/bootstrap', file: 'bootstrap.js', absolute: true)}"></script>
    <!--[if lt IE 9]>
    <script src="${resource(dir: 'js/html5shiv', file: 'html5shiv.js', absolute: true)}"></script>
    <![endif]-->
    <!-- Fin Javascript -->
    
    <title>MILASA en l&iacute;nea</title>
  </head>
  <body>
    <!-- Page Wrapper -->    
    <div class="container">
      
      <!-- Render the header -->
      <g:render template="/layouts/Header" />
      
      <!-- Render the menu -->
      <g:render template="/layouts/Navigation" />
      
      <!-- Page Content -->
      <div class="container" id="pageContent">
        <div class="span4">
          <h2>Bienvenido a MILASA</h2>
          <p>Esto es un texto de prueba</p>
        </div>
      </div>
      <!-- end Page Content -->
      
      <!-- Page Footer -->
      <footer id="pageFooter">
        <h4>Ave. L&oacute;pez Mateos #4010 local 8 Tel. 6-11-43-87</h4>
      </footer>
      <!-- End Page Footer -->
      
    </div>
    <!-- end Page Wrapper -->
  </body>
</html>
