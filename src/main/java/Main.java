
import ru.netology.javaqa.javaqamvn.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int lower_limit = 200;
        // нижний предел
        int upper_limit = 400;
        // верхний предел
        int number = service.calcSqrt(lower_limit, upper_limit);

        System.out.println("Количество квадратов: " + number);
    }
}