import ru.netology.sqr.SquareCalculator;

public class SQRService {

    public static void main(String[] args) {

        SquareCalculator service = new SquareCalculator();

        int floor = 200;
        int ceiling = 500;

        int squareCounter = service.calculate(floor, ceiling);
        System.out.println(squareCounter);
    }
}
