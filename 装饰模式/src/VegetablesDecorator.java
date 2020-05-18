public class VegetablesDecorator extends Decorator{

    //调用父类构造方法
    VegetablesDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    //调用父类的煎饼方法 + 蔬菜装饰类新增方法
    @Override
    public String getBatterCake(){
        return super.getBatterCake() + "加个蔬菜";
    }

    //调用父类的价格方法 + 蔬菜装饰类新增价格
    @Override
    public int cost(){
        return super.cost() + 1;
    }
}
