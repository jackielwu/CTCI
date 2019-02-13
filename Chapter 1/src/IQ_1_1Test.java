import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public final class IQ_1_1Test {
    private IQ_1_1 problem;

    @BeforeMethod
    public void setUp() {
        problem = new IQ_1_1();
    }

    @Test
    public void abcd() {
        String s = "abcd";
        final boolean expected = true;
        final boolean actual = problem.isUnique(s);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void aaa() {
        String s = "aaa";
        final boolean expected = false;
        final boolean actual = problem.isUnique(s);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void a() {
        String s = "a";
        final boolean expected = true;
        final boolean actual = problem.isUnique(s);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void _1() {
        String s = "1";
        final boolean expected = true;
        final boolean actual = problem.isUnique(s);
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        problem = null;
    }
}
