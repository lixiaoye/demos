package design_pattern.behavioral.chainResponsibility.demo2;

/**
 * 采购单处理类
 */

public class PurchaseRequestHandler {
    //递交采购单给主任
    public void sendRequestToDirector(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            //主任可审批该采购单
            this.handleByDirector(request);

        } else if (request.getAmount() < 100000) {
            //副董事长可审批该采购单
            this.handleByVicePresident(request);
        } else if (request.getAmount() < 500000) {
            //董事长可审批该采购单
            this.handleByPresident(request);
        } else {
            //董事会可审批该采购单
            this.handleByCongress(request);
        }
    }

    //董事会审批采购单
    private void handleByCongress(PurchaseRequest request) {
    }

    //董事长审批采购单
    private void handleByPresident(PurchaseRequest request) {

    }

    //副董事长审批采购单
    private void handleByVicePresident(PurchaseRequest request) {
    }

    //主任审批采购单
    private void handleByDirector(PurchaseRequest request) {
    }
}
