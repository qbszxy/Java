package QuickStart.Process;

import java.util.Scanner;

public class InAndOut {
    public static void main(String[] args){
        out();
        in();
        test();
    }
    // 输出
    public static void out() {
        /*
        在前面的代码中，我们总是使用System.out.println()来向屏幕输出一些内容。
        println是print line的缩写，表示输出并换行。因此，如果输出后不想换行，可以用print()：
         */
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
        /*
        格式化输出
        Java还提供了格式化输出的功能。为什么要格式化输出？因为计算机表示的数据不一定适合人来阅读
        如果要把数据显示成我们期望的格式，就需要使用格式化输出的功能。格式化输出使用System.out.printf()，通过使用占位符%?，printf()可以把后面的参数格式化成指定格式
         */
        double d = 12900000;
        System.out.println(d); // 1.29E7
        double d2 = 3.1415926;
        System.out.printf("%.2f\n", d2); // 显示两位小数3.14
        System.out.printf("%.4f\n", d2); // 显示4位小数3.1416
        /*
        Java的格式化功能提供了多种占位符，可以把各种数据类型“格式化”成指定的字符串：
        占位符	说明
        %d	格式化输出整数
        %x	格式化输出十六进制整数
        %f	格式化输出浮点数
        %e	格式化输出科学计数法表示的浮点数
        %s	格式化字符串
        注意，由于%表示占位符，因此，连续两个%%表示一个%字符本身。
        占位符本身还可以有更详细的格式化参数。下面的例子把一个整数格式化成十六进制，并用0补足8位：
        详细的格式化参数请参考JDK文档java.util.Formatter
         */
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
        System.out.println();
    }
    // 输入
    public static void in(){
        /*
        和输出相比，Java的输入就要复杂得多。
        我们先看一个从控制台读取一个字符串和一个整数的例子：
         */
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
        /*
        首先，我们通过import语句导入java.util.Scanner，import是导入某个类的语句，必须放到Java源代码的开头，后面我们在Java的package中会详细讲解如何使用import。
        然后，创建Scanner对象并传入System.in。System.out代表标准输出流，而System.in代表标准输入流。直接使用System.in读取用户输入虽然是可以的，但需要更复杂的代码，而通过Scanner就可以简化后续的代码。
        有了Scanner对象后，要读取用户输入的字符串，使用scanner.nextLine()，要读取用户输入的整数，使用scanner.nextInt()。Scanner会自动转换数据类型，因此不必手动转换。
        要测试输入，必须从命令行读取用户输入，因此，需要走编译、执行的流程：
        $ javac Main.java
        这个程序编译时如果有警告，可以暂时忽略它，在后面学习IO的时候再详细解释。编译成功后，执行：
        $ java Main
        Input your name: Bob ◀── 输入 Bob
        Input your age: 12   ◀── 输入 12
        Hi, Bob, you are 12  ◀── 输出
        根据提示分别输入一个字符串和整数后，我们得到了格式化的输出。
         */
    }
    // 练习
    public static void test() {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your last score: "); // 打印提示
        int lastScore = scanner.nextInt(); // 读取一行输入并获取上次分数
        System.out.print("Input your now score: "); // 打印提示
        int nowScore = scanner.nextInt(); // 读取一行输入并获取本次分数
        double increasedPercentage = (double) (nowScore - lastScore) / lastScore * 100;
        System.out.printf("你的成绩提高了 %.2f%%", increasedPercentage); // 格式化输出
    }
    /*
    小结
    Java提供的输出包括：System.out.println() / print() / printf()，其中printf()可以格式化输出；
    Java提供Scanner对象来方便输入，读取对应的类型可以使用：scanner.nextLine() / nextInt() / nextDouble() / ...
     */
}
