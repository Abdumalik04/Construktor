import javax.swing.*;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
 /*       City osh= new City("Osh",1000000,182,"Kyrgyz","Almaz Mambetov",new String[]{"Kelechekr","Anar","Alai,","Vostok"});
        for (String dis:osh.getDistrics()) {
            System.out.println(dis);
        }
City city1=new City("Bishkek",1300000,169,"Kyrgyz","Emirbek");
        System.out.println(city1.getName());*/

/*   //TODO


     Shark shark=new Shark("Blue",'M');
        System.out.println(shark.getColor()+shark.getGender());

        Parrot parrot=new Parrot("Red",'W');
        System.out.println(parrot.getColor()+parrot.getGender());

        Lion lion=new Lion("Yellow",'M');
        System.out.println(lion.getColor()+parrot.getGender());*/
  /*  //TODO misal

      Triangle triangle=new Triangle(5,5);
        System.out.println(triangle.getA()*triangle.getS()/  2);*/
/*//TODO yido sosyz chugaram

        Student student = new Student("Malik: ", LocalDate.of(2004, 5, 28), "0220066053", "Kyrgyz");
        Student student1 = new Student("Adilet brat: ", LocalDate.of(2001, 1, 3), "0708819011", "Kyrgyz");
        Student student2 = new Student("Erjigit: ", LocalDate.of(2004, 2, 17), "0550460625", "Kyrgyz");
        Student student3 = new Student("Cristiano: ", LocalDate.of(1985, 2, 3), "0777777777", "Portugales");
        Student student4 = new Student("Kanymgyl: ", LocalDate.of(2003, 4, 24), "0220425943", "Kyrgyz");

        Student[] students = new Student[]{student, student1, student2, student3, student4};
        for (Student s : students) {
            System.out.println(s.getName() + "" + s.getDate() + " " + s.getPhoneNumber() + " " + s.getNatinolity());
        }
    }*/
        //TODO CHUKTYY

        Phone phone = new Phone("Iphone15 Pro Max", "Ios16", "15,2 дюм");
        phone.setMemory("512gb");
        phone.setPrice(200);
        System.out.println(phone.getBrand() + " " + phone.getVersion() + " " + phone.getScreen());
        System.out.println(phone.getMemory() + " " + phone.getPrice());

        Phone phone1 = new Phone("poko x3 pro", "Android 16", "12.4");
        phone1.setMemory("128gb");
        phone1.setPrice(300);
        System.out.println(phone1.getBrand() + " " + phone1.getVersion() + " " + phone1.getScreen());
        System.out.println(phone1.getMemory() + " " + phone1.getPrice());

        Phone phone2 = new Phone("redmi", "Android 3", "8.7");
        phone2.setMemory("64gb");
        phone2.setPrice(500);
        System.out.println(phone2.getBrand() + " " + phone2.getVersion() + " " + phone2.getScreen());
        System.out.println(phone2.getMemory() + " " + phone2.getPrice());

        Phone phone3 = new Phone("redmi 12t", "Android 13", "12.o");
        phone3.setMemory("1t");
        phone3.setPrice(1000);
        System.out.println(phone3.getBrand() + " " + phone3.getVersion() + " " + phone3.getScreen());
        System.out.println(phone3.getMemory() + " " + phone3.getPrice());

        Phone phone4 = new Phone("samsung", "Android 13", "12.8");
        phone4.setMemory("512");
        phone4.setPrice(100);
        System.out.println(phone4.getBrand() + " " + phone4.getVersion() + " " + phone4.getScreen());
        System.out.println(phone4.getMemory() + " " + phone4.getPrice());


        Person person1 = new Person("Aiba", 15, "footbal: ", 10, phone);
        Person person2 = new Person("Adilet", 22, "It: ", 200, phone1);
        Person person3 = new Person("Adi", 27, "xokei: ", 20, phone2);
        Person person4 = new Person("Ajo", 30, "pole: ", 70, phone3);
        Person person5 = new Person("Asho", 18, "bugalter: ", 12, phone);
        Person[] persona = {person1, person2, person3, person4, person5};
        int min = person5.getSalary();
        int max = person5.getSalary();
        int kop = 0;
        for (Person p : persona) {
            System.out.println(p.getName() + " " + p.getAge() + " " + p.getWork() + "" + p.getSalary() + " " + p.getPhone().getBrand());
        }
        for (int i = 0; i < persona.length; i++) {
            if (min > persona[i].getSalary()) {
                min = persona[i].getSalary();
            } else if (max < persona[i].getSalary()) {
                max = persona[i].getSalary();
            }
            if (kop<persona[i].getPhone().getPrice()) {
                kop = persona[i].getPhone().getPrice();
            }
        }
        System.out.println("Телефону эн кымбаты: "+kop+"$");
        System.out.println("Зарплатасы коп алганы: "+max+"мин$");
        System.out.println("Зарплатаны аз алганы: "+min+"мин$");
    }

}
