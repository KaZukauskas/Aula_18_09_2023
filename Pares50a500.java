public class Pares50a500 {
    
    public static void main(String[] args) {
        
        System.out.println("Pares de 50 a 500:");
        int cont = 50; 

        while (cont <= 500) {
            
            System.out.println(cont + " ");
            cont += 2;
        }

        System.out.print("\nDe novo...");

            for (cont = 50; cont <=500; cont = cont+=2){
            System.out.print(cont + " ");
        }
    }
}