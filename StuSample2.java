/*
 * 内容：オーバーライド
 * オーバーライド：サブクラスでスーパークラスのメソッドを再定義すること
 * オーバーライドの元の意味：上書きする
 * 条件：戻り値の型、メソッド名、引数の型と数、を合わせる（同じにする）
 * 記述例
 * class Person {
 *     void display(){}
 * }
 * class Student extends Person { ←こちらが出力される
 *     void display(){}
 * }
 * オーバーロード：１つのクラスの中で同じ名前のメソッドを複数定義できる
*/
//実行用クラス
public class StuSample2 {
    public static void main(String[] args) {
        Student2 stu = new Student2();
        //スーパークラスのメソッド
        //setNameは、public指定のため呼び出せる
        stu.setName("菅原");
        //サブクラスのメソッド
        //setStuNoは、public指定のため呼び出せる
        stu.setStuNo(1);
        stu.display();
    }
}
