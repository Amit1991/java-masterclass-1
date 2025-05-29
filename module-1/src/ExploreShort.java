public class ExploreShort {
    public static void main(String[] args) {

        System.out.println(Short.parseShort("10"));
        System.out.println(Short.valueOf("10"));
        System.out.println(Short.valueOf("121", 3));
        System.out.println("Max Value = " + Short.MAX_VALUE
                            + "\nMin Value = " + Short.MIN_VALUE
                            + "\nSize = " + Short.SIZE
                            + "\nBytes = " + Short.BYTES
                            + "\nType = " + Short.TYPE);

        short s = 10;
        Short sObj = 76;
        Short sObj2 = Short.valueOf("956");
        System.out.println(s + " " + sObj + " " + sObj2);
    }
}
