package africa.semicolon.services;

import africa.semicolon.data.models.Contact;
import africa.semicolon.data.models.User;
import africa.semicolon.dtos.requests.AddContactRequest;
import africa.semicolon.dtos.requests.RegisterRequest;
import africa.semicolon.dtos.requests.UpdateContactRequest;
import africa.semicolon.dtos.requests.UpdateUserRequest;
import africa.semicolon.dtos.responses.*;

import java.util.List;

public interface iUserService {

    //String register(String userName, String password, String id, String email);
    RegisterResponse register(RegisterRequest request); //we call this class instead of typing instance variables
    User findUser(String userEmail);
    AddContactResponse addContactResponse(AddContactRequest addRequest);
    UpdateUserResponse updateUser(String email, UpdateUserRequest request);

    List<AllContactResponse> findContactsBelongingTo(String userEmail);

    UpdateContactResponse updateContact(String userEmail, String contactEmail, UpdateContactRequest updateContactRequest);

    Contact findContactByEmail(String userEmail, String contactEmail);

    void deleteContact(String userEmail, String contactEmail);

    //AddContactResponse addResponse(AddContactRequest addRequest);

    //int getNumberOfUsers();







    UpdateContactResponse updateContact(String userEmail, String contactEmail, UpdateContactRequest updateContactRequest);

    Contact findContactByEmail(String userEmail, String contactEmail);

    void deleteContact(String userEmail, String contactEmail);
}
