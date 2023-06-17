
import java.util.Scanner;
    public class allProcess {


        public static void main(String[] args) {
            detailsOfAll sd= n



            Scanner input = new Scanner(System.in);
            int i, noOfStudent, j, temp ;
            System.out.print("Enter the no of student: ");
            noOfStudent = input.nextInt();
            int[] cutOff;
            cutOff = new int[noOfStudent];
            for (i = 0; i < noOfStudent; i++) {
                System.out.print("Enter Student Name: ");
                String studentName = input.next();
                sd.setStudentName(studentName);
                System.out.print("Enter students reg number: ");
                int regNo = input.nextInt();
                sd.setRegNo(regNo);
                System.out.println("Marks");
                System.out.print("Enter physics marks: ");
                int physicsMark = input.nextInt();
                sd.setPhysicsMark(physicsMark);
                System.out.println("Physics Mark: " + physicsMark);
                System.out.print("Enter chemistry marks: ");
                int chemistryMark = input.nextInt();
                sd.setChemistryMark(chemistryMark);
                System.out.println("Chemistry Mark: " + chemistryMark);
                System.out.print("Enter maths marks: ");
                int mathsMark = input.nextInt();
                sd.setMathsMark(mathsMark);
                System.out.println("Maths Mark: " + mathsMark);
                int cOff = (physicsMark / 2) + (chemistryMark / 2) + (mathsMark / 4);
                sd.setCutOff(cutOff);
                cutOff[i] = cOff;
                System.out.println("Student CutOff: " + cOff);
                System.out.println("\n");
            }
            for (i = 0; i < noOfStudent; i++) {
                for (j = i + 1; j < noOfStudent; j++) {
                    if (cutOff[i] < cutOff[j]) {
                        temp = cutOff[i];
                        cutOff[i] = cutOff[j];
                        cutOff[j] = temp;
                    }
                }
                System.out.println("Cutoff: " + cutOff[i]);
            }



            }
        }

