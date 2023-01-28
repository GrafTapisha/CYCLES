
import ru.netology.javaqa.javaqamvn.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int lowerLimit = 100;
        // нижний предел
        int upperLimit = 100;
        // верхний предел
        int number = service.calcSqrt(lowerLimit, upperLimit);

        System.out.println("Количество квадратов: " + number);
    }
}