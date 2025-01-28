package test;
import Arrays.Arr;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

class A<T extends Long> {

    public<T> A(T val) {
        System.out.println(val);
    }

    private T val;

    public void setVal(T val) {
        this.val=val;
    }

    public T getVal() {
        return this.val;
    }
}

class Main {
    public static void main(String[] args) {

        String s=null;
        String s2=null;

        System.out.println(StringUtils.isNoneBlank(s, "hi"));
        System.out.println(StringUtils.isNotBlank(s2));



//        long l=0;
//        System.out.println(l);

//        String s="123";

//        String s=new String("Hello  world");
//        byte[] b=s.getBytes();
//
//        for(var i: b) {
//            System.out.println(i);
//        }
//
//        StringBuilder str=new StringBuilder();
//        for(var i: b) {
//            str.append(String.format("%02X", i));
//        }
//        System.out.println(str);
//
//        long a=12345555555L;
//        float x=(float) a;
//        System.out.println(x);

//        System.out.println(Integer.parseInt(34));
//        System.out.println(Integer.valueOf(123));
//
//        A a=new A("Helllo");
//        a.setVal(10L);
//        System.out.println(a.getVal());
//        a.setVal(1.000);
//        System.out.println(a.getVal());

//        var a=10.000;


//        A a=new A();
//        B b= (B) a;
//        String str="Hello world!";
//        byte[] b=str.getBytes();
//        System.out.println(Arrays.toString(b));
//
//        StringBuilder hexStr=new StringBuilder();
//        for(var m: b) {
//            hexStr.append(String.format("%02X", m));
//        }
//        System.out.println(hexStr);
//
//        byte[] b2=new byte[hexStr.length()/2];
//        for(int i=0; i<b2.length; i++) {
//            int index =i*2;
//            int val=Integer.parseInt(hexStr.substring(index, index+2), 16);
//            b2[i]=(byte)val;
//        }
//
//        System.out.println(Arrays.toString(b2));


    }
}
