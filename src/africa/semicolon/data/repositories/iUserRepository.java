package africa.semicolon.data.repositories;

import africa.semicolon.data.models.User;

public interface iUserRepository extends MongoRepository<User, String> {
//    User save(User user);
//    void delete(User user);
//    void delete(String email);
//    List<User> findAll();
//    int count();

    User findByEmail(String email);


}
