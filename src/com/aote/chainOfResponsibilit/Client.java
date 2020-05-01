package com.aote.chainOfResponsibilit;

/**
 * @Author aote
 * @Date 2020-05-01 14:45
 * @Version 1.0
 * @Description TODO
 **/
public class Client {

    public static void main(String[] args) {
        // 创建请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1,1,1);
        // 创建相关审批人(处理人构成环形)
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprove collegeApprove = new CollegeApprove("院长");
        HeadMasterApprover headMasterApprover = new HeadMasterApprover("校长");

        // 处理人构成环形
        departmentApprover.setApprover(collegeApprove);
        collegeApprove.setApprover(headMasterApprover);
        headMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
    }

}
