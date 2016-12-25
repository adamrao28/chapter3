/**
 * Created by Raos on 12/25/2016.
 */
public class CarOwner {

    public static void main(String[] args) {
        Car car = new Car();

        int dist = car.drive(20);

        System.out.println("dist: " + dist);

        JamesBondCar car2 = new JamesBondCar();

        int dist2 = car2.drive(20);

        System.out.println("dist2: " + dist2);
    }

}
