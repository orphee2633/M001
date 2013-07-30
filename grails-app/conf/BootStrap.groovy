import MILASA.Productos.Sistema
class BootStrap {

    def init = { servletContext ->
        def testp = new Sistema()
        testp.nombre = "AdminPAQ"
        testp.ultimaVersion = "7.3.1"
        testp.descripcion = "Sistema para adminstracion empresarial con facturación electronica"
        testp.generacion = MILASA.Productos.TiposEspeciales.GeneracionProducto.compac
        testp.save(failOnError: true)
        
        def testp2 = new Sistema()
        testp2.nombre = "Contabilidad"
        testp2.ultimaVersion = "6.1.0"
        testp2.descripcion = "Sistema que le permite manejar la contabilidad de una manera facil y rapida"
        testp2.generacion = MILASA.Productos.TiposEspeciales.GeneracionProducto.CONTPAQi
        testp2.save(failOnError: true)
    }
    def destroy = {
    }
}
