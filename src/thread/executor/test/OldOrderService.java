package thread.executor.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class OldOrderService {

    public void order(String ordeNo) {
        InventoryWork inventoryWork = new InventoryWork(ordeNo);
        ShippingWork shippingWork = new ShippingWork(ordeNo);
        AccountingWork accountingWork = new AccountingWork(ordeNo);

        Boolean inventoryResult = inventoryWork.call();
        Boolean shippingResult = shippingWork.call();
        Boolean accountingResult = accountingWork.call();

        if (inventoryResult && shippingResult && accountingResult) {
            log("전체 주문 처리 완료: " + ordeNo);
        } else {
            log("일부 주문 처리 실패: " + ordeNo);
        }
    }

    static class InventoryWork {
        private final String orderNo;

        public InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call() {
            log("재고 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class ShippingWork {
        private final String orderNo;

        public ShippingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call() {
            log("배송 시스템 알림: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class AccountingWork {
        private final String orderNo;

        public AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call() {
            log("회계 시스템 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }
}
