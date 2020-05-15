import java.util.Scanner;

/**
 * 策略模式实现简易收银系统
 */
public class Main {
    public static void main(String args[]){
        System.out.println("请输入收费模式: 正常收费 / 满减收费 / 打折收费 ");
        Scanner sc = new Scanner(System.in);

        ContentStrategy contentStrategy = new ContentStrategy(sc.next());

        System.out.println("请输入总消费金额:");
        System.out.println(contentStrategy.getResult(sc.nextDouble()));
    }
}
