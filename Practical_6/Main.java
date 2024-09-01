package Practical_6;

class Patient {
    public Patient() {
        System.out.println("Patient(Superclass) Constructor Called!");
    }
}

class CovidParameters extends Patient{
    float CTScore;
    float DDimer;
    int platelet;
    public CovidParameters() {
        super();
        CTScore = 0.0f;
        DDimer = 0.0f;
        platelet = 0;
    }
    public CovidParameters(float CTScore, float DDimer, int platelet) {
        super();
        this.CTScore = CTScore;
        this.DDimer = DDimer;
        this.platelet = platelet;
    }
}

public class Main {
    public static void main(String[] args) {
        CovidParameters obj1 = new CovidParameters();
        System.out.println("For Object 1 (Created using default constructor)");
        System.out.println("CTScore - " + obj1.CTScore);
        System.out.println("DDimer - " + obj1.DDimer);
        System.out.println("Platelet - " + obj1.platelet);

        CovidParameters obj2 = new CovidParameters(20.5f, 0.8f, 150000);
        System.out.println("For Object 2 (Created using parameterized constructor)");
        System.out.println("CTScore - " + obj2.CTScore);
        System.out.println("DDimer - " + obj2.DDimer);
        System.out.println("Platelet - " + obj2.platelet);
    }
}
