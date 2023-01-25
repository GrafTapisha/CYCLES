import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200,400",
            "200,300",
            "110,820",
    })

    public void test(int lower_limit, int upper_limit) {
        SQRService service = new SQRService();

        int number = service.calcSqrt(lower_limit, upper_limit);

        System.out.println("Количество квадратов: " + number);
    }
}