package com.atguigu.maven.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Author Li Yijia
 * Version
 * Created 2024/2/1
 * Description
 */
public class MavenTest {
    @Test
    public void testAssert() {
        int a = 10;
        int b = 20;
        Assertions.assertEquals(a+b, 30);
    }
}
