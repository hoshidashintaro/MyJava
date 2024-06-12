/*
 * 内容：オーバーライド
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
