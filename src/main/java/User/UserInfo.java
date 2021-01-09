package User;

public class UserInfo {

    //fields
    private String firstName;
    private String lastName;
    private String email;
    private int numberOfTokens;
    private String phoneNumber;
    private boolean needRide;
    private boolean offeringRides;
    private String userName;
    private String password;

    public UserInfo(String firstName, String lastName, String email, String phoneNumber, String userName, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
        numberOfTokens = 1;
        needRide = false;
        offeringRides = false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfTokens() {
        return numberOfTokens;
    }

    public void setNumberOfTokens(int numberOfTokens) {
        this.numberOfTokens = numberOfTokens;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isNeedRide() {
        return needRide;
    }

    public void setNeedRide(boolean needRide) {
        this.needRide = needRide;
    }

    public boolean isOfferingRides() {
        return offeringRides;
    }

    public void setOfferingRides(boolean offeringRides) {
        this.offeringRides = offeringRides;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
