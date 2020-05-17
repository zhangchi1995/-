/**
 * 存款业务员类
 */
public class SavingBankWorker implements NewBankWorker{

    @Override
    public void operation(){
        System.out.println("我是存款业务员，负责存款");
    }
}
