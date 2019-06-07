import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Manual;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(SerenityRunner.class)
public class TestOfSerenity {

    int a = 5;

//    @Manual
    @Test
    public void test1() {
        Assert.assertTrue(a > 3);
    }

    @Test
    public void test2() {
        Assert.assertTrue(a > 6);
    }

    @Test
    public void test10() {

    }

    @Test
    public void test3() {

    }

    @Test
    public void test4() {


    }
}
