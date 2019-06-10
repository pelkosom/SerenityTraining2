import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestOfSerenity {

    private int a = 5;

    @Test
    public void test1() {
        Assert.assertTrue(a > 3);
    }
}
