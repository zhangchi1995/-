//满减收费类
public class CashReturn implements CashSuper{
    private double conditionMoney;
    private double returnMoney;

    /**
     * 满减收费 每满normalMoney 则减returnMoney
     * @param conditionMoney 满足条件的金额数量
     * @param returnMoney    返还的金额数量
     */
    CashReturn(double conditionMoney, double returnMoney){
        this.conditionMoney = conditionMoney;
        this.returnMoney = returnMoney;
    }

    //重写收费算法接口
    @Override
    public double algorithmInterface(double money){
        if (money >= conditionMoney){
            money -= Math.floor(money / conditionMoney) * returnMoney;
        }
        return money;
    }
}
