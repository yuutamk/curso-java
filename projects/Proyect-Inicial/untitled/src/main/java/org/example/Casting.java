package org.example;

public class Casting {
    public static void main(String[] args) {
        char c = 'z'; // conviertelo a int
        int i = 250; // conviertelo a long y luego de long a short
        double d = 301.067; // conviertelo a long
        /*int i = 100;  // súmale 5000.66 y conviertelo a float
        int i = 737; // multiplícalo por 100 y conviertelo a byte
        double d = 298.638; // divídelo entre 25 y conviertelo a long */

        // VARIABLE CHAR
        System.out.println("\t CONVERSION CHAR A INTEGER:\t");
        System.out.println("Tamaño var tipo CHAR bits :\t" + Character.SIZE+ "\tbits");
        System.out.println("Tamaño var tipo CHAR bytes:\t" + Character.BYTES + "\tbytes");
        /*System.out.println("informacion variables String/bits :\t" + + "\tbits");
        System.out.println("informacion variables String/bytes:\t" +  + "\tbytes");*/
        int ci = (int) c; // casting explicito
        System.out.println("Valor CHAR c:\t" + c);
        System.out.println("Char convertido a integer :\t" + ci + "\t-Valor Correspondiente a la tabla ASCII");

        // VARIABLE INTEGER
        long  iLong = i; // casting implicito
        short iShort  = (short) iLong ; // hay una estimacion o perdida de datos
        System.out.println("Tamaño var tipo INTEGER bits :\t" + Integer.SIZE + "\tbits");
        System.out.println("Tamaño var tipo INTEGER bytes:\t" + Integer.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo INTEGER Valor MAX :\t" + Integer.MAX_VALUE);
        System.out.println("Tamaño var tipo INTEGER Valor MIN :\t" + Integer.MIN_VALUE);
        // VARIABLE LONG
        System.out.println("\t CONVERSION A LONGER\t");
        System.out.println("\"Tamaño var LONGER bits :\t" + Long.SIZE + "\tbits");
        System.out.println("\"Tamaño var LONGER bytes :\t" + Long.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo LONGER Valor MAX :\t" + Long.MAX_VALUE);
        System.out.println("Tamaño var tipo LONGER Valor MIN :\t" + Long.MIN_VALUE);
        System.out.println("Viendo la var iLong :\t" + iLong );
        // VARIABLE SHORT
        System.out.println("\t CONVERSION A SHORT:\t");
        System.out.println("\"Tamaño var SHORT bits :\t" + Short.SIZE + "\tbits");
        System.out.println("\"Tamaño var SHORT bytes :\t" + Short.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo SHORT Valor MAX :\t" + Short.MAX_VALUE);
        System.out.println("Tamaño var tipo SHORT Valor MIN :\t" + Short.MIN_VALUE);
        System.out.println("Viendo la var iShort :\t" + iShort);
        // VARIABLE DOUBLE
        System.out.println("\t CONVERSION DOUBLE a LONG:\t");
        long dLong = (long) d; // casting explicito debido a la perdida de memoria
        System.out.println("\"Tamaño var DOUBLE bits :\t" + Double.SIZE + "\tbits");
        System.out.println("\"Tamaño var DOUBLE bytes :\t" + Double.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo DOUBLE Valor MAX :\t" + Double.MAX_VALUE);
        System.out.println("Tamaño var tipo DOUBLE Valor MIN :\t" + Double.MIN_VALUE);
        System.out.println("Viendo la var dLong :\t" + dLong);
        // VARIABLE FLOAT
        System.out.println("\t CONVERSION INTEGER A FLOAT:\t");
        i = 100;
        float iFloat = (float) (i+5000.66);
        System.out.println("\"Tamaño var FLOAT bits :\t" + Float.SIZE + "\tbits");
        System.out.println("\"Tamaño var FLOAT bytes :\t" + Float.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo FLOAT Valor MAX :\t" + Float.MAX_VALUE);
        System.out.println("Tamaño var tipo FLOAT Valor MIN :\t" + Float.MIN_VALUE);
        System.out.println("resultado de i + 5000.66 :\t" + (i+5000.66) );
        System.out.println("Viendo la var iFloat :\t" + iFloat);
        // VARIABLE BYTE
        i *= 737;
        byte iByte = (byte) i;
        System.out.println("\t CONVERSION INTEGER A BYTE:\t");
        System.out.println("\"Tamaño var BYTE bits :\t" + Byte.SIZE + "\tbits");
        System.out.println("\"Tamaño var BYTE bytes :\t" + Byte.BYTES + "\tbytes");
        System.out.println("Tamaño var tipo BYTE Valor MAX :\t" + Byte.MAX_VALUE);
        System.out.println("Tamaño var tipo BYTE Valor MIN :\t" + Byte.MIN_VALUE);
        System.out.println("Resultado de i*737 :\t" + i);
        System.out.println("Viendo la var iByte :\t" + iByte);
        // Ultima parte
        System.out.println("\t CONVERSION DOUBLE A LONG :\t");
        d = 298.638;
        long dLong2 = (long) (d/25);
        System.out.println("Resultado de d/25 :\t" + (d/25));
        System.out.println("Viendo la var dLong2 :\t" + dLong2);
    }
}

