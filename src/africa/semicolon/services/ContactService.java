package africa.semicolon.services;

import africa.semicolon.data.models.Contact;
import africa.semicolon.data.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService implements IContactService {

    @Autowired
    private ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    @Override
    public Contact addNewContact(Contact contact) {
        return contactRepository.save(contact);
    }

//    @Override
//    public int size() {
//        return contactRepository.count();
//    }
}
