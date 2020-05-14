//除法类
public class OperationDiv extends Operation{

    //重写父类中的 getResult 方法
    @Override
    public double getResult(){
        double result = 0;
        //除数为0时抛出异常
        if (getNumberB() == 0){
            System.out.println("除数不能为0");
            throw new ArithmeticException();
        }
        result = getNumberA() / getNumberB();
        return result;
    }
}
