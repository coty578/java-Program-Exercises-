public class MainClassTest {
    public static void main(String[] args) {
        Employee e1 = new HourlyEmployee("jack sparrow",789745, 30, 35);
        Employee e2 = new SalariedEmployee("jane parker", 789745, 1800);
        Employee e3 = new CommissionEmployee("tom jerry", 212334, 100000, 0.1);
        Employee e4 = new BasePlusCommissionEmployee("john zuckerberg", 212314, 1000000, 0.1, 500000);

        Employee[] employees = new Employee[]{e1,e2,e3,e4};
        for(Employee e:employees){
            System.out.println(e + " salary:"+e.earning());
        }

        
    }
}
