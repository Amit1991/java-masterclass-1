public class ExploreDouble {

    public static void main(String[] args) {

        System.out.println("Max Value = " + Double.MAX_VALUE
                + "\nMin Value = " + Double.MIN_VALUE
                + "\nSize = " + Double.SIZE
                + "\nBytes = " + Double.BYTES
                + "\nType = " + Double.TYPE
                + "\nNaN = " + Double.NaN
                + "\nPrecision = " + Double.PRECISION
                + "\nPositive Infinity = " + Double.POSITIVE_INFINITY
                + "\nNegative Infinity = " + Double.NEGATIVE_INFINITY);

        System.out.println(Double.isFinite(0.22));
        System.out.println(Double.isFinite(10/3.0));
        System.out.println(Double.isFinite(Double.POSITIVE_INFINITY));
        System.out.println(Double.isNaN(Double.NaN));
        System.out.println(Double.isNaN(0.0/0.0));
        System.out.println(Double.isInfinite(Double.NEGATIVE_INFINITY));
        System.out.println(Double.isInfinite(17/7.0));

        System.out.println(1/0.0);
        System.out.println(-1/0.0);

        double d = 3.75;
        double d1 = 8.22d;
        double d2 = 8d;
        double d3 = Double.valueOf(3.715);
        double d4 = Double.parseDouble("22.15678");
        double d5 = 5/3;
        double d6 = 55/13.61;
        double d7 = Long.valueOf("33").doubleValue();
        double d8 = Integer.valueOf("94").doubleValue();
        double d9 = Float.valueOf("90.9").doubleValue();
        double d10 = Byte.valueOf("51").doubleValue();
        double d11 = Short.valueOf("173").doubleValue();

        System.out.println(d + " / " + d1 + " / " + d2 + " / " + d3 + " / " + d4
                            + " / " + d5 + " / " + d6 + " / " + d7 + " / " + d8
                            + " / " + d9 + " / " + d10 + " / " + d11);
    }
}
