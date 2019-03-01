/**
 * 输出结果：
 * 1、父类：j = method();
 * 2、父类：静态代码块
 * 3、子类：int j = method();
 * 4、子类：静态代码块
 * 5、子类：i = test();
 * 6、父类：非静态代码块
 * 7、父类：构造器
 * 8、子类：i = test();
 * 9、子类：非静态代码块
 * 10、子类：构造器
 * 11、子类：i = test();
 * 12、父类：非静态代码块
 * 13、父类：构造器
 * 14、子类：i = test();
 * 15、子类：非静态代码块
 * 16、子类：构造器
 *
 * 答案：5、1、10、6、9、3、2、9、8、7
 *      9、3、2、9、8、7
 */
public class Son extends Parent{
    private int i = test();
    private static int j = method();
    static {
        System.out.print("6、");
    }
    Son(){
        System.out.print("7、");
    }
    {
        System.out.print("8、");
    }
    public int test(){
        System.out.print("9、");
        return 1;
    }
    public static int method(){
        System.out.print("10、");
        return 1;
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();
    }
}
