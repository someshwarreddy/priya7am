public class PrimitiveBinaryUtil {

    public static void printByte(byte b) {
        System.out.println("byte: " + b + " -> " + String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', ' '));
    }

    public static void printShort(short s) {
        System.out.println("short: " + s + " -> " + String.format("%16s", Integer.toBinaryString(s & 0xFFFF)).replace(' ', ' '));
    }

    public static void printInt(int i) {
        System.out.println("int: " + i + " -> " + String.format("%32s", Integer.toBinaryString(i)).replace(' ', ' '));
    }

    public static void printLong(long l) {
        System.out.println("long: " + l + " -> " + String.format("%64s", Long.toBinaryString(l)).replace(' ', ' '));
    }

    public static void printChar(char c) {
        System.out.println("char: '" + c + "' (" + (int) c + ") -> " + String.format("%16s", Integer.toBinaryString(c)).replace(' ', '0'));
    }

    public static void printBoolean(boolean b) {
        System.out.println("boolean: " + b + " -> " + (b ? "1" : "0") + " (not stored as binary in code)");
    }

    public static void printFloat(float f) {
        int bits = Float.floatToIntBits(f);
        System.out.println("float: " + f + " -> " + String.format("%32s", Integer.toBinaryString(bits)).replace(' ', '0') + " (IEEE 754)");
    }

    public static void printDouble(double d) {
        long bits = Double.doubleToLongBits(d);
        System.out.println("double: " + d + " -> " + String.format("%64s", Long.toBinaryString(bits)).replace(' ', '0') + " (IEEE 754)");
    }

    public static void main(String[] args) {
        printByte((byte) -5);
        printShort((short) -12345);
        printInt(-123456);
        printLong(-123456789L);
        printChar('A');
        printBoolean(true);
        printFloat(3.14f);
        printDouble(-123.456);
    }
}

