public class Teacher {
    String name;
    String mpNo;
    String branch;

    Teacher(String name,String mbNo,String branch){
        this.name = name;
        this.mpNo = mbNo;
        this.branch = branch;
    }
    void print(){
        System.out.println("Adı : "+this.name);
        System.out.println("Telefonu : "+this.mpNo);
        System.out.println("Bölümü : "+this.branch);
    }
}
