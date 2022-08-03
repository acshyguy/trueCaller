//package africa.semicolon.data.repositories;
//
//import africa.semicolon.data.repositories.models.Contact;
//import africa.semicolon.data.repositories.repositories.ContactRepository;
//
//public class ContactRepositoryImplTest {
//
//    @Test
//    public void saveTest(){
//        ContactRepository contactRepository = new ContactRepositorylmpl();
//
//        Contact contact = new Contact();
//
//        contact.setPhoneNumber("08100123749");
//        contact.setFirstName("Ojo");
//        contact.setLastName("Odogwu");
//        contact.setEmail("Odogwu@gmail.com");
//
//        contactRepository.save(contact);
//
//        assertEquals(1,contactRepository.count());
//    }
//    @Test
//    public void saveContact_findByIdTest(){
//        ContactRepository contactRepository = new ContactRepositorylmpl();
//
//        Contact contact = new Contact();
//        contact.setPhoneNumber("08100123749");
//        contact.setFirstName("Ojo");
//        contact.setLastName("Odogwu");
//        contact.setEmail("Odogwu@gmail.com");
//
//        contactRepository.save(contact);
//        assertEquals(1,contactRepository.count());
//
//        Contact savedContact = contactRepository.findById(1);
//        assertEquals("Ojo",savedContact.getFirstName());
//    }
//    @Test
//    public void saveContact_deleteContactByIDTest() {
//        ContactRepository contactRepository = new ContactRepositorylmpl();
//
//        Contact contact = new Contact();
//        contact.setPhoneNumber("08100123749");
//        contact.setFirstName("Ojo");
//        contact.setLastName("Odogwu");
//        contact.setEmail("Odogwu@gmail.com");
//
//        contactRepository.save(contact);
//        assertEquals(1,contactRepository.count());
//
//        contactRepository.delete(1);
//        assertEquals(0,contactRepository.count());
//    }
//    @Test
//    public void saveContact_replaceExistingContactByIdTest() {
//        ContactRepository contactRepository = new ContactRepositorylmpl();
//
//        Contact contact = new Contact();
//        contact.setPhoneNumber("123456789");
//        contact.setFirstName("AC");
//        contact.setLastName("Obeleagu");
//        contact.setEmail("Obeleagu.e@gmail.com");
//
//        contactRepository.save(contact);
//        assertEquals(1,contactRepository.count());
//
//        Contact foundContact = contactRepository.findById(1);
//        foundContact.setFirstName("odogwu");
//
//        contactRepository.save(foundContact);
//
//        assertEquals(1,contactRepository.count());
//        assertEquals("odogwu",foundContact.getFirstName());
//
//
//    }
//}
