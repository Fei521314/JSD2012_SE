package string;

public class Test {
    public static void main(String[] args) {
        String s1 = getHostName("www.tedu.cn");
        String s2 = getHostName("http://www.tarena.cn");
        String s3 = getHostName("doc.canglaoshi.com.cn");
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);



    }
    /**
     *
     *
     */

    public static  String getHostName(String address){
        int index = address.indexOf(".")+1;
        int index1 = address.indexOf(".",index);
        String sub =address.substring(index,index1);
        return sub ;

    }
}
