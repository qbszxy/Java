package QuickStart.Basic;

public class CharAndString {
    public static void main(String[] args){
        test1();
        test2();
        test3();
        test4();
        test5();
    }
    /*
    在Java中，字符和字符串是两个不同的类型。
    字符类型
    字符类型char是基本数据类型，它是character的缩写。一个char保存一个Unicode字符：
    char c1 = 'A';
    char c2 = '中';
    因为Java在内存中总是使用Unicode表示字符，所以，一个英文字符和一个中文字符都用一个char类型表示，它们都占用两个字节。要显示一个字符的Unicode编码，只需将char类型直接赋值给int类型即可：
    int n1 = 'A'; // 字母“A”的Unicode编码是65
    int n2 = '中'; // 汉字“中”的Unicode编码是20013
    还可以直接用转义字符+Unicode编码来表示一个字符：
    // 注意是十六进制:
    char c3 = '\(转义字符)u0041'; // 'A'，因为十六进制0041 = 十进制65
    char c4 = '\(转义字符)u4e2d'; // '中'，因为十六进制4e2d = 十进制20013
    字符串类型
    和char类型不同，字符串类型String是引用类型，我们用双引号"..."表示字符串。一个字符串可以存储0个到任意个字符
    String s = ""; // 空字符串，包含0个字符
    String s1 = "A"; // 包含一个字符
    String s2 = "ABC"; // 包含3个字符
    String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格
    因为字符串使用双引号"..."表示开始和结束，那如果字符串本身恰好包含一个"字符怎么表示？例如，"abc"xyz"，编译器就无法判断中间的引号究竟是字符串的一部分还是表示字符串结束。这个时候，我们需要借助转义字符\：
    String s = "abc\"xyz"; // 包含7个字符: a, b, c, ", x, y, z
    因为\是转义字符，所以，两个\\表示一个\字符：
    String s = "abc\\xyz"; // 包含7个字符: a, b, c, \, x, y, z
    常见的转义字符包括：
    \" 表示字符"
    \' 表示字符'
    \\ 表示字符\
    \n 表示换行符
    \r 表示回车符
    \t 表示Tab
    转义字符\和u再加上#### 表示一个Unicode编码的字符
    例如：
    String s = "ABC\n\(转义字符)u4e2d\(转义字符)u6587"; // 包含6个字符: A, B, C, 换行符, 中, 文
     */
    // 字符串连接 Java的编译器对字符串做了特殊照顾，可以使用+连接任意字符串和其他数据类型，这样极大地方便了字符串的处理。例如：
    public static void test1() {
        String s1 = "Hello";
        String s2 = "world";
        String s = s1 + " " + s2 + "!";
        System.out.println(s); // Hello world!
    }
    // 如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接：
    public static void test2() {
        int age = 25;
        String s = "age is " + age;
        System.out.println(s); // age is 25
    }
    // 多行字符串
    public static void test3() {
        /*
        如果我们要表示多行字符串，使用+号连接会非常不方便：
        String s = "first line \n"
         + "second line \n"
         + "end";
        从Java 13开始，字符串可以用"""..."""表示多行字符串（Text Blocks）了。举个例子：
        */
        String s = """
                   SELECT * FROM
                     users
                   WHERE id > 100
                   ORDER BY name DESC""";
        System.out.println(s);
    }
    // 不可变特性 Java的字符串除了是一个引用类型外，还有个重要特点，就是字符串不可变。考察以下代码
    public static void test4() {
        String s = "hello";
        System.out.println(s); // 显示 hello
        s = "world";
        System.out.println(s); // 显示 world
        /*
        观察执行结果，难道字符串s变了吗？其实变的不是字符串，而是变量s的“指向”。
        执行String s = "hello";时，JVM虚拟机先创建字符串"hello"，然后，把字符串变量s指向它
               s
               │
               ▼
        ┌───┬───────────┬───┐
        │   │  "hello"  │   │
        └───┴───────────┴───┘
        紧接着，执行s = "world";时，JVM虚拟机先创建字符串"world"，然后，把字符串变量s指向它：
              s ──────────────┐
                              │
                              ▼
        ┌───┬───────────┬───┬───────────┬───┐
        │   │  "hello"  │   │  "world"  │   │
        └───┴───────────┴───┴───────────┴───┘
        原来的字符串"hello"还在，只是我们无法通过变量s访问它而已。因此，字符串的不可变是指字符串内容不可变。至于变量，可以一会指向字符串"hello"，一会指向字符串"world"。
        理解了引用类型的“指向”后，试解释下面的代码输出：
         */
        String s1 = "hello";
        String t1 = s1;
        s1 = "world";
        System.out.println(s1);
        System.out.println(t1); // t是"hello"还是"world"?
    }
    // 空值null
    public static void test5() {
        /*
        引用类型的变量可以指向一个空值null，它表示不存在，即该变量不指向任何对象。例如：
        String s1 = null; // s1是null
        String s2 = s1; // s2也是null
        String s3 = ""; // s3指向空字符串，不是null
        注意要区分空值null和空字符串""，空字符串是一个有效的字符串对象，它不等于null。
         */
    }

}
