/*Github: https://github.com/todoroal/prog2-ss21-exercise1*/
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    @DisplayName("Password larger then 8")
    @Test
    void testCheckPassword_Larger8() {
        Password pw = new Password("aRA4%wTzsa");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertTrue(actual);
    }
    @DisplayName("Password smaller then 8")
    @Test
    void testCheckPassword_Smaller8() {
        Password pw = new Password("as3$rSa");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @DisplayName("Password larger then 25")
    @Test
    void testCheckPassword_Larger25() {
        Password pw = new Password("as34%we3453457ghZgzret235dfh65rtzh456rtz54rsa");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @DisplayName("Password smaller then 25")
    @Test
    void testCheckPassword_Smaller25() {
        Password pw = new Password("wEH$sa39T6");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertTrue(actual);
    }
    @DisplayName("Password-Length = 25")
    @Test
    void testCheckPassword_Length25() {
        Password pw = new Password("12t6a89TZJ%(47UzpeTzc7k9l");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertTrue(actual);
    }
    @DisplayName("Password-Length = 8")
    @Test
    void testCheckPassword_Length8() {
        Password pw = new Password("wERTf%56");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertTrue(actual);
    }
    @DisplayName("Password no UpperCase")
    @Test
    void testCheckPassword_NoUpperCase() {
        Password pw = new Password("aretni34%21");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @DisplayName("Password no LowerCase")
    @Test
    void testCheckPassword_NoLowerCase() {
        Password pw = new Password("WERTDFGESD%F34914");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @DisplayName("Password no Letters")
    @Test
    void testCheckPassword_NoLatters() {
        Password pw = new Password("32!794781509");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @DisplayName("Password no Numbers")
    @Test
    void testCheckPassword_NoNumbers() {
        Password pw = new Password("aWrt%rtz%dfg");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @DisplayName("Password no special Character")
    @Test
    void testCheckPassword_NoSpecialCharacter() {
        Password pw = new Password("aWrtrtzd23Ffg");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @DisplayName("Password wrong special Character")
    @Test
    void testCheckPassword_WrongSpecialCharacter() {
        Password pw = new Password("aWunrt$%_zd23Ffg");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @DisplayName("Password continuous Numbers")
    @Test
    void testCheckPassword_ContinuousNumbers() {
        Password pw = new Password("aWrtrt12354S%zd23Ffg");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @DisplayName("Password same Numbers")
    @Test
    void testCheckPassword_SameNumbers() {
        Password pw = new Password("aWrtrt1111S%zd23Ffg");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
}
