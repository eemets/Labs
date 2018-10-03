import java.util.Scanner;

public class main {
    public static void main(String[] args){
        var in = new Scanner(System.in);
        var out = System.out;

        var p1 = new Patient();
        try{
            out.print("Enter id\t");
            p1.setID(in.nextLong());
            out.print("Enter first name\t");
            p1.setFirstName(in.next());
            out.print("Enter middle name\t");
            p1.setMidName(in.next());
            out.print("Enter last name\t");
            p1.setLastName(in.next());
            out.print("Enter address\t");
            p1.setAddress(in.next());
            out.print("Enter phone number\t");
            p1.setPhoneNum(in.nextLong());
            out.print("Enter number of card\t");
            p1.setNumCard(in.nextLong());
            out.print("Enter diagnose\t");
            p1.setDiagnose(in.next());

            out.print("\n\n");
            out.print(p1.printAllFormatted());
        }catch (Exception ex){
            out.print(ex.toString());
        }
    }
}
