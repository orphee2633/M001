package MILASA.Productos

class ProductoController {

    def index() { }
    
    /* Lista los productos de MILASA*/
    def list()
    {
        /* por GET obtenemos productCategory, 1 = Sistemas, 2 = Interfaces*/
        def tipo = param.productCategory.equals(null) ? 1 : param.productCategory
        
        if(tipo == 1)
            redirect(controller:"Producto", action:"listSistemas" )
    }
}
