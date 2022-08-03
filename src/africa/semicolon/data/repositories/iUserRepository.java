package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface iUserRepository extends MongoRepository<User, String> {
    User findUserByEmail(String email);
}
