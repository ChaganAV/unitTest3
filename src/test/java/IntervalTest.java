import com.example.model.Calculation;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * метод, который проверяет, попадает ли переданное число в интервал (25;100)
 * и возвращает true, если попадает и false - если нет
 */
public class IntervalTest {
    Calculation calc = new Calculation();

    /**
     * проверка, если меньше
     */
    @Test
    public void intervalLessTest(){
        assertThat(calc.interval(24)).isEqualTo(false);
    }

    /**
     * проверка, если больше
     */
    @Test
    public void intervalMoreTest(){
        assertThat(calc.interval(101)).isEqualTo(false);
    }

    /**
     * проверка, если входит в интервал
     */
    @Test
    public void intervalEqualTest(){
        assertThat(calc.interval(99)).isEqualTo(true);
    }
}
