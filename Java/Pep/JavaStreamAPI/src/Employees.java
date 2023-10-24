
import java.util.Arrays;
import java.util.stream.Stream;

public class Employees {
    public static void main(String[] args) {
        //Stream<String> employees = Stream.of("Oikith","Durga","Uraveen","Krishna","Vamsi");
        //Stream<String> filteredEMployees = employees.filter(v -> v.charAt(0)=='A'||v.charAt(0)=='E'||v.charAt(0)=='I'||v.charAt(0)=='O'||v.charAt(0)=='U');
        //filteredEMployees.forEach(ele -> System.out.println(ele) );
        //Stream<String> upperCaseProducts  = employees.map( item->item.toUpperCase());
        //upperCaseProducts.forEach(item ->System.out.println(item) ) ;
        Stream<Integer> poundWeight = Stream.of(110,145,180,174,192,180);
        Stream<Double> kgWeight = poundWeight.map(i->(i*0.453592));
        kgWeight.forEach(i-> System.out.println(i));

    }
}
