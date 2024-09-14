public class GroceryMart {
    private String customer_name;
    private int customer_id;
    private int customer_phone_no;
    private int customer_acc_bal;
    private String customer_add;

//    public GroceryMart(){
//        System.out.println("Default Constructor called");
//    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getCustomer_phone_no() {
        return customer_phone_no;
    }

    public void setCustomer_phone_no(int customer_phone_no) {
        this.customer_phone_no = customer_phone_no;
    }

    public int getCustomer_acc_bal() {
        return customer_acc_bal;
    }

    public void setCustomer_acc_bal(int customer_acc_bal) {
        this.customer_acc_bal = customer_acc_bal;
    }

    public String getCustomer_add() {
        return customer_add;
    }

    public void setCustomer_add(String customer_add) {
        this.customer_add = customer_add;
    }

    public void Shop(int amount){
        if (customer_acc_bal>=amount){
            System.out.println("you can shop");
            int rem_bal=customer_acc_bal-amount;
            System.out.println("Balance: "+rem_bal);
            customer_acc_bal=rem_bal;
        }else{
            System.out.println("low account balance");
        }
        }
    public void Recharge(int recharge){
        customer_acc_bal=customer_acc_bal+recharge;
        System.out.println("Your acc balance after recharge is: "+customer_acc_bal);
    }

    public static void main(String[] args) {
        GroceryMart myaccount=new GroceryMart();

        myaccount.setCustomer_name("Aditya");
        myaccount.setCustomer_id(1);
        myaccount.setCustomer_add("ABC");
        myaccount.setCustomer_phone_no(67890);
        myaccount.setCustomer_acc_bal(1000);

        myaccount.Shop(600);
        myaccount.Recharge(1000);
        myaccount.Shop(1500);
    }
}
