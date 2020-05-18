//鸡蛋装饰类
public class EggDecorator extends Decorator{

    //调用父类的构造方法
    EggDecorator(AbstractBatterCake abstractBatterCake){
        super(abstractBatterCake);
    }

    //父类的煎饼方法 + 当前鸡蛋装饰类新增方法
    @Override
    public String getBatterCake(){
        return super.getBatterCake() + "加个蛋";
    }

    //父类的价格方法 + 当前鸡蛋装饰类新增价格
    @Override
    public int cost(){
        return super.cost() + 1;
    }
}
