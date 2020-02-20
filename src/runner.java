public class runner {
    public static void main(String[] args) {
        Car myCar = new Car("Bugatti", 1926, "Royale", 100);
        myCar.setMiles(500);

        System.out.println(myCar.toString());

        Rectangle myRectangle = new Rectangle(20, 20);

        System.out.println(myRectangle.toString());
    }
}