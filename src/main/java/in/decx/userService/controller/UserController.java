package in.decx.userService.controller;

import in.decx.userService.entity.Users;
import in.decx.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }

    public Users saveUser(Users users){
        return userService.save(users);
    }
}
