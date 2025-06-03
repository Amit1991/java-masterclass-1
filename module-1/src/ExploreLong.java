public class ExploreLong {

    public static void main(String[] args) {

        System.out.println("Max Value = " + Long.MAX_VALUE
                + "\nMin Value = " + Long.MIN_VALUE
                + "\nSize = " + Long.SIZE
                + "\nBytes = " + Long.BYTES
                + "\nType = " + Long.TYPE);

        long l = 1213141516171819L;
        Long lObj = 2122232425262728L;
        long l1 = Integer.valueOf(11).longValue();
        long l2 = Byte.valueOf("123").longValue();
        long l3 = Short.valueOf("12345").longValue();
        long l4 = Long.valueOf("1213141516171819101");
        long l5 = Long.parseLong("2122232425262728290");
        long l6 = Double.valueOf(123.456).longValue();
        long l7 = Double.valueOf(234.999).longValue();
        long l8 = Float.valueOf(345.456f).longValue();
        long l9 = Float.valueOf(456.999f).longValue();

        System.out.println(l + " / " + lObj + " / " + l1 + " / "
                            + l2 + " / " + l3 + " / " + l4 + " / " + l5 + " / "
                            + l6 + " / " + l7 + " / " + l8 + " / " + l9);
    }
}
