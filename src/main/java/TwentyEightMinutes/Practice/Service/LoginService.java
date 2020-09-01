package TwentyEightMinutes.Practice.Service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String userid, String password){
        return userid.equalsIgnoreCase("Carlos") && password.equalsIgnoreCase("320790");
        //what happened to this file
    }
}
