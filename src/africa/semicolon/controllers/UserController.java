package africa.semicolon.controllers;

import africa.semicolon.dtos.requests.AddContactRequest;
import africa.semicolon.dtos.requests.RegisterRequest;
import africa.semicolon.dtos.responses.AddContactResponse;
import africa.semicolon.dtos.responses.AllContactResponse;
import africa.semicolon.dtos.responses.RegisterResponse;
import africa.semicolon.services.UserService;
import africa.semicolon.services.iUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {

    private iUserService iUserService =new UserService();
    @PostMapping("/user")
    public RegisterResponse registerUser(@RequestBody RegisterRequest registerRequest){
        return iUserService.register(registerRequest);
    }
    @PatchMapping("/user")
    public AddContactResponse addContact(@RequestBody AddContactRequest addContactRequest){
        return iUserService.addContactResponse(addContactRequest);
    }
    @GetMapping("/user/{email}")
    public List<AllContactResponse>findAllcontacts(@PathVariable String email){
        return iUserService.findContactsBelongingTo(email);
    }
}
