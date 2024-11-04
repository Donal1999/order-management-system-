package ie.atu.week7;

public class order {
    public class Order{
        private String orderId;
        private String customerName;
        private String productName;
        private Integer quanity;

        public Order() { // default constructor
            this.orderId = "";
            this.customerName ="";
            this.productName = "";
            this. quanity = "";
        }

        public Order(String orderId, String customerName, String productName, Integer quanity) { // consturctor with paramaters
            this.orderId = orderId;
            this.customerName = customerName;
            this.productName = productName;
            this.quanity = quanity;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Integer getQuanity() {
            return quanity;
        }

        public void setQuanity(Integer quanity) {
            this.quanity = quanity;
        }
    }

}
