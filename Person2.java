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
//親クラス（スーパークラス）
public class Person2 {
    private String name;
    //名前を設定するためのメソッド
    public void setName(String n) {
        name = n;
    }
    //戻り値：String 名前を取得するためのメソッド
    public String getName() {
        return name;
    }
    //画面に出力するためのメソッド
    //nameがprivateではあるが、同じクラス内なのでnameで使うことができる
    public void display() {
        System.out.println("名前：" + name);
    }
}
