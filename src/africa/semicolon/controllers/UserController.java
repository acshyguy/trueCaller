package africa.semicolon.controllers;

import africa.semicolon.dtos.requests.AddContactRequest;
import africa.semicolon.dtos.requests.RegisterRequest;
import africa.semicolon.dtos.responses.AddContactResponse;
import africa.semicolon.dtos.responses.AllContactResponse;
import africa.semicolon.dtos.responses.RegisterResponse;
import africa.semicolon.exceptions.UserExistsException;
import africa.semicolon.services.UserService;
import africa.semicolon.services.iUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {

    private iUserService userService;
    @PostMapping("/user")
    public ResponseEntity<?> registerUser(@RequestBody RegisterRequest registerRequest){
        try{
            RegisterResponse serviceResponse = userService.register(registerRequest);
            return new ResponseEntity<>(serviceResponse, HttpStatus.CREATED);
        }catch (UserExistsException err){
            return new ResponseEntity<>(err.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
    @PatchMapping("/user")
    public AddContactResponse addContact(@RequestBody AddContactRequest addContactRequest){
        return userService.addContactResponse(addContactRequest);
    }
    @GetMapping("/user/{email}")
    public List<AllContactResponse>findAllcontacts(@PathVariable String email){
        return userService.findContactsBelongingTo(email);
    }
}
