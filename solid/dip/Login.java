package solid.dip;

public class Login {
    
    private UserGateway userGateway;

    public Login(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public String execute(String nickname, String password) {
        User user = userGateway.findUserByNickname(nickname);

        if (user.getPassword() != password) {
            throw new Error("The given password is wrong. Try again!");
        }

        return "Successfully logged";
    }

}
