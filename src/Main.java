//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                    case 1 -> "Mary";
                    case 2 -> "Carol";
                    case 3 -> "Tim";
                    case 4 -> "Harry";
                    case 5 -> "Lisa";
                        default -> "Anyon";
                    },
                    "12/20/1995",
                    "212"
                    );
            System.out.println(s);
        }

        Student pojoStudent = new Student("Java Master class", "1995", "Juwariya", "S299023");
        LPAStudent recordStudent = new LPAStudent("Java Master class", "1995", "Juwariya", "S299023");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClass());
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClass());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.dateOfBirth());
    }
}