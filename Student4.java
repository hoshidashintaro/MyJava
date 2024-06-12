//子クラス
public class Student4 extends Person3 {
    private int stuNo;

    public Student4(String name) {
        this(name, 999);
    }
    public Student4(String name, int stuNo) {
        super(name);
        this.stuNo = stuNo;
    }

    public void display() {
        super.display();
        System.out.println("学籍番号：" + stuNo);
    }
}
//今回はこちらが呼び出される（上書きされたため）
