package JavaClass.ClassPractice03.prob;

public class Duck {
    private String name;
    private int legs;
    private double length;

    public void setName(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println("오리(" + name + ")는 날지 않습니다.");
    }

    public void sing() {
        System.out.println("오리(" + name + ")가 소리내어 웁니다.");
    }

    @Override
    public String toString() {
        return "오리의 이름은 " + name + " 입니다.";
    }
}
