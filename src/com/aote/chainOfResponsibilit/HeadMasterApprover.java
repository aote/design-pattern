package com.aote.chainOfResponsibilit;

/**
 * @Author aote
 * @Date 2020-05-01 14:45
 * @Version 1.0
 * @Description TODO
 **/
public class HeadMasterApprover extends  Approver{

    public HeadMasterApprover(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() > 10000 ) {
            System.out.println("请求编号="+purchaseRequest.getId()+"处理"+this.name);
        } else {
            // 下一个处理
            approver.processRequest(purchaseRequest);
        }
    }

}
