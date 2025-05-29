public class ExploreInteger {

    public static void main(String[] args) {

        System.out.println(Integer.max(1, 5));
        System.out.println(Integer.min(23, 39));
        System.out.println(Integer.toBinaryString(11));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.bitCount(11));
        System.out.println(Integer.reverse(39));
        System.out.println(Integer.valueOf("10"));
        System.out.println(Integer.valueOf("121", 3));
        System.out.println("Max Value = " + Integer.MAX_VALUE
                            + "\nMin Value = " + Integer.MIN_VALUE
                            + "\nSize = " + Integer.SIZE
                            + "\nBytes = " + Integer.BYTES
                            + "\nType = " + Integer.TYPE);
    }
}
