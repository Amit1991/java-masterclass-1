public class ExploreFloat {

    public static void main(String[] args) {

        float f = 3;
        float f1 = 7.9f;
        float f2 = Float.valueOf("2.3");
        float f3 = Float.parseFloat("7.856");
        System.out.println(f + " / " + f1 + " / " + f2 + " / " + f3);

        System.out.println("Max Value = " + Float.MAX_VALUE
                + "\nMin Value = " + Float.MIN_VALUE
                + "\nSize = " + Float.SIZE
                + "\nBytes = " + Float.BYTES
                + "\nType = " + Float.TYPE
                + "\nNaN = " + Float.NaN
                + "\nPrecision = " + Float.PRECISION
                + "\nPositive Infinity = " + Float.POSITIVE_INFINITY
                + "\nNegative Infinity = " + Float.NEGATIVE_INFINITY);

        System.out.println(Float.isFinite(0.22f));
        System.out.println(Float.isFinite(10/3f));
        System.out.println(Float.isFinite(Float.POSITIVE_INFINITY));
        System.out.println(Float.isNaN(Float.NaN));
        System.out.println(Float.isNaN(0.0f/0.0f));
        System.out.println(Float.isInfinite(Float.NEGATIVE_INFINITY));
        System.out.println(Float.isInfinite(17/7f));

        System.out.println(1/0.0f);
        System.out.println(-1/0.0f);
    }
}
