package com.aote.chainOfResponsibilit;

/**
 * @Author aote
 * @Date 2020-05-01 14:35
 * @Version 1.0
 * @Description TODO
 **/
public abstract class Approver {

    // 下一个处理者
    Approver approver;
    // 名字
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    // 处理审批请求的方法，得到一个请求，处理是子类完成的，该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
