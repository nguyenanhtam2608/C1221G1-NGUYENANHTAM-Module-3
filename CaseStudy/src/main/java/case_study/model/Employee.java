package case_study.model;

public class Employee {
    Integer idEmployee;
    String nameEmployee;
    String birthdayEmployee;
    Integer idCardEmployee;
    Double salaryEmployee;
    Double phoneEmployee;
    String emailEmployee;
    String addressEmployee;
    Integer idPosition;
    Integer idEducationDegree;
    Integer idDivision;

    public Employee(Integer idEmployee, String nameEmployee, String birthdayEmployee, Integer idCardEmployee, Double salaryEmployee, Double phoneEmployee, String emailEmployee, String addressEmployee, Integer idPosition, Integer idEducationDegree, Integer idDivision) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.birthdayEmployee = birthdayEmployee;
        this.idCardEmployee = idCardEmployee;
        this.salaryEmployee = salaryEmployee;
        this.phoneEmployee = phoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.idPosition = idPosition;
        this.idEducationDegree = idEducationDegree;
        this.idDivision = idDivision;
    }

    public Employee() {
    }

    public Employee(String nameEmployee, String birthdayEmployee, int idCardEmployee, double salaryEmployee, double phoneEmployee, String emailEmployee, String addressEmployee, int idPosition, int idEducationDegree, int idDivision) {
        this.nameEmployee = nameEmployee;
        this.birthdayEmployee = birthdayEmployee;
        this.idCardEmployee = idCardEmployee;
        this.salaryEmployee = salaryEmployee;
        this.phoneEmployee = phoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.idPosition = idPosition;
        this.idEducationDegree = idEducationDegree;
        this.idDivision = idDivision;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthdayEmployee() {
        return birthdayEmployee;
    }

    public void setBirthdayEmployee(String birthdayEmployee) {
        this.birthdayEmployee = birthdayEmployee;
    }

    public Integer getIdCardEmployee() {
        return idCardEmployee;
    }

    public void setIdCardEmployee(Integer idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    }

    public Double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(Double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public Double getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(Double phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public Integer getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public Integer getIdEducationDegree() {
        return idEducationDegree;
    }

    public void setIdEducationDegree(Integer idEducationDegree) {
        this.idEducationDegree = idEducationDegree;
    }

    public Integer getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Integer idDivision) {
        this.idDivision = idDivision;
    }
}

