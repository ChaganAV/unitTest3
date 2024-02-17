import com.example.model.Calculation;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class IntervalTest {
    Calculation calc = new Calculation();
    @Test
    public void intervalLessTest(){
        assertThat(calc.interval(24)).isEqualTo(false);
    }

    @Test
    public void intervalMoreTest(){
        assertThat(calc.interval(101)).isEqualTo(false);
    }

    @Test
    public void intervalEqualTest(){
        assertThat(calc.interval(99)).isEqualTo(true);
    }
}
