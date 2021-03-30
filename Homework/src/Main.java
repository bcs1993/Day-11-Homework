public class Main {
    public static void main(String[] args) {
        Teacher mrFrey = new Teacher("Mr", "Frey", "Frey@someschool.com", "burgersandFrey",
                "12345", 3, 10);
        mrFrey.absentDays();
        Admin brian = new Admin("Brian", "Smith", "brian.smith@admin.com", "bri123", "12345", 7, 20);
        brian.absentDays();



    }
}
