public class ConversionNumber {
    public static void main(String[] args) {
        //Widening Casting (Auto)
        byte iniByte = 100;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        //Narrowing Casting (Manual)
        int valInt = 128;
        byte valByte = (byte)valInt;
    }
}
