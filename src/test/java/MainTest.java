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
}
