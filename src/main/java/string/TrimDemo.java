package string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * sting trim()
 * 去除字符串两边的空白字符
 *
 */

public class TrimDemo {
    public static void main(String[] args) {
        //          左侧和右侧各有3个空格
        String str = "   hello          ";
        System.out.println(str);

        String trim = str.trim();
        System.out.println(trim);
    }

}

