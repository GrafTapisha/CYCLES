import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.sqr.SQRService;

public class SQRServiceTest {
    @Test

    public void testExample() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testLowerLimit() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUpperLimit() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(9000, 10000);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativ() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(9000, 10000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}