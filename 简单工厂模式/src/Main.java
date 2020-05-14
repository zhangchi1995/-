import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        String operate;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入运算符号:");
        operate = sc.nextLine();

        //创建operation对象
        Operation operation;
        //使用简单工厂实例化对象
        operation = OperationFactory.createOperate(operate);

        System.out.println("请输入第一个计算数字:");
        operation.setNumberA(sc.nextDouble());
        System.out.println("请输入第二个计算数字:");
        operation.setNumberB(sc.nextDouble());

        System.out.println("运算结果如下:");
        System.out.println(operation.getResult());
    }
}
