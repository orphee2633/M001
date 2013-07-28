package MILASA.Ventas.Contacto

class Domicilio 
{
    String calle
    String colonia
    String noint
    String noext
    String ciudad
    String estado
    String pais
    
    static mapping =
    {
        calle sqlType: 'VARCHAR(100)'
        colonia sqlType: 'VARCHAR(100)'
        noint sqlType: 'VARCHAR(15)'
        noext sqlType: 'VARCHAR(15)'
        ciudad sqlType: 'VARCHAR(50)'
        estado sqlType: 'VARCHAR(50)'
        pais sqlType: 'VARCHAR(50)'
    }
    
    static constraints = 
    {
        
    }
}
