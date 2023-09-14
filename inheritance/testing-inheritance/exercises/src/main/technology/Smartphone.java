package technology;

public class Smartphone extends Computer{
    //TODO at least 1 additional property and 1 additional method
    private boolean isIphone = false;
    private boolean isTouchScreen = false;

    private String nickname;




    public Smartphone(int speed, int memorySize, String computerName, String aNickname) {
        super(speed, memorySize, computerName);
        nickname = aNickname;
    }


    public String typeOfPhone() {
        if (!isTouchScreen) {
            isIphone = false;
            return "This is not an Iphone!";
        }
        isIphone = true;
        return "This is an Iphone!";
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
