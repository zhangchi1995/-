//烤肠装饰类
public class SausageDecorator extends Decorator{

    //调用父类的构造方法
    SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    //父类的煎饼方法 + 当前烤肠装饰类新增方法
    @Override
    public String getBatterCake(){
        return super.getBatterCake() + "加根烤肠";
    }

    //父类的价格方法 + 当前烤肠装饰类新增价格
    @Override
    public int cost(){
        return super.cost() + 2;
    }
}
