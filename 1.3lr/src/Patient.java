class Patient {
    private long ID;
    private StringBuilder firstName;
    private StringBuilder lastName;
    private StringBuilder midName;
    private StringBuilder address;//
    private long phoneNum;
    private long numCard;
    private StringBuilder diagnose;

    Patient(){
        ID = phoneNum = numCard = 0;
        firstName = lastName = midName = address = diagnose = new StringBuilder("none");
    }
    Patient(long ID, StringBuilder firstName,StringBuilder lastName, StringBuilder midName, StringBuilder address,
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

    void setID(long ID){this.ID = ID;}
    void setFirstName(StringBuilder firstName){this.firstName = firstName;}
    void setLastName(StringBuilder lastName){this.lastName = lastName;}
    void setMidName(StringBuilder midName){this.midName = midName;}
    void setAddress(StringBuilder address){this.address = address;}
    void setPhoneNum(long phoneNum){this.phoneNum = phoneNum;}
    void setNumCard(long numCard){this.numCard = numCard;}
    void setDiagnose(StringBuilder diagnose){this.diagnose = diagnose;}

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
}
