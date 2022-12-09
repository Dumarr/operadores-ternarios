public class ejemplo{
    public static void main(String[] args) {
        String nombre="";
        nombre="Dumar Malpica";
        int edad=20;

        System.out.printf("Hola %s",nombre+"\n");
        System.out.println("\n.........................................................");

        System.out.printf(edad>18 ? "%s tines %d años \n Eres mayor de edad":"%s tines %d años Eres menor de edad",nombre,edad);

        System.out.println("\n.........................................................");
        
        if (edad>=18) {
            System.out.printf("%s tienes %d años\n eres mayor de edad",nombre,edad);
           
        } else {  
            System.out.println("Eres menor de edad");
            
        }   
  
    }
  
}