import java.util.Scanner;

public class App {
    
   public static void main(String[] args) {
    
      Scanner scanner= new Scanner(System.in);
      MetodosOrdenamiento metodos = new MetodosOrdenamiento();
    
      int opcion;
      int [] arregloNumeros= new int [0];
      do{
        System.out.println("\n Menu Principal");
        System.out.println("1. Ingrese un arreglo");
        System.out.println("2. Ordenar Arreglo");
        System.out.println("0. Salir");

        opcion= scanner.nextInt();

      switch (opcion) {
        case 1:
         System.out.println("Ingrese el tamaño de su arreglo");
         int tamano= scanner.nextInt();
         arregloNumeros = new int [tamano];
         for (int i=0; i<arregloNumeros.length;i++){
          System.out.println("Ingrese el valor para "+ (i+1) + "");
          arregloNumeros[i]= scanner.nextInt();
         }
         System.out.println("\nEl arreglo es");
         metodos.imprimir(arregloNumeros);
      
          break;
       case 2:
            // Sub Menu para escoger el metodo
          mostrarSubMenuMetodos(scanner, metodos, arregloNumeros);
           break;
       case 0:
         System.out.println("Saliendo del programa... \nAdios");
             break;

       default:
       System.out.println("Opcion no valida, Repita");
}
      } while (opcion!=0);

}

      public static void mostrarSubMenuMetodos(Scanner scanner, MetodosOrdenamiento metodos, int [] arreglo) {
        int opcionMetodo;
        do {
            System.out.println("\nEscoja un metodo de ordenamiento");
            System.out.println("1. Metodo Burbuja");
            System.out.println("2. Metodo Seleccion");
            System.out.println("3. Metodo Insercion");
            System.out.println("0. Regresar al menu principal");
            opcionMetodo= scanner.nextInt();

          switch (opcionMetodo) {
            case 1:
                metodos.sortByBubble(arreglo, false);
                System.out.println("\nSu arreglo ordenado por metodo de Burbuja es");
                metodos.imprimir(arreglo);
                break;

            case 2:
                 metodos.SelectionSort(arreglo);
                 System.out.println("\nSu arreglo ordenado por metodo de Seleccion es");
                 metodos.imprimir(arreglo);

            case 3:
                 metodos.insertionSort(arreglo);
                 System.out.println("\nSu arreglo ordenado por metodo de Insercion es");
                 metodos.imprimir(arreglo);
          
            default:
              break;
          }




        } while (opcionMetodo!=0); {
          
          
        
      }



    }
  }