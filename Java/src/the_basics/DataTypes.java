package the_basics;

public class DataTypes {
    static  void main(String[] args){
        byte ByteNumber = -128; //-128 to 127, size: 8bits
        short shortNumber = 1234; // size: 16bits
        int intNumber = 1024; // size: 32bits
        long longNumber = 12345657812345678L; //followed by L, size: 64bits

        System.out.println("Byte number: ");
        System.out.println(longNumber);

        float floatNumber = 1.23456781123456f; // Followed by f, 7 decimal places, size: 32bits
        double doubleNumber = 3.142454566745563456345111;// 16 decimal places, size: 64bits

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        boolean booleanValue = true;

        char character = 75;
        System.out.println(character);
        // Primitive DT begins with small letter while
        // Non-primitive DT begins with capital letter

    }
}
