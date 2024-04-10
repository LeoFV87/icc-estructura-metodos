public class MetodosOrdenamiento {
    
  // Metodo que devuelve un arreglo de enteros ordenados por Burbuja

  public int [] sortByBubble (int[] arreglo, boolean logs){
       //Codigo
       int tamano= arreglo.length;

       //Bucle externo que va a recorrer todo el arreglo
       for (int i=0; i<tamano;i++){
        //Bucle for interno que compara el elemento actual con el siguiente
          for (int j=i+1; j<tamano; j++){ 
            if (logs){
            System.out.println("i=" + arreglo[i]+ " j="+ arreglo[j]);
        }
         if (arreglo[i]>arreglo[j]){
            //Intercambiamos los elementos
            if (logs){
            System.out.println("\n - Si es mayor asi que cambio \n");
            }
            int temporal= arreglo[i];
            arreglo [i]= arreglo[j];
            arreglo[j]= temporal;

        if (logs){
            System.out.println("");
            imprimir(arreglo);
        }

         }
       }

    }

       return arreglo;
  }

   // Metodo que devuelve un arreglo de enteros ordenados por Seleccion

   public int [] SelectionSort (int[] arreglo){
    //Codigo
    int tamano = arreglo.length;

for (int i = 0; i < tamano - 1; i++) {
    int index_menor = i;

    for (int j = i + 1; j < tamano; j++) {
        if (arreglo[j] < arreglo[index_menor]) {
            index_menor = j;
        }
    }

    int aux = arreglo[index_menor];
    arreglo[index_menor] = arreglo[i];
    arreglo[i] = aux;
}

return arreglo;
}


   // Metodo que devuelve un arreglo de enteros ordenados por Burbuja

public int [] InsertionSort (int[] arreglo){
    //Codigo
    





    return arreglo;

    
}

public void imprimir (int[] arreglo){

    for (int i=0; i<arreglo.length; i++){
         System.out.print(arreglo[i] + "-");

    }
    System.out.println();
}




}
