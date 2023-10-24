abstract class Doctor {
    abstract void treat();
}
class Physician extends Doctor {
    public void treat() {
        System.out.println("I treat patients with medicine");
    }
}
class Surgeon extends Doctor {
    public void treat() {
        System.out.println("I treat patients with Surgery");
    }
}
class Dentist extends Doctor {
    public void treat() {
        System.out.println("I treat patients teeth");
    }
}

public class Program3 {
    public static void main(String[] args) {
        Doctor doc = null;
        System.out.println("1. Physician, 2.Surgeon, 3.Dentist");
        int choice = new java.util.Scanner(System.in).nextInt();
        if(choice==1) doc = new Physician();
        else if (choice==2) {
            doc = new Surgeon();
        }
        else if (choice==2) {
            doc = new Surgeon();
        }
        doc.treat();
    }
}
