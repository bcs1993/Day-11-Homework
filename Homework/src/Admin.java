public class Admin extends User{
    int ptoDays;

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    public Admin(String firstName, String lastName, String email, String userName, String password, int absences, int ptoDays) {
        super(firstName, lastName, email, userName, password, absences);
        this.ptoDays = ptoDays;
    }

    public Admin(String firstName, String lastName, String email, String userName, String password, int absences) {
        super(firstName, lastName, email, userName, password, absences);
    }

    @Override
    public void absentDays() {
        int absences = getAbsences() ;
        setPtoDays(ptoDays - absences);
        System.out.println("You have " + getPtoDays() + " PTO days left!");

    }
}
