package encapsulation;

public class Policy {
    private int policyId;
    private double premium;

    public void setPolicy(int policyId, int age) {
        this.policyId = policyId;

        if (age < 30)
            premium = 2000;
        else if (age <= 50)
            premium = 3500;
        else
            premium = 5000;
    }

    public double getPremium() {
        return premium;
    }

    public static void main(String[] args) {
        Policy p = new Policy();
        p.setPolicy(101, 45);
        System.out.println(p.getPremium());
    }
}
