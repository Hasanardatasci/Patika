public class Teacher {
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
