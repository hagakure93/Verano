public class Hexadecimales {
    public static void main(String[] args) {
        
        // Positivos desde 0 hasta 127 (solo los límites de cada combinación).
        byte num0 = 0x00;
        byte numP16 = 0x10;
        byte numP32 = 0x20;
        byte numP48 = 0x30;
        byte numP64 = 0x40;
        byte numP80 = 0x50;
        byte numP96 = 0x60;
        byte numP112 = 0x70;
        byte numP127 = 0x7F;
        System.out.println(num0);
        System.out.println(numP16);
        System.out.println(numP32);
        System.out.println(numP48);
        System.out.println(numP64);
        System.out.println(numP80);
        System.out.println(numP96);
        System.out.println(numP112);
        System.out.println(numP127);

        // Negativos desde -128 hasta -1 (solo los límites de cada combinación).
        byte numN128 = (byte) 0x80;
        byte numN112 = (byte) 0x90;
        byte numN96 = (byte) 0xA0;
        byte numN80 = (byte) 0xB0;
        byte numN64 = (byte) 0xC0;
        byte numN48 = (byte) 0xD0;
        byte numN32 = (byte) 0xE0;
        byte numN16 = (byte) 0xF0;
        byte numN1 = (byte) 0xFF;
        System.out.println(numN128);
        System.out.println(numN112);
        System.out.println(numN96);
        System.out.println(numN80);
        System.out.println(numN64);
        System.out.println(numN48);
        System.out.println(numN32);
        System.out.println(numN16);
        System.out.println(numN1);
    }
}
