import org.example.TextCasing;
import org.example.TextCasingSoapType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TextCasingUnitTest {
    private TextCasingSoapType textCasingSoap;

    @BeforeAll
    void initialize() {
        this.textCasingSoap = new TextCasing().getTextCasingSoap();
    }

    @Test
    public void testUpperCaseWordsWithToken() {
        String result = this.textCasingSoap.allUppercaseWithToken("test","@");
        Assertions.assertEquals("@T@E@S@T@", result);
    }
}
