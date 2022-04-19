import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusEmployeeTest {

    @Test
    public void deveRetornarBonusEmployeePercentage() {
        BonusEmployee.getInstance().setBonusEmployeePercentage((float) 0.05);
        assertEquals((float) 0.05, BonusEmployee.getInstance().getBonusEmployeePercentage());
    }
}
