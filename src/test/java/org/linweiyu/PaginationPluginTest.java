package org.linweiyu;

import junit.framework.TestCase;

import java.util.Random;

public class PaginationPluginTest extends TestCase {

    private int result = 0;

    public PaginationPluginTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("测试开始了：" + result);
        System.out.println("setUp , hashCode = " + hashCode());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("测试结束了：" + result);
        System.out.println("setUp , hashCode = " + hashCode());
    }

    public void testApp() {
        result = new Random().nextInt();
        assertTrue(true);
    }

    public void testFineTest() {
        result = new Random().nextInt();
        assertTrue(true);
    }
}
