package QuickStart.Basic;

// 变量和数据类型
public class VariablesAndDataTypes {
    public static void main(String[] args){
        test1();
        System.out.println("============");
        test2();
        System.out.println("============");
        test3();
        System.out.println("============");
        test4();
    }

    // 定义并打印变量
    public static void test1() {
        int x = 100; // 定义int类型变量x，并赋予初始值100
        System.out.println("定义变量x:" + x); // 打印该变量的值
    }
    // 重新赋值变量
    public static void test2() {
        int x = 100; // 定义int类型变量x，并赋予初始值100
        System.out.println("定义变量x:" + x); // 打印该变量的值，观察是否为100
        x = 200; // 重新赋值为200
        System.out.println("重新定义变量后的x:" + x);
    }
    // 变量之间的赋值
    public static void test3() {
        int n = 100; // 定义变量n，同时赋值为100
        System.out.println("n = " + n); // 打印n的值
        n = 200; // 变量n赋值为200
        System.out.println("n = " + n); // 打印n的值
        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
        System.out.println("x = " + x); // 打印x的值
        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
        System.out.println("x = " + x); // 打印x的值
        System.out.println("n = " + n); // 再次打印n的值，n是200
    }
    // 定义整型,int/long
    public static void test4() {
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512

        long n1 = 9000000000000000000L; // long型的结尾需要加L
        long n2 = 900; // 没有加L，此处900为int，但int类型可以赋值给long
//        int i6 = 900L; // 错误：不能把long型赋值给int
    }
}
