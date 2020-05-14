//乘法类
public class OperationMul extends Operation{

    //重写父类中的 getResult 方法
    @Override
    public double getResult(){
        double result = 0;
        result = getNumberA() * getNumberB();
        return result;
    }
}
