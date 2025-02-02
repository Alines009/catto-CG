import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void demoTestMethod() throws InterruptedException{
        Assert.assertEquals(7, Main.add(5,2));
    }
    @Test
    public void demoMulMethod() {
        Assert.assertEquals(15, Main.mul(3,5));
    }

    @Test
    public void demoDivMethod() {
        Assert.assertEquals(2, Main.div(4,2));
    }

    @Test
    public void demoDiv2Method() {
        Assert.assertEquals(2, Main.div(6,3));
    }
}
