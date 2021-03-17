package Lecciones;

public class DataTypes_1 {


    public void test() {


        // Partes de una variable:

        int test = 1;

        //  ^^^  ^^^   ^^^
        //	 |	  |     |
        //  tipo  |     |
        //identificador |
        //             valor

        // Las variables pueden declararse e inicializarse (darles valor) por separado:

        int testInit;

        testInit = 1;

        //Tipos primitivos (Tipos básicos)

        //Numéricos enteros:

        byte peque = 127; //De -128 a 127 (1 byte)

        short bigPeque = 32767; //De −32768 a 32767 (2 bytes)

        int medio = 2147483647; //De −2,147,483,648 to 2,147,483,647 (4 bytes)

        long grande = 9223372036854775807L; //-9223372036854775808 to 9223372036854755807 (8 bytes)


        //Decimales:

        float comita = 3.4F; // 3.4e−038 to 3.4e+038 (4 bytes)

        double comitaLonga = 3.4444444444; // 1.7e−308 to 1.7e+038 (8 bytes)


        //Character

        char caracter = 'a'; //Contienen un solo caracter

        //Boolean

        boolean siNo = true;


        //Tipos No primitivos (Clases, interfaces y Arrays)

        // String es un wrapper (Una clase "envoltorio") que permite trabajar con mas de un char en una sola variable.

        String testString = "Lorem Ipsum"; // Contienen uno o mas caracteres


        // Los arrays se utilizan para crear matrices que contengan varios valores ordenados. Su tamaño se decide en el momento de la inicialización ( = new type[x]) y es invariable.

        int[] a = new int[5];
        /*   |  | |    |   |  |
         *Tipo  | |    |   |  |
         *  Array |    |   |  |
         *   Nombre    |   |  |
         *   Nuevo objeto  |  |
         *   Tipo del objeto  |
         *       Tamaño del array
         * */

        // Para dar valor o recuperar el valor de una posisción concreta del array, ponemos en el corchete la posición concreta, de 0 a n-1 (siendo n el tamaño del array)

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        System.out.println(a[0]); // Imprime por pantalla el valor de la posición 0 del array a, en este caso 1.


    }

}