public class Main{
    public static void main(String[] args) {
        Employee emp=new Employee("Arif");
        emp.calculateBonus();

        Contractor contractor=new Contractor("Emon");
        contractor.completeContractWork();
    }
}


class TeamMember{
    protected String name;

    public TeamMember(String name){
        this.name = name;
    }
}

class Employee extends TeamMember{
    public Employee(String name){
        super(name);
    }

    public void calculateBonus(){
        System.out.println("Calculating standard employee bonus...");
    }
}

class Contractor extends TeamMember{
    public Contractor(String name){
        super(name);
    }

    public void completeContractWork() {
        System.out.println("Completing contract work...");
    }
}
