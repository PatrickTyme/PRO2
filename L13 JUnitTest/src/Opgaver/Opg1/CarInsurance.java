package Opgaver.Opg1;

public class CarInsurance {
    private final double basisPremium; // invariant: basisPremium > 0.
    /**
     * Create a CarInsurance.
     * Pre: basisPremium > 0.
     */
    public CarInsurance (double basisPremium) {
        this.basisPremium = basisPremium;
    }
    /**
     * Calculate and return a premium based of the following rules:
     * - person with age below 25: 25% is added to the basis premium,
     * - woman: the basis premium is reduced with 5%,
     * - if the person have been driving without damages for:
     * - 0 to 2 years, the basis premium is reduced with 0%,
     * - 3 to 5 years, the basis premium is reduced with 15%,
     * - 6 to 8 years, the basis premium is reduced with 25%,
     * - more than 8 years, the basis premium is reduced with 35%.
     * Throws a RuntimeException, if age < 18, or yearsWithoutDamage < 0,
     * or YearsWithoutDamage > age-18.
     */
    public double calculatePremium(int age, boolean isWoman, int yearsWithoutDamage) {
        if (age < 17) {
            throw new RuntimeException("Age can't be below 17");
        }
        if (yearsWithoutDamage < 0) {
            throw new RuntimeException("Years without damage can't be < 0");
        }
        if (yearsWithoutDamage > age - 17) {
            throw new RuntimeException("Years without damage can't be < age minus 17");
        }
        double premium = basisPremium;
        if (age < 25) {
            premium *= 1.25;
        }
        if (isWoman == true) {
            premium *= 0.95;
        }
        if (yearsWithoutDamage <= 2) {
            return premium;
        } else if (yearsWithoutDamage >= 3 && yearsWithoutDamage <= 5) {
            premium *= 0.85;
        } else if (yearsWithoutDamage >= 6 && yearsWithoutDamage <= 8) {
            premium *= 0.75;
        } else {
            premium *= 0.65;
        }
        return premium;
    }
}