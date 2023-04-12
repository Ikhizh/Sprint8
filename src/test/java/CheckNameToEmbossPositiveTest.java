import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckNameToEmbossPositiveTest {
    private String name = "Тимоти Шаламе";
    @Test
    public void shouldHaveCorrectName() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(true, actual);
    }

}
