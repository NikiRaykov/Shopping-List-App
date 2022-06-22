package bg.softuni.shoppinglist.service;

import bg.softuni.shoppinglist.model.entity.service.UserServiceModel;

public interface UserService {
    UserServiceModel registerUser(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);

}
