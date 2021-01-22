package string;

import sun.plugin.liveconnect.OriginNotAllowedException;

import javax.print.attribute.standard.OrientationRequested;

/**
 * 字符串常量池是JVM在堆内存中专门为了字符串提供的一段空间，用于缓存所有使用字面量形式
 * 创建的字符串对象，当再次使用相同字面量创建字符串时会除直接重用常量池中的对象而不会再
 * 次创建新对象减少内存开销。
 */

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        System.out.println("s1:"+s1);
        //s2字面量与s1相同，因此重用了上面s1创建的字符串对象
        String s2 = "123abc";
        System.out.println("s2:"+s2);
        System.out.println(s1==s2);//s1==s2为true，说明保存的地址一样，使用的同一个对象

        String s3 = new String("123abc");
        System.out.println("s3:"+s3);
        System.out.println(s2==s3);

        System.out.println(s2.equals(s3));//比较的是字符串对象的内容是否相同

        s1 =s1+"!";//由于字符串时不变对象，修改内容就会创建新的对象
        System.out.println("s1:"+s1);//s1内容发生了改变
        System.out.println("s2:"+s2);//s2内容没有改变
        System.out.println(s1==s2);

        String s4 = "123" +"abc";
        System.out.println("s4:"+s4);
        System.out.println(s4==s2);

        String s = "123";
        String s5 = s+ "abc";
        System.out.println("s5:"+s5);
        System.out.println(s5==s2);
    }
}
