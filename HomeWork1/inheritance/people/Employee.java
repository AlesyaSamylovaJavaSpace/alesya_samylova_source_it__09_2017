package inheritance.people;

public class Employee extends Person {

    private String jobTitle;

    //Salary Info
    private Double salaryAmount;
    private String salaryCurrency;
    private String salaryFrequency;

    public Employee(){
        super();
    }

    public Employee(String name, String surname, String patronymicName, String jobTitle) {
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getSalaryInfo() {
        String salaryInfo = salaryAmount.toString() + " " + salaryCurrency + " per " + salaryFrequency;
        return salaryInfo;
    }

    public void setSalaryAmount(Double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public void setSalaryCurrency(String salaryCurrency) {
        this.salaryCurrency = salaryCurrency;
    }

    public void setSalaryFrequency(String salaryFrequency) {
        this.salaryFrequency = salaryFrequency;
    }

}
