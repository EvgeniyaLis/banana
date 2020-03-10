import fruits.impl.Banana;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAge {

    // Ctrl + Alt + L

    private Banana banana;
    private final int GOOD_AGE = 3;
    private final int BAD_AGE = 10;

    @BeforeTest
    public void setUp() {
        banana = new Banana(false, "Yellow");
    }

    @Test
    public void testGoodAge() {
        Assert.assertTrue(banana.isYellow(GOOD_AGE), "Expected banana to be yellow, but it was brown");
    }

    @Test
    public void testBadAge() {
        Assert.assertFalse(banana.isYellow(BAD_AGE));
    }

    @Test
    public void TestHello() {
        Assert.assertEquals(Banana.getHello(), "Hello");
    }
}
