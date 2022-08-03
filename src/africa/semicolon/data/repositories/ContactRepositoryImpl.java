package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository{
    private int counter;
    private List<Contact> listOfContacts = new ArrayList<>();

    @Override
    public Contact save(Contact contact) {
        if(contact.getId() == 0){ // for saving new contact
            counter++;
            contact.setId(counter); //for finding already existing contact
            listOfContacts.add(contact);
            return contact;
        }
        delete(contact.getId());// deletes the already existing contact
        listOfContacts.add(contact); // adds a new one (replacing old with new)
        return contact;

    }

    @Override
    public void delete(Contact contact) {

    }

    @Override
    public void delete(int id) {
        for (var contact: listOfContacts){
            if (contact.getId() == id){
                listOfContacts.remove(contact);
                break;
            }
        }
    }

    @Override
    public Contact findById(int id) {
        for(var contact: listOfContacts){
            if (contact.getId() == id){
                return contact;
            }
        }
        return null;
    }

    @Override
    public List<Contact> findByFisrtName(String firstName) {
        return null;
    }

    @Override
    public List<Contact> findBylastName(String ucj) {
        return null;
    }

    @Override
    public List<Contact> findAll() {
        return listOfContacts;
    }

    @Override
    public int count() {
        //return counter; //this only for saving the first contact
        return listOfContacts.size(); //Arrays of contacts is used here
    }
}
