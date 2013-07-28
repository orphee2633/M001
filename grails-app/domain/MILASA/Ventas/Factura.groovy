package MILASA.Ventas

class Factura 
{
    Cliente cliente
    
    Date fecha
    String referencia
    
    static mapping =
    {
        referencia sqlType: 'VARCHAR(150)'
    }
    
    static constraints = 
    {
        
    }
}
