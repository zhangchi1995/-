//打折收费类
public class CashRebate implements CashSuper{
    private double discount;

    /**
     * 打折收费
     * @param discount 打折折扣
     */
    CashRebate(double discount){
        this.discount = discount;
    }

    @Override
    public double algorithmInterface(double money){
        return money * discount;
    }
}
