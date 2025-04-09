package org.apache.commons.text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaseUtilsTest {

    @Test
    void testSmallCamelCase() {
        String input = "user_name";
        String expected = "userName";
        String actual = CaseUtils.toCamelCase(input, false, '_');
        assertEquals(expected, actual, "小驼峰转换验证");
    }

    @Test
    void testBigCamelCase() {
        String input = "user_name";
        String expected = "UserName";
        String actual = CaseUtils.toCamelCase(input, true, '_');
        assertEquals(expected, actual, "大驼峰转换验证");
    }
}