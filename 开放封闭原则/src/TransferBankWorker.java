/**
 * 转账业务员类
 */
public class TransferBankWorker implements NewBankWorker{

    @Override
    public void operation(){
        System.out.println("我是转账业务员，负责转账");
    }
}
