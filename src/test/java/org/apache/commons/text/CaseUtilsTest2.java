package org.apache.commons.text;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CaseUtilsTest2 {

    @Test
    public void testSmallCamelCase() {
        String input = "user_name";
        String expected = "userName";
        String actual = CaseUtils.toCamelCase(input, false, '_');
        assertEquals(actual, expected, "小驼峰转换测试失败");
    }

    @Test
    public void testBigCamelCase() {
        String input = "user_name";
        String expected = "UserName";
        String actual = CaseUtils.toCamelCase(input, true, '_');
        assertEquals(actual, expected, "大驼峰转换测试失败");
    }
}