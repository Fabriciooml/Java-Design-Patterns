public class BonusEmployee {

    private BonusEmployee() {};

    private static BonusEmployee instance = new BonusEmployee();

    public static BonusEmployee getInstance() {
        return instance;
    }

    private float bonusEmployeePercentage;

    public float getBonusEmployeePercentage() {
        return bonusEmployeePercentage;
    }

    public void setBonusEmployeePercentage(float bonusEmployeePercentage) {
        this.bonusEmployeePercentage = bonusEmployeePercentage;
    }
}
