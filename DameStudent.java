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
public class DameStudent extends Student4 {
    DameStudent(String name, int stuNo) {
        super(name, stuNo);
    }
}
