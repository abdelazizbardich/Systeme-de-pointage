package JDBC101.serviceImpl;

import JDBC101.daoImpl.userDaoImp;
import JDBC101.model.User;
import JDBC101.service.userService;

import java.util.List;

public class UserServiceImpl implements userService {
    
    private userDaoImp userDaoImp = new userDaoImp();


    @Override
    public void addUser(User user) {

        userDaoImp = new userDaoImp();
        userDaoImp.saveUser(user);
    }

    @Override
    public User fetchUserById(long id_user) {




        return userDaoImp.getUser(id_user);
    }

    @Override
    public void deleteUserById(User user) {
        userDaoImp.deleteUser(user.getId_user());
        
    }



    @Override
    public List<User> getAllUsers() {
        return userDaoImp.getAllUser();
    }

}
