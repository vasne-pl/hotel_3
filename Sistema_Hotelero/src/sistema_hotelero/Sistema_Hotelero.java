package sistema_hotelero;

public abstract class Sistema_Hotelero {
    
   
    public abstract void tipo_de_habitacion();
    public abstract void valor_de_noche();
    public abstract void equipamento();
    
    protected void servicios(){
        
        System.out.println("Ofrecemos los siguientes servicios");
        System.out.println("    1. Servicio de desayuno.");
        System.out.println("    2. Servicio de lavanderia.");
        System.out.println("    3. Servicio de internet.");
        System.out.println("    4. Servicio de limpieza de habitacion.");
        System.out.println("    5. Servicio de transporte.");
        System.out.println("    6. Servicio de piscina.");
        System.out.println("    7. Servicio de gimnasio.");
        
    }

}