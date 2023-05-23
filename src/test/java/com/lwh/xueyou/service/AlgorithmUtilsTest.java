package com.lwh.xueyou.service;

import com.lwh.xueyou.utils.AlgorithmUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AlgorithmUtilsTest {

    @Test
    void test() {
        String str1 = "小明是狗";
        String str2 = "小明不是狗";
        String str3 = "小明是人不是狗";
        int i1 = AlgorithmUtils.minDistance(str1, str2);
        int i2 = AlgorithmUtils.minDistance(str1, str3);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
    }

    @Test
    void testCompareTags() {
        List<String> tagList1 = Arrays.asList("Java", "大一", "男");
        List<String> tagList2 = Arrays.asList("Java", "大一", "女");
        List<String> tagList3 = Arrays.asList("Python", "大二", "女");
        int i1 = AlgorithmUtils.minDistance(tagList1, tagList2);
        int i2 = AlgorithmUtils.minDistance(tagList1, tagList3);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
    }
}
