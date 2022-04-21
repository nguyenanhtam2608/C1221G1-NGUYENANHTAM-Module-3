package case_study.model;

public class CustomerType {
    int idCustomerType;
    String nameCustomerType;

    public CustomerType(int idCustomerType, String nameCustomerType) {
        this.idCustomerType = idCustomerType;
        this.nameCustomerType = nameCustomerType;
    }

    public CustomerType() {
    }

    public int getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(int idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public String getNameCustomerType() {
        return nameCustomerType;
    }

    public void setNameCustomerType(String nameCustomerType) {
        this.nameCustomerType = nameCustomerType;
    }
}
