package africa.semicolon.services;

import africa.semicolon.data.models.Contact;

public interface iContactService {

    Contact addNewContact(Contact contact);

    int getNumberOfContacts();
}
