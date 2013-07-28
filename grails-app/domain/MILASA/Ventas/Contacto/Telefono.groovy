package MILASA.Ventas.Contacto
import MILASA.Ventas.TiposEspeciales.TipoTelefono

class Telefono 
{
    String numero
    TipoTelefono tipo
    
    static mapping = { numero sqlType: 'VARCHAR(20)' }
    
    static constraints = 
    {
        
    }
}
