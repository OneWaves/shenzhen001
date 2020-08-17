package com.itheima.demo1_面向对象;

import java.util.Arrays;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/7 8:54
 */
public class Test {
    public static void main(String[] args) {
        /*
            面向过程: 强调的是过程,必须清楚每一个步骤,安装步骤一步一步去实现
            面向对象: 强调的是对象,无须清楚每一个步骤,只需要找到可以完成功能的对象,让该对象去完成即可

            需求:打印数组中所有的元素,打印格式为: [元素1，元素2，元素3，元素4，...，元素n]
         */
        // 面向过程:
        // 定义一个数组,并且初始化数组元素
        int[] arr = {10, 20, 30, 40, 50};

        // 使用循环,遍历数组中的所有元素
        for (int i = 0; i < arr.length; i++) {
            // 在循环中,判断遍历出来的元素
            int e = arr[i];
            if (i == 0) {
                // 如果这个元素是第一个元素,打印格式为: [ + 元素 + 逗号空格
                System.out.print("["+e+", ");
            } else if (i == arr.length - 1) {
                // 如果这个元素是最后一个元素,打印格式为: 元素 + ]
                System.out.println(e+"]");
            } else {
                // 如果是中间元素,打印格式: 元素+ 逗号空格
                System.out.print(e+", ");
            }
        }

        // 面向对象:
        // jdk提供了一个Arrays工具类,toString方法可以帮助我们按照这个格式打印数组
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }
}
