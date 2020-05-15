//正常收费类
public class CashNormal implements CashSuper{

    //重写收费算法 返回正常金额
    @Override
    public double algorithmInterface(double money){
        return money;
    }
}
