import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testMultiply() {
        assertEquals(25, SkillDemo.multiply(8, 3));
    }
}