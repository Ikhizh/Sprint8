import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckNameToEmbossNegativeTest {
private final String name;

    public CheckNameToEmbossNegativeTest(String name) {
        this.name = name;
    }
    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Sd"},
                {"ТимотиШаламе"},
                {"имотиШаламе имотиШаламе имотиШаламе имотиШаламе"},
                {"имотиШаламеимотиШаламеимотиШаламеимотиШаламе"},
        };
    }
    @Test
    public void shouldntHaveIncorrectName(){
     Account account = new Account(name);
     boolean actual = account.checkNameToEmboss();
     assertEquals( false , actual);
    }
}
