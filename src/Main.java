import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creo oggetto di tipo Student passandogli 'name' e 'age'
        Student student = new Student("Riccardo", 29);
        Student student2 = new Student("Andrea", 22);
        Student student3 = new Student("Michele", 25);
        Student student4 = new Student("Iresha", 22);

        //creo una List come oggetto Student dove al suo interno avremo la lista di nome ed eta degli studenti
        List<Student> infoStudente = Arrays.asList(student, student2 , student3 , student4);
        //Stampo la prima lista
        System.out.println("Lista studenti : " + infoStudente);
        //creo un arraylist per aggiungere nuovi elementi alla lista
        ArrayList<Student> newStudentList = new ArrayList<>();
        newStudentList.add(new Student("Giovanni",21));
        newStudentList.add(new Student("Alberto", 23));
        newStudentList.add(new Student("Filippo", 30));
        newStudentList.add(new Student("Corrado", 18));
        //stampo la lista aggiornata
        System.out.print("Lista aggiornata : " + newStudentList);
    }
}