

import com.example.model.Calculation;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;



public class EvenNumberTest {

    Calculation calc = new Calculation();
    @Test
    public void eventNumberTest(){

        assertThat(calc.evenOddNumber(3)).isEqualTo(false);
    }

    @Test
    public void nullNumberTest(){
        assertThat(calc.evenOddNumber(0)).isEqualTo(true);
    }

    @Test
    public void oddNumber(){
        assertThat(calc.evenOddNumber(6)).isEqualTo(true);
    }
}
