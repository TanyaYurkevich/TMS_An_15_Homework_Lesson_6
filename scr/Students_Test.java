public class Students_Test {
    public static void main(String[] args) {
        Students students1 = new Students("Kate", "White",20, "S15","W");
        Students students2 = new Students("Kate", "White",20, "S15","W");
        System.out.println(students1.toString());
        if (students1.equals(students2)){
            System.out.println("Данные студентов равны.");
        }else {
            System.out.println("Данные студентов не равны.");
        }
    }
}
