package MILASA.Productos
import MILASA.Productos.TiposEspeciales.GeneracionProducto

class Sistema 
{
    String nombre
    String ultimaVersion
    String descripcion
    GeneracionProducto generacion
    
    static mapping =
    {
        nombre      sqlType: 'VARCHAR(20)'
        ultimaVersion     sqlType: 'VARCHAR(10)'
        descripcion sqlType: 'VARCHAR(255)'
    }
    
    static constraints = 
    {
        
    }
}
