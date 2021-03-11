import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordTest {

    @Test
    void testCheckPassword_lengthSc1() {
        Password pw = new Password("W145cgt&zu/$");
        boolean actual = pw.checkPassword(pw.getPassword());


    }

}
