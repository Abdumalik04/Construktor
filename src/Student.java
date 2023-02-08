import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate date;

    private  String phoneNumber;
   private String natinolity;

   public Student(String name,LocalDate date,String phoneNumber,String natinolity){
       this.name=name;
       this.date=date;
       this.phoneNumber=phoneNumber;
       this.natinolity=natinolity;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNatinolity() {
        return natinolity;
    }

    public void setNatinolity(String natinolity) {
        this.natinolity = natinolity;
    }

}
