public class Datatypes{
    public static void main(String[] args) {
        char a = 'P'; // 2 Bytes (16 bits)  ->  Unicode system not the ASCII code System
        int num = 21; //4 bytes ( 32 bits )
        byte b = 4;//  1 byte (8 bits)
        short c = 1234 ;  // 2 bytes (16 bits)
        long d = 1234567890L; // 8 bytes (64 bits)
        float e = 45.67f; // 4 bytes (32 bits)
        double f = 45.67; // 8 bytes (64 bits)
        boolean g = true; // 1 byte (8 bits)
        System.out.println("char: "+a);
        System.out.println("int: "+num);
        System.out.println("byte: "+b);
        System.out.println("short: "+c);
        System.out.println("long: "+d);
        System.out.println("float: "+e);
        System.out.println("double: "+f);
        System.out.println("boolean: "+g);
        
        
    }
}