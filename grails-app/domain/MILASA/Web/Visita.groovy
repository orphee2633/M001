package MILASA.Web

class Visita 
{
    String ip
    String referencia
    String navegador
    Usuario usuario
    
    static mapping =
    {
        ip sqlType: 'VARCHAR(15)'
        referencia sqlType: 'VARCHAR(150)'
        navegador sqlType: 'VARCHAR(200)'
    }
    
    static constraints = 
    {
        
    }
}
