import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DRootTest {
    @Test
    public void Tests() {
        assertEquals(  7, DRoot.digital_root(16));
        assertEquals(  6, DRoot.digital_root(456));
    }
}
