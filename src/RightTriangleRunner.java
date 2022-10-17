public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle triangle1 = new RightTriangle(3, 4);
        RightTriangle triangle2 = new RightTriangle(6.5, 10.7);
        RightTriangle triangle3 = new RightTriangle(100, 100);
        double t1Hypotenuse = triangle1.hypotenuse();
        double t2Hypotenuse = triangle2.hypotenuse();
        System.out.println(t1Hypotenuse);
        System.out.println(t2Hypotenuse);
        System.out.println(triangle3.hypotenuse());
    }
}
