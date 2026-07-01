package TMS.homework7;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите код лечения: ");
        int plan = sc.nextInt();
        Patient patient = new Patient(plan);
        DoctorTherapist therapist = new DoctorTherapist();
        therapist.assignDoctor(patient);
    }
}
