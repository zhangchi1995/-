//策略类
public class ContentStrategy {

    private CashSuper cashSuper;

    ContentStrategy(String type){
        switch (type){
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满减收费":
                cashSuper = new CashReturn(300,100);
                break;
            case "打折收费":
                cashSuper = new CashRebate(0.88);
                break;
        }
    }

    //策略模式根据不同的规则返回不同的结果
    public double getResult(double money){
        return cashSuper.algorithmInterface(money);
    }
}
