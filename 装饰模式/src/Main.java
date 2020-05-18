/**
 * 装饰模式
 *
 * 装饰模式是为已有功能动态的添加更多功能的一种方式
 */
public class Main {
    public static void main(String[] args) {
        AbstractBatterCake abstractBatterCake;

        //创建普通煎饼果子匿名类
        abstractBatterCake = new BatterCake();
        //加个鸡蛋
        //EggDecorator中通过super调用Decorator中的构造方法
        //此时EggDecorator中的abstractBatterCake = new BatterCake()
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        //加根烤肠
        //SausageDecorator中通过super调用Decorator中的构造方法
        //此时SausageDecorator中的abstractBatterCake = new EggDecorator(new BatterCake())
        abstractBatterCake = new SausageDecorator(abstractBatterCake);

        //领悟后自己写一个 蔬菜装饰类
        abstractBatterCake = new VegetablesDecorator(abstractBatterCake);

        //鸡蛋和烤肠装饰煎饼对象后输出结果
        System.out.println(abstractBatterCake.getBatterCake());
        System.out.println("售价：" + abstractBatterCake.cost());
    }
}
