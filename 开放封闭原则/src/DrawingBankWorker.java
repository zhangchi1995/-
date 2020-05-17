/**
 * 取款业务员类
 */
public class DrawingBankWorker implements NewBankWorker{

    @Override
    public void operation(){
        System.out.println("我是取款业务员，负责取款");
    }
}
