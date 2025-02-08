package in.decx.userService.service;

import in.decx.userService.entity.Users;
import in.decx.userService.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRespository userRespository;

    public Optional<Users> findByUsername(String username){
        return userRespository.findByUsername(username);
    }

    public List<Users> getAllUsers(){
        return userRespository.findAll();
    }

    public Users save(Users user){
        return userRespository.save(user);
    }
}
