package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
//    Contact findUserByEmail
}
