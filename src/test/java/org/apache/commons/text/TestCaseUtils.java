package org.apache.commons.text;

public class TestCaseUtils {
    public static void main(String[] args) {
        testSmallCamelCase();
        testBigCamelCase();
    }

    private static void testSmallCamelCase() {
        String input = "user_name";
        String expected = "userName";
        String actual = CaseUtils.toCamelCase(input, false, '_');
        if (!expected.equals(actual)) {
            System.err.println("小驼峰测试失败！");
            System.err.println("输入: " + input);
            System.err.println("预期: " + expected);
            System.err.println("实际: " + actual);
        } else {
            System.out.println("小驼峰测试通过");
        }
    }

    private static void testBigCamelCase() {
        String input = "user_name";
        String expected = "UserName";
        String actual = CaseUtils.toCamelCase(input, true, '_');
        if (!expected.equals(actual)) {
            System.err.println("大驼峰测试失败！");
            System.err.println("输入: " + input);
            System.err.println("预期: " + expected);
            System.err.println("实际: " + actual);
        } else {
            System.out.println("大驼峰测试通过");
        }
    }
}