import com.google.common.collect.ImmutableList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrimeFactorsTest{


    @Test
    public void of_1_isNone(){
        assertEquals(ImmutableList.of(), PrimeFactors.of(1));
    }

    @Test
    public void of_2_is2(){
        assertEquals(ImmutableList.of(2),PrimeFactors.of(2));
    }

    @Test
    public void of_3_is3(){
        assertEquals(ImmutableList.of(3),PrimeFactors.of(3));
    }

    @Test
    public void of_4_is4(){
        assertEquals(ImmutableList.of(2,2),PrimeFactors.of(4));
    }

    @Test
    public void of5_is5(){
        assertEquals(ImmutableList.of(2,3),PrimeFactors .of(6));
    }

    @Test
    public void of8_is8(){
        assertEquals(ImmutableList.of(2,2,2),PrimeFactors .of(8));
    }

    @Test
    public void of9_is9(){
        assertEquals(ImmutableList.of(3,3),PrimeFactors.of(9));
    }
    @Test
    public void of_acceptanceTest(){
        assertEquals(ImmutableList.of(2,2,2,3,3,5,7,11), PrimeFactors.of(2*2*2*3*3*5*7*11));
        assertEquals(ImmutableList.of(2,3,3,5,7,11,13,23), PrimeFactors.of(2*3*3*5*7*11*13*23));
    }
}