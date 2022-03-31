public class W08dot1 {

    public static void main(String[] args) {
	// This program has a class rectangle that it uses to create two rectangle instances and displays their width, height, area and perimeter
        System.out.println("This program creates two rectangle objects and displays their width, height, area and perimeter.");

        //variables for first rectangle
        double rectangle1Height = 4;
        double rectangle1Width = 40;

        //variable for second rectangle
        double rectangle2Height = 3.5;
        double rectangle2Width = 5;

        //Creates a rectangle object but uses setters to set height and width
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHeight(rectangle1Height);
        rectangle1.setWidth(rectangle1Width);

        //Creates a rectangle object using parameters
        Rectangle rectangle2 = new Rectangle(rectangle2Width, rectangle2Height);

        //Displays first rectangle and info to the user
        System.out.println("\nRectangle 1:");
        System.out.printf("height = %.2f\n", rectangle1.getHeight() );
        System.out.printf("width = %.2f\n", rectangle1.getWidth());
        System.out.printf("area = %.2f\n", rectangle1.getArea());
        System.out.printf("perimeter = %.2f\n", rectangle1.getPerimeter());

        //Displays second rectangle and info to the user
        System.out.println("\nRectangle 2:");
        System.out.printf("height = %.2f\n", rectangle2.getHeight() );
        System.out.printf("width = %.2f\n", rectangle2.getWidth());
        System.out.printf("area = %.2f\n", rectangle2.getArea());
        System.out.printf("perimeter = %.2f\n", rectangle2.getPerimeter());

        System.out.println("\nGoodbye ...");
    }
}
