package com.Inner;

/**
 * @author LiuYao
 * @Honey YuQin
 * @Duration 2.0
 * @Date 2022/11/2 18:25
 * @Description 学校创办校内报纸，但不希望其他学校创办这样的报纸，就将创办报纸的类作为自己的内部类
 **/
@SuppressWarnings({"all"})
class School{
    InnerNewspapers innerNewspapers;
    String schoolName;
    //无参构造方法
    public School(){
        this("某某大学");
    }
    //有参构造方法
    public School(String s){
        innerNewspapers = new InnerNewspapers();
        String[] content = {"学校举办迎新会","计算机系获得编程大赛冠军","计算机学院召开学生会换届大会"};
        schoolName = s;
        innerNewspapers.setContent(content);
    }
    public void showNews(){
        innerNewspapers.showContent();
    }
    class InnerNewspapers{
        String[] content;
        String paperName = "校新闻周报";
        void setContent(String[] s){
            content = s;
        }
        public void showContent(){
            System.out.println(schoolName);
            System.out.println(paperName);
            for (int i = 0; i < content.length; i++) {
                System.out.println(content[i]);
            }
        }
    }
}

public class InnerNewspaper {
    public static void main(String[] args) {
        School school = new School("仙儿科技大学");
        school.showNews();
    }
}
