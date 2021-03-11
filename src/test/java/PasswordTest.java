import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    @Test
    void testCheckPassword_Larger8() {
        Password pw = new Password("aRA4%wersa");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertEquals(true, actual);
    }
    @Test
    void testCheckPassword_Smaller8() {
        Password pw = new Password("as3rSa");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertEquals(false, actual);
    }
    @Test
    void testCheckPassword_Larger25() {
        Password pw = new Password("as34%we3453457ghZgzret235dfh65rtzh456rtz54rsa");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertEquals(false, actual);
    }
    @Test
    void testCheckPassword_Smaller25() {
        Password pw = new Password("wEHsa3456");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertTrue(actual);
    }
    @Test
    void testCheckPassword_Length25() {
        Password pw = new Password("123456a89TZJ/&(4567U");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertTrue(actual);
    }
    @Test
    void testCheckPassword_Length8() {
        Password pw = new Password("wERTrs3456");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertTrue(actual);
    }
    @Test
    void testCheckPassword_OnlyLowerCase() {
        Password pw = new Password("werswertet3421");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @Test
    void testCheckPassword_OnlyBiggerCase() {
        Password pw = new Password("WERTDFGESDF3456");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @Test
    void testCheckPassword_NoCases() {
        Password pw = new Password("32&§!/34(/$3456");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }
    @Test
    void testCheckPassword_NoNumbers() {
        Password pw = new Password("aWrt%rtz%&/dfg");
        boolean actual = pw.checkPassword(pw.getPassword());
        assertFalse(actual);
    }



}
