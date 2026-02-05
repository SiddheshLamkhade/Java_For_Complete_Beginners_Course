package Week2Assigment1.Problem7;

public enum  OrderStatus {
    //below elements are constant
    PLACED("Order has been placed"),
    SHIPPED("Order has been shipped"),
    DELIVERED("Order has been delivered"),
    CANCELLED("Order has been cancelled");

    private String message;

    OrderStatus(String message) {
        this.message = message; //setting message field with constructor
    }  // constructor

    public String getMessage() {
        return message; // i will return the message with the help of this method
    }



}
