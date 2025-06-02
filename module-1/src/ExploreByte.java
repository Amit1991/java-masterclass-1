public class ExploreByte {

    public static void main(String[] args) {

        System.out.println(Byte.parseByte("19"));
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.TYPE);
        System.out.println(Byte.valueOf("111"));
        System.out.println(Byte.decode(Integer.toHexString(7)));
    }
}
