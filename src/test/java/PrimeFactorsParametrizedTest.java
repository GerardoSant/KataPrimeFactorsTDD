import com.google.common.collect.ImmutableList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(org.junit.runners.Parameterized.class)
public class PrimeFactorsParametrizedTest {

    private final int number;
    private final Integer[] numbers;

    public PrimeFactorsParametrizedTest(int number, Integer[] numbers) {
        this.number = number;
        this.numbers = numbers;
    }

    @Test
    public void execute(){
        assertThat(PrimeFactors.of(number)).isEqualTo(Arrays.asList(numbers));
    }

    @Parameterized.Parameters
    public static Object[][] cases(){
        return new Object[][]{
                {1,new Integer[]{}},
                {2,new Integer[]{2}},
                {3,new Integer[]{3}},
                {4,new Integer[]{2,2}},
                {6,new Integer[]{2,3}},
                {8,new Integer[]{2,2,2}},
                {9,new Integer[]{3,3}},
        };
    }


}
