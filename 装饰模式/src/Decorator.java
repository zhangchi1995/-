//装饰者类 继承于抽象煎饼类
public class Decorator extends AbstractBatterCake{

    private AbstractBatterCake abstractBatterCake;

    Decorator(AbstractBatterCake abstractBatterCake){
        this.abstractBatterCake = abstractBatterCake;
    }

    @Override
    public String getBatterCake() {
        return abstractBatterCake.getBatterCake();
    }

    @Override
    public int cost() {
        return abstractBatterCake.cost();
    }
}
