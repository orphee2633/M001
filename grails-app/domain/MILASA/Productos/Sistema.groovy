package MILASA.Productos
import MILASA.Productos.TiposEspeciales.GeneracionProducto

class Sistema 
{
    String nombre
    String version
    String descripcion
    GeneracionProducto generacion
    
    static mapping =
    {
        nombre      sqlType: 'VARCHAR(20)'
        version     sqlType: 'VARCHAR(10)'
        descripcion sqlType: 'VARCHAR(255)'
    }
    
    static constraints = 
    {
        
    }
}
