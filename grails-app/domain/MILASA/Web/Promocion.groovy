package MILASA.Web
import MILASA.Productos.Sistema

class Promocion 
{
    String descripcion
    Date fechaInicio
    Date fechaFin
    
    static hasMany = [sistemas : Sistema]
    
    static mapping = { descripcion sqlType: 'VARCHAR(150)' }
    
    static constraints = 
    {
        
    }
}
