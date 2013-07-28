package MILASA.Ventas
import MILASA.Ventas.Contacto.Domicilio
import MILASA.Ventas.Contacto.Telefono
import MILASA.Ventas.Licencia
import MILASA.Web.Usuario

class Cliente 
{
    String razonSocial
    String rfc
    Domicilio direccion
    Usuario usuario
    
    static hasMany = [telefonos : Telefono, licencias : Licencia]
    
    static mapping = 
    {
        razonSocial sqlType: 'VARCHAR(150)'
        rfc sqlType: 'VARCHAR(15)'
    }
    
    static constraints = 
    {
        
    }
}
