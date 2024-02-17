

import com.example.model.Calculation;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;


/**
 * Метод проверяет, является ли целое число записанное в переменную n,
 * чётным (true) либо нечётным (false).
 */
public class EvenNumberTest {

    Calculation calc = new Calculation();

    /**
     * проверка на четное
     */
    @Test
    public void evenNumberTest(){

        assertThat(calc.evenOddNumber(3)).isEqualTo(false);
    }

    /**
     * проверка на четное
     */
    @Test
    public void nullNumberTest(){
        assertThat(calc.evenOddNumber(0)).isEqualTo(true);
    }

    /**
     * проверка на нечетное
     */
    @Test
    public void oddNumber(){
        assertThat(calc.evenOddNumber(6)).isEqualTo(true);
    }
}
