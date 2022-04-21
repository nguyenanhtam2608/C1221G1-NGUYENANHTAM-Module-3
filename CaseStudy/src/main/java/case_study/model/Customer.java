package case_study.model;

public class Customer {
    private Integer id_customer;
    private Integer customer_type_id;
    private String customer_name;
    private String customer_birthday;
    private Integer customer_gender;
    private Integer customer_id_card;
    private String customer_phone;
    private String customer_email;
    private String customer_address;

    public Customer(Integer id_customer, Integer customer_type_id, String customer_name, String customer_birthday, Integer customer_gender, Integer customer_id_card, String customer_phone, String customer_email, String customer_address) {
        this.id_customer = id_customer;
        this.customer_type_id = customer_type_id;
        this.customer_name = customer_name;
        this.customer_birthday = customer_birthday;
        this.customer_gender = customer_gender;
        this.customer_id_card = customer_id_card;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.customer_address = customer_address;
    }


    public Customer(int customer_type_id, String customer_name, String customer_birthday, int customer_gender, int customer_id_card, String customer_phone, String customer_email, String customer_address) {
        this.customer_type_id = customer_type_id;
        this.customer_name = customer_name;
        this.customer_birthday = customer_birthday;
        this.customer_gender = customer_gender;
        this.customer_id_card = customer_id_card;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.customer_address = customer_address;
    }

    public Customer() {

    }

    public Integer getId_customer() {
        return id_customer;
    }

    public void setId_customer(Integer id_customer) {
        this.id_customer = id_customer;
    }

    public Integer getCustomer_type_id() {
        return customer_type_id;
    }

    public void setCustomer_type_id(Integer customer_type_id) {
        this.customer_type_id = customer_type_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_birthday() {
        return customer_birthday;
    }

    public void setCustomer_birthday(String customer_birthday) {
        this.customer_birthday = customer_birthday;
    }

    public Integer getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(Integer customer_gender) {
        this.customer_gender = customer_gender;
    }

    public Integer getCustomer_id_card() {
        return customer_id_card;
    }

    public void setCustomer_id_card(Integer customer_id_card) {
        this.customer_id_card = customer_id_card;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }
}