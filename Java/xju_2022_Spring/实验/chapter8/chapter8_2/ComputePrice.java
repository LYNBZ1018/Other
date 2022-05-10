package chapter8_2;

import java.util.*;

public class ComputePrice {
    public static void main(String args[]) {
        String menu = "北京烤鸭:189元 西芹炒肉:12.9元 酸菜鱼:69元 铁板牛柳:32元";
        Scanner scanner = new Scanner(menu); // 【代码1】---------//使用构造方法Scanner(String str)创建scanner,将menu传递给构造方法的参数
        String regex = "[^0123456789.]+";
        scanner.useDelimiter(regex); // 【代码2】---------//scanner调用useDelimiter(String regex)，将regex传递给该方法的参数
        double sum = 0;
        while (scanner.hasNext()) {
            try {
                double price = scanner.nextDouble(); // 【代码3】---------//scanner调用nextDouble()返回数字单词
                sum = sum + price;
                System.out.println(price);
            } catch (InputMismatchException exp) {
                String t = scanner.next();
            }
        }
        System.out.println("菜单总价格:" + sum + "元");
    }
}
