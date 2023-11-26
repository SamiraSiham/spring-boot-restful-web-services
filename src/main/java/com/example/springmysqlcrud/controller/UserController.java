package com.example.springmysqlcrud.controller;
import com.example.springmysqlcrud.entity.User;
import com.example.springmysqlcrud.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }
    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users){
        return service.saveUsers(users);
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return service.getUsers();
    }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        return service.getUserById(id);
    }
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return service.updateUser(user);
    }
    @DeleteMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }   
}
