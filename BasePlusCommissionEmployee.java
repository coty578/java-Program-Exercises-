public class BasePlusCommissionEmployee extends CommissionEmployee {
    double basesalary;
    public BasePlusCommissionEmployee(String n,int ssn,double gSale,double cRate,double bSalary){
        super(n, ssn, gSale, cRate);
        this.basesalary = bSalary;
    }
    double earning(){
        return super.earning() + this.basesalary;
    }
    
}
