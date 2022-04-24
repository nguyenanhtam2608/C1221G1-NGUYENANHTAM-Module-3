package case_study.model;

public class Contract {
   Integer idContract ;
   String startDayContract;
   String endDayContract;
   Double depositContract;
   Double totalMoneyContract;
   Integer idEmployee;
   Integer idCustomer;
   Integer idService;

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public String getStartDayContract() {
        return startDayContract;
    }

    public void setStartDayContract(String startDayContract) {
        this.startDayContract = startDayContract;
    }

    public String getEndDayContract() {
        return endDayContract;
    }

    public void setEndDayContract(String endDayContract) {
        this.endDayContract = endDayContract;
    }

    public Double getDepositContract() {
        return depositContract;
    }

    public void setDepositContract(Double depositContract) {
        this.depositContract = depositContract;
    }

    public Double getTotalMoneyContract() {
        return totalMoneyContract;
    }

    public void setTotalMoneyContract(Double totalMoneyContract) {
        this.totalMoneyContract = totalMoneyContract;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdService() {
        return idService;
    }

    public void setIdService(Integer idService) {
        this.idService = idService;
    }

    public Contract() {
    }

    public Contract(Integer idContract, String startDayContract, String endDayContract, Double depositContract, Double totalMoneyContract, Integer idEmployee, Integer idCustomer, Integer idService) {
        this.idContract = idContract;
        this.startDayContract = startDayContract;
        this.endDayContract = endDayContract;
        this.depositContract = depositContract;
        this.totalMoneyContract = totalMoneyContract;
        this.idEmployee = idEmployee;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }
}
