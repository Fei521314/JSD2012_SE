package string;

/**
 * boolean startsWith(String str)
 * 判断字符串是否是以给定的字符串开始的
 *
 * boolean endsWith(String str)
 * 判断字符串是否是以给定的字符串结尾的
 */


public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";

        boolean end = str.endsWith("cn");
        System.out.println("end:"+end);

    }
}
