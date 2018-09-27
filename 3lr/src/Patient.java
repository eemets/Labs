public class Patient {
    private long ID;
    private String firstName;
    private String lastName;
    private String midName;
    private String address;
    private long phoneNum;
    private long numCard;
    private String diagnose;

    Patient(){
        ID = phoneNum = numCard = 0;
        firstName = lastName = midName = address = diagnose = "noname";
    }
    private long getID(){return ID;}
    private String getFirstName(){return firstName;}
    private String getLastName(){return lastName;}
    private String getMidName(){return  midName;}
    private String getAddress(){return address;}
    private long getPhoneNum(){return phoneNum;}
    private long getNumCard(){return numCard;}
    private String getDiagnose(){return diagnose;}
    String getAllFormatted(){
        return "Ідентифікаційний номер\t" + getID() + "\n" +
                "Ім'я\t" + getFirstName() + "\n" +
                "По-батькові\t" + getMidName() + "\n" +
                "Прізвище\t" + getLastName() + "\n" +
                "Адреса\t" + getAddress() + "\n" +
                "Номер телефону\t" + getPhoneNum() + "\n" +
                "Номер картки\t" + getNumCard() + "\n" +
                "Діагноз\t" + getDiagnose() + "\n";
    }

    void setID(long ID){this.ID = ID;}
    void setFirstName(String firstName){this.firstName = firstName;}
    protected void setLastName(String lastName){this.lastName = lastName;}
    protected void setMidName(String midName){this.midName = midName;}
    protected void setAddress(String address){this.address = address;}
    protected void setPhoneNum(long phoneNum){this.phoneNum = phoneNum;}
    protected void setNumCard(long numCard){this.numCard = numCard;}
    protected void setDiagnose(String diagnose){this.diagnose = diagnose;}
}
