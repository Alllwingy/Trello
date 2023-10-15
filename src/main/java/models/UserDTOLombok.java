package models;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.testng.annotations.Test;

@Builder
@Getter
@Setter
@ToString

public class UserDTOLombok {

    private String email;
    private String password;
}
