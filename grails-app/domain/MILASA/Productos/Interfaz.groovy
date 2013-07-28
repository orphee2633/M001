package MILASA.Productos
import MILASA.Productos.TiposEspeciales.EstadoInterfaz
import MILASA.Ventas.Cliente

/**
 * Clase Interfaz
 */
class Interfaz 
{
    String nombre
    Date fechaInicio
    Date fechaTermino
    EstadoInterfaz estado
    
    static belongsTo = [cliente: Cliente]
    
    static mapping =
    {
        nombre sqlType: 'VARCHAR(20)'
    }
    
    static constraints = 
    {
        
    }
}
