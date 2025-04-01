package QuickStart.Basic;

public class FloatAndDoubleOperation {
    public static void main(String[] args){
        test1();
        test2();
        test3();
        test4();
        test5();
    }
    // 浮点数运算误差
    public static void test1() {
        /*
        浮点数运算和整数运算相比，只能进行加减乘除这些数值计算，不能做位运算和移位运算。
        在计算机中，浮点数虽然表示的范围大，但是，浮点数有个非常重要的特点，就是浮点数常常无法精确表示。
        举个例子：
        浮点数0.1在计算机中就无法精确表示，因为十进制的0.1换算成二进制是一个无限循环小数，很显然，无论使用float还是double，都只能存储一个0.1的近似值。但是，0.5这个浮点数又可以精确地表示。
        因为浮点数常常无法精确表示，因此，浮点数运算会产生误差
         */
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println(x); // 0.1
        System.out.println(y); // 0.09999999999999998
    }
    // 比较两个浮点数是否相等
    public static void test2() {
        /*
        由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果。正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数：
         */
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        double r = Math.abs(x - y);
        System.out.println(r + "如果r<0.00001可以认为相等，否则不相等");
    }
    // 类型提升
    public static void test3() {
        /*
        如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型
        需要特别注意，在一个复杂的四则运算中，两个整数的运算不会出现自动提升的情况
         */
        int n = 5;
        double d = 1.2 + 24.0 / n; // 6.0
        System.out.println(d);
        // double d2 = 1.2 + 24 / 5; 结果不是 6.0 而是 5.2
        // System.out.println(d2);
        // 计算结果为5.2，原因是编译器计算24 / 5这个子表达式时，按两个整数进行运算，结果仍为整数4。
        // 要修复这个计算结果，可以将24 / 5改为24.0 / 5。由于24.0是浮点数，因此，计算除法时自动将5提升为浮点数。
        double d2 = 1.2 + 24.0 / 5;
        System.out.println(d2);
         // 或者这样
        double d3 = 1.2 + (double) 24 / 5;
        System.out.println(d3);
    }
    // 溢出
    public static void test4() {
        /*
        整数运算在除数为0时会报错，而浮点数运算在除数为0时，不会报错，但会返回几个特殊值：
        NaN表示Not a Number
        Infinity表示无穷大
        -Infinity表示负无穷大
        例如：
        double d1 = 0.0 / 0; // NaN
        double d2 = 1.0 / 0; // Infinity
        double d3 = -1.0 / 0; // -Infinity
        这三种特殊值在实际运算中很少碰到，我们只需要了解即可。
         */
    }
    // 强制转型
    public static void test5() {
        // 可以将浮点数强制转型为整数。在转型时，浮点数的小数部分会被丢掉。如果转型后超过了整型能表示的最大范围，将返回整型的最大值。例如：
        int n1 = (int) 12.3; // 12
        int n2 = (int) 12.7; // 12
        int n3 = (int) -12.7; // -12
        int n4 = (int) (12.7 + 0.5); // 13
        int n5 = (int) 1.2e20; // 2147483647
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        // 如果要进行四舍五入，可以对浮点数加上0.5再强制转型：
        double d = 2.6;
        int n = (int) (d + 0.5);
        System.out.println(n);
    }
    /*
    小结
    浮点数常常无法精确表示，并且浮点数的运算结果可能有误差；
    比较两个浮点数通常比较它们的差的绝对值是否小于一个特定值；
    整型和浮点型运算时，整型会自动提升为浮点型；
    可以将浮点型强制转为整型，但超出范围后将始终返回整型的最大值。
     */
}
