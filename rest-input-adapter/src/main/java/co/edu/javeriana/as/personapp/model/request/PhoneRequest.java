package co.edu.javeriana.as.personapp.model.request;

import co.edu.javeriana.as.personapp.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneRequest {

    private String number;
    private String company;
    private String ownerId;
    private String database;

}
