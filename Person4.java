/*
 * 内容：this superについて
 */
//親クラス（スーパークラス）
public class Person4 {
    private String name;
    //名前を設定するためのメソッド
    public Person4(String name) {
        this.name = name;
    }
    //画面に出力するためのメソッド
    public void display() {
        System.out.println("名前：" + name);
    }
}
