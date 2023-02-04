import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String item;
        int quantity;
        double weight;
        double pricePerPiece;
        LocalDate dateOfIssue;
        boolean isDiscounted;

        item = "Trekové boty Sedmimilovky";
        quantity = 3;
        weight = 0.45;
        pricePerPiece = 1800;
        dateOfIssue = LocalDate.of(2022,4,7);
        isDiscounted = true;

        quantity = 2;
        pricePerPiece = 1990;
        int doprava = 45;

        System.out.println("Celková hmotnost zásilky je: " + (quantity * weight));
        System.out.println("Celková cena zásilky je: " + (quantity * pricePerPiece));
        System.out.println("Celková cena zásilky s dopravou je: " + ((quantity * pricePerPiece) + doprava));


    }
}