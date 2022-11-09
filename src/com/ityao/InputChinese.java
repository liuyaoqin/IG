package com.ityao;

/**
 * @author LiuYao
 * @Honey YuQin
 * @Duration 2.0
 * @Date 2022/10/31 13:07
 * @Description 在命令行窗口输出带偏旁的汉字
 **/
@SuppressWarnings({"all"})
public class InputChinese {
    public static void main(String[] args) {
        char ch = '刘',zifu = 0;
        int  p = 22920,count = 5,position = 0;
        System.out.printf("输出%d个汉字：\n",count);
        for (char c = ch; c < ch + count; c++) {
            position = (int)c;
            System.out.printf("%c(%d)",c,position);
        }

        char ah = '姚';
        System.out.printf("输出%d个汉字：\n",count);
        for (char c = ah; c < ah + count; c++) {
            position = (int)c;
            System.out.printf("%c(%d)",c,position);
        }
    }
}
