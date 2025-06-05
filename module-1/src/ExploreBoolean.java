public class ExploreBoolean {

    public static void main(String[] args) {

        boolean b = true;
        Boolean b1 = Boolean.valueOf(!b);
        Boolean b2 = Boolean.valueOf("0");
        boolean b3 = 9 > 5;

        System.out.println(Boolean.TYPE + " / " + b + " / " + b1 + " / " + b2 + " / " + b3);
        System.out.println(Boolean.logicalAnd(b3, b2));
        System.out.println(Boolean.logicalOr(b3, b2));
        System.out.println(Boolean.logicalXor(b3, b2));
    }
}
