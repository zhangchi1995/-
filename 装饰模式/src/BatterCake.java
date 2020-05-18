//煎饼类
public class BatterCake extends AbstractBatterCake{
    //实现煎饼抽象方法
    @Override
    public String getBatterCake() {
        return "普通煎饼果子";
    }

    //实现价格抽象方法
    @Override
    public int cost() {
        return 8;
    }
}
