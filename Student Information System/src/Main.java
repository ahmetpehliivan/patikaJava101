public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","05381234567","TRH");
        Teacher t2 = new Teacher("Graham Bell","05342573111","FZK");
        Teacher t3 = new Teacher("Kül Yutmaz","05384130000","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,79,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","321","4",tarih,fizik,biyo);
        s2.addBulkExamNote(70,60,52);
        s2.isPass();
    }
}
