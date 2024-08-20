public class Teacher1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("hakkı Hoca" , "TRH" , "05923445443");
        t1.print();

        Course tarih = new Course("Tarih","101","TRH",t1);

    }

    public static class Course {
        Teacher teacher;
        String name;
        String code;
        String prefix;
        int note;

        Course(String name,String code,String prefix,Teacher teacher){
            this.name = name;
            this.code = code;
            this.prefix = prefix;
            this.teacher = teacher;
            int note = 0;
        }
        void addTeacher(Teacher teacher){
            if (this.prefix.equals(teacher.branch)) {
                this.teacher = teacher;
                System.out.println("İşlem başarılı");
            } else {
                System.out.println(teacher.name + " Dersi geçemediniz.");
            }
        }
        void printTeacherInfo(){
            this.teacher.print();
        }

    }

    public static class Teacher {
        String name;
        String telNo;
        String branch;

        Teacher(String name,String branch,String telNo){
            this.name = name;
            this.telNo = telNo;
            this.branch = branch;
        }
        void print(){
            System.out.println("Adı : " + this.name);
            System.out.println("Telefonu : " + this.telNo);
            System.out.println("Bölümü : " + this.branch);
        }
    }
}
