/*
 * 内容：継承について
 * 継承：既存のクラスをもとに変数やメソッドを追加したクラスを作ること
 * 継承関係について
 * 継承関係にある親クラス：スーパークラス
 * 子クラス：サブクラス
 * Personクラス（Teacherクラス、Studentクラス）
 * TeacherクラスとStudentクラスは、Personクラスの変数やメソッドを使うことができる
 * 以下記述例
 * class Student extends Person {
 * Student（子クラス）extends（拡張する）Person（親クラス）
 * つまり子クラス（Student）は、親クラス（Person）を拡張するという意味
 * }
 * メリット：コーディングが楽になる、メンテナンスがしやすくなる
 * 継承できるクラスは１つだけ
 * コンストラクタは継承しない（呼び出す方法はある）
*/
//実行用クラス
public class StuSample {
    public static void main(String[] args) {
        Student stu = new Student();
        //スーパークラスのメソッド
        stu.setName("菅原");
        stu.display();
        //サブクラスのメソッド
        stu.setStuNo(1);
        stu.displayStuNo();
    }
}
