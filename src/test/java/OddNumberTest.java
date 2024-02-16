import com.example.model.Calculation;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddNumberTest {
    Calculation calc = new Calculation();
    @Test
    public void oddNumber(){
        assertThat(calc.evenOddNumber(6)).isEqualTo(true);
    }
}
