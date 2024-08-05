public class Matriz {

    public static void main(String[] args) {
        //declaración y inicialización
        int[][] matriz = {{1,4,5},{6,7,2},{8,3,8}};
        //recorrido de la matriz
        for (int fila = 0; fila < matriz.length; fila++) {  // reutilizar para recorrer filas de una matriz
            for (int columna = 0; columna < matriz[fila].length; columna++) { 
                System.out.print(matriz[fila][columna]+" ");  
            }                         
            System.out.println();

        }

        
        
    } 
}

    

