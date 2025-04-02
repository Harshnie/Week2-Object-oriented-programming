import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    protected void addToHistory(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getHistory() {
        return medicalHistory;
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        addToHistory(record);
    }

    @Override
    public List<String> viewRecords() {
        return getHistory();
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addToHistory(record);
    }

    @Override
    public List<String> viewRecords() {
        return getHistory();
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient("IP001", "Ram", 45, 5, 2000);
        inPatient.addRecord("Admitted with fever. Prescribed antibiotics.");

        OutPatient outPatient = new OutPatient("OP001", "Sneha", 30, 500);
        outPatient.addRecord("Routine check-up. All vitals normal.");

        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Total Bill: Rs." + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) p;
                System.out.println("Medical Records: " + record.viewRecords());
            }

            System.out.println();
        }
    }
}
