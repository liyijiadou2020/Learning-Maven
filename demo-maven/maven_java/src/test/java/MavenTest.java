import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Author Li Yijia
 * Version
 * Created 2024/2/1
 * Description: 在 maven 工程中，测试类和测试方法的写法都有规定！类名以Test结尾，测试方法以test开头
 */
public class MavenTest {
    @Test
    public void testAssert() {
        int a = 10;
        int b = 20;
        Assertions.assertEquals(a+b, 30);
    }
}
