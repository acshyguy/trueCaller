package africa.semicolon.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document("Contacts")
public class Contact {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
}


