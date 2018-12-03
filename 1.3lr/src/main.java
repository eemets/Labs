import java.util.Scanner;

public class main {
    public static void main(String[] args){
        var in = new Scanner(System.in);
        var out = System.out;

        try{
            out.print("Enter id\t");
            long ID = Long.parseLong(in.next());
            out.print("Enter first name\t");
            StringBuilder firstName = new StringBuilder(in.next());
            out.print("Enter middle name\t");
            StringBuilder midName = new StringBuilder(in.next());
            out.print("Enter last name\t");
            StringBuilder lastName = new StringBuilder(in.next());
            out.print("Enter address\t");
            StringBuilder address = new StringBuilder(in.next());
            out.print("Enter phone number\t");
            long phoneNum = Long.parseLong(in.next());
            out.print("Enter number of card\t");
            long numCard = Long.parseLong(in.next());
            out.print("Enter diagnose\t");
            StringBuilder diagnose = new StringBuilder(in.next());

            var p1 = new Patient(ID, firstName, lastName, midName, address,phoneNum,numCard,diagnose);
            out.print(p1.toString());
        }catch (Exception ex){
            out.print(ex.toString());

        }





        //var sb = new StringBuilder();
        /*try{
            out.print("Enter id\t");
            p1.setID(in.nextLong());
            out.print("Enter first name\t");
            p1.setFirstName(sb.append(in.next()));
            out.print("Enter middle name\t");
            p1.setMidName(sb.append(in.next()));
            out.print("Enter last name\t");
            p1.setLastName(sb.append(in.next()));
            out.print("Enter address\t");
            p1.setAddress(sb.append(in.next()));
            out.print("Enter phone number\t");
            p1.setPhoneNum(in.nextLong());
            out.print("Enter number of card\t");
            p1.setNumCard(in.nextLong());
            out.print("Enter diagnose\t");
            p1.setDiagnose(sb.append(in.next()));
        }catch (Exception ex){
            out.print(ex.toString());

            out.print("\n\n");
            out.print(p1.toString());
        }*/
    }
}
