public class CommissionEmployee extends Employee {
    double grossSale;
    double commissionRate;
    public CommissionEmployee(String n,int ssn,double gSale,double cRate){
        super(n, ssn);
        this.grossSale = gSale;
        this.commissionRate = cRate;
    }
    double earning(){
        return grossSale * commissionRate;
    }
    public String toString(){
        return super.toString() + " gSale:"+this.grossSale +" cRate :"+this.commissionRate;
    } 
}
