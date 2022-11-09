package com.expersion;

/**
 * @author LiuYao
 * @Honey YuQin
 * @Duration 2.0
 * @Date 2022/11/2 19:03
 * @Description 危险异常类
 **/
@SuppressWarnings({"all"})
public class DangerException extends Exception{
    String message;

    public DangerException() {
        message = "危险品";
    }
    public void toShow(){
        System.out.print(message+"");
        int []a = {1,2,3,};
    }
}
