public class NotPrimitive {
    public static void main(String[] args) {
        //Not Primitive data type
        Byte iniByte = 127;
        Short iniShort = 10000;
        Integer iniInt; // Default value "null"
        Integer iniInteger = 100000000;
        Long iniLong = 100000000000L;
        Character iniCharacter = 'A';
        Float iniFloat = 3.14F;
        Double iniDouble = 3.000112;

        //Conversion primitive 
        Byte valByte = 27;
        byte valBytePrimitive = valByte;

        int valInt = 423;
        Integer valIntegerNotPrimitive = valInt;

        //Conversion primitive to other types
        Byte age = 19;
        byte objByteAge = age;
        short objShortAge = age.shortValue();
        int objIntAge = age.intValue();
        long objLongAge = age.longValue();
    }
}
