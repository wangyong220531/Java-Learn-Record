import java.util.Scanner;

class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入任意数字：");
        int num = scan.nextInt();
        System.out.print("您输入的是：" + num + "\n");
        System.out.print("请输入您的姓名：");
        String name = scan.next();
        System.out.print("您的姓名是：" + name);
    }
}
