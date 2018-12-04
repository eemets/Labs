import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.AccessException;
import java.util.Properties;
class Patient_test {
    private final long ID;
    private final StringBuilder firstName;
    private final StringBuilder lastName;
    private final StringBuilder midName;
    private final StringBuilder address;//
    private final long phoneNum;
    private final long numCard;
    private final StringBuilder diagnose;

    Patient_test(long ID, StringBuilder firstName,StringBuilder lastName, StringBuilder midName, StringBuilder address,
                 long phoneNum, long numCard, StringBuilder diagnose){
        this.ID = ID; this.firstName=firstName;this.lastName=lastName;
        this.midName=midName; this.address=address;
        this.phoneNum=phoneNum; this.numCard=numCard;
        this.diagnose=diagnose;
    }

    long getID(){return ID;}
    StringBuilder getFirstName(){return firstName;}
    StringBuilder getLastName(){return lastName;}
    StringBuilder getMidName(){return  midName;}
    StringBuilder getAddress(){return address;}
    long getPhoneNum(){return phoneNum;}
    long getNumCard(){return numCard;}
    StringBuilder getDiagnose(){return diagnose;}

    @Override
    public String toString() {
        return "Ідентифікаційний номер\t" + ID + "\n" +
                "Ім'я\t" + firstName.toString() + "\n" +
                "По-батькові\t" + midName.toString() + "\n" +
                "Прізвище\t" + lastName.toString() + "\n" +
                "Адреса\t" + address.toString() + "\n" +
                "Номер телефону\t" + phoneNum + "\n" +
                "Номер картки\t" + numCard + "\n" +
                "Діагноз\t" + diagnose.toString() + "\n";
    }

    public static class Builder{

        Properties properties = new Properties();
        {
            try {
                properties.load(new FileInputStream(new File("main.properties")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private long ID;
        private StringBuilder firstName = new StringBuilder(properties.getProperty("none.str"));
        private StringBuilder lastName = new StringBuilder(properties.getProperty("none.str"));
        private StringBuilder midName = new StringBuilder(properties.getProperty("none.str"));
        private StringBuilder address = new StringBuilder(properties.getProperty("none.str"));
        private long phoneNum = Long.parseLong(properties.getProperty("none.num"));
        private long numCard = Long.parseLong(properties.getProperty("none.num"));
        private StringBuilder diagnose = new StringBuilder(properties.getProperty("none.str"));


        Builder setID(long ID){
            this.ID = ID;
            return this;
        }
        Builder setFirstName(StringBuilder firstName){
            this.firstName = firstName;
            return this;
        }
        Builder setLastName(StringBuilder lastName){
            this.lastName = lastName;
            return this;
        }
        Builder setMidName(StringBuilder midName){
            this.midName = midName;
            return this;
        }
        Builder setAddress(StringBuilder address){
            this.address = address;
            return this;
        }
        Builder setPhoneNum(long phoneNum){
            this.phoneNum = phoneNum;
            return this;
        }
        Builder setNumCard(long numCard){
            this.numCard = numCard;
            return this;
        }
        Builder setDiagnose(StringBuilder diagnose){
            this.diagnose = diagnose;
            return this;
        }
        public Patient_test build(){
            return new Patient_test(ID, firstName, lastName, midName, address, phoneNum, numCard, diagnose);
        }
    }
}
