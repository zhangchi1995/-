//计算类
public abstract class Operation {

    //定义两个私有变量 代表计算的两个数 分别生成get/set方法
    private double numberA;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    //计算方法
    public double getResult(){
        return 0;
    }
}
