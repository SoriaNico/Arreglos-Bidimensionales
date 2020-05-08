package arreglos.bidimensionales;

public class Matriz {

    public void armar() {
        int[][] arr = new int[4][];

        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[5];
        arr[3] = new int[2];

        arr[0][0] = 3;
        arr[0][1] = 6;
        arr[0][2] = 9;
        arr[0][3] = 12;

        arr[1][0] = 15;
        arr[1][1] = 18;
        arr[1][2] = 21;

        arr[2][0] = 24;
        arr[2][1] = 27;
        arr[2][2] = 30;
        arr[2][3] = 33;
        arr[2][4] = 36;

        arr[3][0] = 39;
        arr[3][1] = 42;

        for (int filas = 0; filas < arr.length; filas++) {
            for (int columnas = 0; columnas < arr[filas].length; columnas++) {
                System.out.print(arr[filas][columnas] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int filas = 0; filas < arr.length; filas++) {
            for (int columnas = 0; columnas < arr[filas].length; columnas++) {
                if (arr[filas][columnas] % 2 == 0) {
                    System.out.print(arr[filas][columnas] + " ");
                }
            }
            System.out.println();
        }
    }
}
