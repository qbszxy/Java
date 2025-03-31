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
        System.out.println("============");
        test5();
        System.out.println("============");
        test6();
        System.out.println("============");
        test7();
        System.out.println("============");
        test8();
        System.out.println("============");
        test9();
        System.out.println("============");
        test10();
        System.out.println("============");
        test11();
        System.out.println("============");
        test12();
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
    // 定义整型，int/long，特别注意：同一个数的不同进制的表示是完全相同的，例如15=0xf＝0b1111。
    public static void test4() {
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512

        long n1 = 9000000000000000000L; // long型的结尾需要加L
        long n2 = 900; // 没有加L，此处900为int，但int类型可以赋值给long
        // int i6 = 900L; // 错误：不能把long型赋值给int
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(n1);
        System.out.println(n2);
    }
    // 定义浮点数，浮点类型的数就是小数，因为小数用科学计数法表示的时候，小数点是可以“浮动”的，如1234.5可以表示成12.345x102，也可以表示成1.2345x103，所以称为浮点数。
    public static void test5() {
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        // float f3 = 1.0; // 错误：不带f结尾的是double类型，不能赋值给float

        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);
    }
    // 定义布尔类型，布尔类型boolean只有true和false两个值，布尔类型总是关系运算的计算结果
    // Java语言对布尔类型的存储并没有做规定，因为理论上存储布尔类型只需要1 bit，但是通常JVM内部会把boolean表示为4字节整数。
    public static void test6() {
        boolean b1 = true;
        boolean b2 = false;
        // boolean isGreater = 5 > 3; // 计算结果为true
        int age = 12;
        // boolean isAdult = age >= 18; // 计算结果为false
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(age);
    }
    // 字符类型，字符类型char表示一个字符。Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符
    // 注意char类型使用单引号'，且仅有一个字符，要和双引号"的字符串类型区分开。
    public static void test7() {
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);
    }
    // 引用类型，引用类型的变量类似于C语言的指针，它内部存储一个“地址”，指向某个对象在内存的位置。
    public static void test8() {
        String s = "hello";
        System.out.println(s);
    }
    // 常量，定义变量的时候，如果加上final修饰符，这个变量就变成了常量
    public static void test9() {
        /*
          常量在定义时进行初始化后就不可再次赋值，再次赋值会导致编译错误。
          常量的作用是用有意义的变量名来避免魔术数字（Magic number），例如，不要在代码中到处写3.14，而是定义一个常量。如果将来需要提高计算精度，我们只需要在常量的定义处修改，例如，改成3.1416，而不必在所有地方替换3.14。
          为了和变量区分开来，根据习惯，常量名通常全部大写。
         */
        final double PI = 3.14; // PI是一个常量
        double r = 5.0;
        double area = PI * r * r;
        // PI = 300; // compile error!
        System.out.println(area);
    }
    // var关键字
    public static void test10() {
        // 有些时候，类型的名字太长，写起来比较麻烦。例如：
        // StringBuilder sb = new StringBuilder();
        // 这个时候，如果想省略变量类型，可以使用var关键字：
        // 编译器会根据赋值语句自动推断出变量sb的类型是StringBuilder。对编译器来说，语句：
        // var sb = new StringBuilder();
        // 实际上会自动变成：
        // StringBuilder sb = new StringBuilder();
        // 因此，使用var定义变量，仅仅是少写了变量类型而已。
    }

    // 变量的作用范围
    public static void test11() {
        /*
          在Java中，多行语句用{ ... }括起来。很多控制语句，例如条件判断和循环，都以{ ... }作为它们自身的范围
          只要正确地嵌套这些{ ... }，编译器就能识别出语句块的开始和结束。而在语句块中定义的变量，它有一个作用域，就是从定义处开始，到语句块结束。超出了作用域引用这些变量，编译器会报错。
          定义变量时，要遵循作用域最小化原则，尽量将变量定义在尽可能小的作用域，并且，不要重复使用变量名。
         */
        /*
          例子1
          if (...) { // if开始
              ...
              while (...) { // while 开始
                  ...
                  if (...) { // if开始
                      ...
                  } // if结束
                  ...
              } // while结束
              ...
          } // if结束
          例子2
          {
              ...
              int i = 0; // 变量i从这里开始定义
              ...
              {
                  ...
                  int x = 1; // 变量x从这里开始定义
                  ...
                  {
                      ...
                      String s = "hello"; // 变量s从这里开始定义
                      ...
                  } // 变量s作用域到此结束
                  ...
                  // 注意，这是一个新的变量s，它和上面的变量同名，
                  // 但是因为作用域不同，它们是两个不同的变量:
                  String s = "hi";
                  ...
              } // 变量x和s作用域到此结束
              ...
          } // 变量i作用域到此结束
         */
    }
    // 小结
    public static void test12() {
        /*
          Java提供了两种变量类型：基本类型和引用类型
          基本类型包括整型，浮点型，布尔型，字符型。
          变量可重新赋值，等号是赋值语句，不是数学意义的等号。
          常量在初始化后不可重新赋值，使用常量便于理解程序意图。
         */
    }

}
