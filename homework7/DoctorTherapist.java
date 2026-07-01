package TMS.homework7;

public  class DoctorTherapist extends Clinic {
    @Override
    public void treat() {
        System.out.println("Терапевт проводит осмотр.");
    }

    public void assignDoctor(Patient patient) {
        if (patient.treatmentPlan == 1) {
            patient.doctor = new DoctorSurgeon();
        } else if (patient.treatmentPlan == 2) {
            patient.doctor = new DoctorDentist();
        } else {
            patient.doctor = new DoctorTherapist();
        }
        patient.doctor.treat();
    }
}