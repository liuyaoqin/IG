package com.expersion;

/**
 * @author LiuYao
 * @Honey YuQin
 * @Duration 2.0
 * @Date 2022/11/2 19:00
 * @Description
 **/
@SuppressWarnings({"all"})
public class Gods {
    boolean isDanger;
    String name;

    public Gods(boolean isDanger, String name) {
        this.isDanger = isDanger;
        this.name = name;
    }

    public boolean isDanger() {
        return isDanger;
    }

    public void setIsDanger(boolean danger) {
        this.isDanger = danger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
