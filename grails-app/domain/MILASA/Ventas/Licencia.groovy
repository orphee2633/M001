package MILASA.Ventas
import MILASA.Productos.Sistema

class Licencia 
{
    Sistema sistema
    String serie
    String activacion
    String lote
    
    static mapping =
    {
        serie sqlType: 'VARCHAR(25)'
        activacion sqlType: 'VARCHAR(27)'
        lote sqlType: 'VARCHAR(30)'
    }
    
    static constraints = 
    {
        
    }
}
