public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 4);
        Square square1 = new Square(3);

        System.out.println("The length of rectangle1 is:  " + rectangle1.getLength());
        System.out.println("The width of rectangle1 is:  " + rectangle1.getWidth());
        System.out.println("The area of rectangle1 is: " + rectangle1.Area());



        System.out.println("The Side Length of square1 is:  " + square1.getSideLength());
        System.out.println("The Side length of square1 is: " + square1.getSideLength());
        System.out.println("The area of square1 is: " + square1.Area());

    }
}