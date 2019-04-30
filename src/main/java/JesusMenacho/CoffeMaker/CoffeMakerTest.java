package CoffeMaker;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeMakerTest {
    CoffeMaker coffeMaker=new CoffeMaker();
    @Test
    public void makeCaffe_pressButton_resultTrue() throws Exception {
        assert(coffeMaker.makecoffe(1,true,1));
    }
    @Test
    public void witoutPot_pressButton_resultFalse() throws Exception {
        assert(coffeMaker.makecoffe(1,false,1));
    }
    @Test
    public void witoutWaterOnTheBoiler_pressButton_resultFalse() throws Exception {
        assert(coffeMaker.makecoffe(1,true,1));
    }
    @Test
    public void witoutWaterOnTheBoilerAndwitoutPot_pressButton_resultFalse() throws Exception {
        assert(coffeMaker.makecoffe(1,false,1));
    }

}