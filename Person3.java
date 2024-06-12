/*
 * 内容：thisとsuperについて
 * 使い方１：メンバ変数・メソッドの呼び出し
 * this. → 自分のオブジェクトの~
 * super. → スーパークラスの~
 * 特徴としては、「.」を使う
 * 記述例
 * class Person {
 *     String name;
 *     void setName(String name) { 引数名はそのままメンバ変数で設定したものを使うことができる
 *      this.name;
 *     }
 * void display(){}
 * }
 * class Studnet {
 *      int stuNo;
 *      void display() {
 *      super.display();
 *      System.out.println(stuNo);
 *      }
 * }
 * メリット：同じコードを書かなくていよい、引数名を考えなくて良い
*/
/*
 * thisとsuperによるコンストラクタの呼び出し
 * this(引数), super(引数)
 * コンストラクタの先頭に記述する必要がある
*/
//親クラス（スーパークラス）
public class Person3 {
    private String name;
    //名前を設定するためのメソッド
    public Person3(String name) {
        this.name = name;
    }
    //画面に出力するためのメソッド
    public void display() {
        System.out.println("名前：" + name);
    }
}
