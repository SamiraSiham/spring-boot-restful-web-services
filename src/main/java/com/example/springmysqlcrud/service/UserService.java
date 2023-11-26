package com.example.springmysqlcrud.service;
import com.example.springmysqlcrud.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springmysqlcrud.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public User saveUser(User user){
        return repository.save(user);
    }
    public List<User> saveUsers(List<User> users){
        return repository.saveAll(users);
    }
    public List<User> getUsers(){
        return repository.findAll();
    }
    public User getUserById(int id){
        return repository.getReferenceById(id);
    }
    public String deleteUser(int id){
        repository.deleteById(id);
        return "User Deleted";
    }
    public User updateUser(User user){
        User existingUser = repository.getReferenceById(user.getId());
        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());
        existingUser.setAddress(user.getAddress());
        return repository.save(existingUser);
    }
}
