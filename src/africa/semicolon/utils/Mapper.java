package africa.semicolon.utils;

import africa.semicolon.data.models.Contact;
import africa.semicolon.data.models.User;
import africa.semicolon.dtos.requests.AddContactRequest;
import africa.semicolon.dtos.requests.RegisterRequest;
import africa.semicolon.dtos.responses.AllContactResponse;

public class Mapper {

    public static void map(RegisterRequest request, User user){
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassword(request.getPassword());
//        user.setId(request.getId());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setEmail(request.getEmail());


    }
    public  static void  map(AddContactRequest addContactRequest, Contact contact) {
        contact.setFirstName(addContactRequest.getFirstName());
        contact.setLastName(addContactRequest.getLastName());
        contact.setPhoneNumber(addContactRequest.getPhoneNumber());
        contact.setEmail(addContactRequest.getEmail());
    }
    public static void map(Contact contact, AllContactResponse singleResponse) {
        singleResponse.setId(contact.getId()+"");
        singleResponse.setLastName(contact.getLastName());
        singleResponse.setFirstName(contact.getFirstName());
    }
}
