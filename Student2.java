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
//子クラス
public class Student2 extends Person2 {
    private int stuNo;

    public void setStuNo(int s) {
        stuNo = s;
    }
    //元の記述：public void displayStuNo()
    public void display() {
        //追記：System.out.println("名前：" + getName);
        //nameはprivate指定しているため、getName()出ないと呼び出せない
        System.out.println("名前：" + getName());
        //stuNoはprivate指定されているが同じクラス内なので使うことができる
        System.out.println("学籍番号：" + stuNo);
    }
}
//今回はこちらが呼び出される（上書きされたため）
