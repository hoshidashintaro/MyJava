/*
 * 内容：finalについて
 * ・クラス、メンバ変数、メソッドにつけられる修飾子 "これで最後という意味"
 * クラス：継承ができなくなる
 * final class Student{}
 *  → class DameStudent extends Student{} この場合は、Studentクラスの継承ができない
 * メンバ変数：代入ができなくなる → 定数が作れる（定数は大文字にする）慣習として
 * final int BASE_NO = 1000;
 *  → BASE_NO = 200; この場合、BASE_NOは2000で上書きできなくなる
 * メソッド：オーバーライドができなくなる
 *  → final void buckup() {}
 *    サブクラスで再定義できなくなる
 */
//実行用クラス
public class StuSample4 {
    public static void main(String[] args) {
        final int BASE_NO = 1000;
        Student4 stu1 = new Student4("菅原", BASE_NO + 1);
        stu1.display();
        Student4 stu2 = new Student4("菅原", BASE_NO + 2);
        stu2.display();
    }
}
