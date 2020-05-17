/**
 * 实现存款、取款、转账功能
 *
 * 如果现在要加一个购买基金的功能，就要修改这个类。一个两个还好，如果功能多了，就会增大出错的概率
 *
 * 扩展性和维护性都很差,所以一个功能过来最好是别再之前的类中去添加新的功能了,这样就要求你开始设计
 * 的时候就要考虑后期的扩展,而且最好要做到不在原来的代码上做修改
 *
 * 改良版 ——> NewBankWorker接口
 */
public class BankWorker {

    //存款
    public void saving(){
        System.out.println("存款操作");
    }

    //转账
    public void transfer(){
        System.out.println("转账操作");
    }

    //取款
    public void drawing(){
        System.out.println("取款操作");
    }
}
