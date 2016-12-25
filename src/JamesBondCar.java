/**
 * Created by Raos on 12/25/2016.
 */
public class JamesBondCar extends Car {

    @Override
    public int drive(int howlong) {
        int distance = 180 * howlong;

        System.out.println("Gotta Go Fasta!");

        return distance;
    }

}
