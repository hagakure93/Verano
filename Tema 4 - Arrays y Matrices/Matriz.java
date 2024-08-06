public class Matriz {

    public static void main(String[] args) {
        //declaración y inicialización
        int[][] matriz = {{1,4,5},{6,7,2},{8,3,8}};
        //recorrido de la matriz
        for (int[] matriz1 : matriz) {
            // reutilizar para recorrer filas de una matriz
            for (int columna = 0; columna < matriz1.length; columna++) {
                System.out.print(matriz1[columna] + " ");                         
            }
            System.out.println();
        }

        
        
    } 
}

    

