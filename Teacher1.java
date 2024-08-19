public class Teacher1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("hakkı Hoca" , "TRH" , "05923445443");
        t1.print();

        Course tarih = new Course("Tarih","101","TRH",t1);

    }
}
