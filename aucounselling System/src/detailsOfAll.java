import java.util.*;
   abstract class detailsOfAll {
        private String studentName;
        private int regNo;
        private int physicsMark;
        private int chemistryMark;
        private int mathsMark;
        private int[] cutOff;
        void setStudentName(String studentName) {
            this.studentName = studentName;
        }
        String getStudentName() {
            return studentName;
        }
        void setRegNo(int regNo) {
            this.regNo = regNo;
        }
        int getRegNo() {
            return regNo;
        }
        void setPhysicsMark(int physicsMark) {
            this.physicsMark = physicsMark;
        }
        int getPhysicsMark() {
            return physicsMark;
        }

        void setChemistryMark(int chemistryMark) {
            this.chemistryMark = chemistryMark;

        }

        int getChemistryMark() {
            return chemistryMark;
        }

        void setMathsMark(int mathsMark) {
            this.mathsMark = mathsMark;

        }

        int getMathsMark() {
            return mathsMark;
        }

        void setCutOff(int[] cutOff) {
            this.cutOff = cutOff;
        }

        int[] getCutOff() {
            return cutOff;
        }

            public String collegeName;
            String department;



            public void setCollegeName(String collegeName)
            {

                Map<String, Integer> college1;
                ArrayList<String> department1 = new ArrayList<>();
                college1 = new HashMap<>();
                this.collegeName = college1.toString();
                this.department=department1.toString();
                {
                    college1.put("RTC", 7218);
                    {
                        department1.add("CSE");
                        department1.add("ECE");
                        department1.add("IT");
                        department1.add("BME");
                        System.out.println("RTC" + "\n" + department1);
                        System.out.println("\n");
                    }
                    Map<String, Integer> college2;

                    college2 = new HashMap<>();
                    ArrayList<String> department2 = new ArrayList<>();
                    college2.put("KARPAGAM(A)", 7178);
                    this.collegeName = college2.toString();
                    this.department=department2.toString();
                    {
                        department2.add("CSE");
                        department2.add("ECE");
                        department2.add("IT");
                        department2.add("CIVIL");
                        System.out.println("KARPAGAM" + "\n" + department2);
                        System.out.println("\n");
                    }
                    Map<String, Integer> college3;
                    college3 = new HashMap<>();
                    ArrayList<String> department3 = new ArrayList<>();
                    college3.put("PSG", 7180);
                    this.collegeName = college3.toString();
                    this.department=department3.toString();
                    {
                        department3.add("CSE");
                        department3.add("ECE");
                        department3.add("IT");
                        System.out.println("PSG" + "\n" + department3);
                        System.out.println("\n");

                    }
                    Map<String, Integer> college4;
                    college4 = new HashMap<>();
                    ArrayList<String> department4 = new ArrayList<>();
                    college4.put("PR", 8212);
                    this.collegeName = college4.toString();
                    this.department=department4.toString();
                    {
                        department4.add("CSE");
                        department4.add("ECE");
                        department4.add("IT");
                        department4.add("EEE");
                        System.out.println("PR" + "\n" + department4);
                        System.out.println("\n");
                    }
                    Map<String, Integer> college5;
                    college5 = new HashMap<>();
                    ArrayList<String> department5 = new ArrayList<>();
                    college5.put("CMS", 7204);
                    this.collegeName = college5.toString();
                    this.department=department5.toString();
                    {
                        department5.add("CSE");
                        department5.add("ECE");
                        department5.add("IT");
                        department5.add("MECH");
                        System.out.println("CMS" + "\n" + department5);
                        System.out.println("\n");
                    }
                    Map<String, Integer> college6;
                    college6 = new HashMap<>();
                    ArrayList<String> department6 = new ArrayList<>();
                    college6.put("CIT", 7204);
                    this.collegeName = college6.toString();
                    this.department=department6.toString();
                    {
                        department6.add("CSE");
                        department6.add("ECE");
                        department6.add("IT");
                        department6.add("MECH");
                        department6.add("EEE");
                        System.out.println("CIT" + "\n" + department6);
                        System.out.println("\n");
                    }
                }
            }
                String getCollegeName(){
                    return collegeName;
            }
            String getDepartment(){
                return department;
            }


        }


            /*void setCollegeName() {
                this.collegeName = collegeName;
            }

            String[] getCollegeName() {
                return new String[]{collegeName};
            }

            void setTotalSeats() {
                this.totalSeats = totalSeats;
            }

            int getTotalSeats() {
                return totalSeats;
            }

            void setAvailableSeats() {
                this.availableSeats = availableSeats;
            }

            int getAvailableSeats() {
                return availableSeats;
            }

            void setDepartment() {
                this.department = department;
            }

            String getdepartment() {
                return department;
            }
        }
    }
        //method to get data from author object
        /*public String toString(){
            return "Details:[studentName="+getStudentName()+",regNo="+getRegNo()+", physicsMark="+getPhysicsMark()+",chemistryMark="+getChemistryMark()+"," +
                    "mathsMark="+getMathsMark()+"," +
                    "cutOff="+ Arrays.toString(getCutOff()) +", " +
                    "collegeName="+ Arrays.toString(getCollegeName())+"," + "department="+getdepartment()+",availableSeats="+getAvailableSeats()+",totalseats="+getTotalSeats()+"]";
        }
        public void maxSeat(){
            if (availableSeats>0){
                availableSeats--;
                System.out.println("max seat"+collegeName);

            }
            else{
                System.out.println("NO available seats in "+collegeName);
            }
        }
        public static void minseats(int totalseats){
            if (availableSeats<totalseats){
                availableSeats++;
                System.out.println("no min seat in "+collegeName);

            }
            else{
                System.out.println("no seats in "+ collegeName);
            }
        }

    }
    class Application {
        public List<detailsOfAll> colleges;

        public Application() {
            colleges = new ArrayList<>();
        }

        public void addCollege(detailsOfAll college) {
            colleges.add(college);
        }

        public List<detailsOfAll> getColleges() {
            return colleges;
        }
    }
    class CollegeSeats {
        public Application App;

        public CollegeSeats(Application App) {
            this.App = App;
        }

        public void showAvailableSeats() {
            System.out.println("Available seats in each college:");
            for (detailsOfAll college : App.getColleges()) {
                System.out.println(college.getCollegeName() + ": " + college.getAvailableSeats());
            }
        }
    }*/




