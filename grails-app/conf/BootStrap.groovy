import MILASA.Productos.Sistema
class BootStrap {

    def init = { servletContext ->
        def testp = new Sistema()
        testp.nombre = "AdminPAQ"
        testp.ultimaVersion = "7.3.1"
        testp.descripcion = "Sistema para adminstracion empresarial con facturación electronica"
        testp.generacion = MILASA.Productos.TiposEspeciales.GeneracionProducto.compac
        testp.save(failOnError: true)
    }
    def destroy = {
    }
}
