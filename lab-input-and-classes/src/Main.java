import javax.sound.midi.Soundbank;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee1 =  new Employee("Henry", "henry@example.com", 46, 30000);
        Intern intern1 = new Intern("John", "john@example.com", 33, 10000);

        System.out.println(employee1.getEmail());
        System.out.println(intern1.getSalary());


    }
}