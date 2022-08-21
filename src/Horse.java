public class Horse extends DomesticAnimal{
    private String color;

    public Horse(String name, int weight, int age, String gender, String color){
        super(name, weight, age, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{nickName='" + Horse.super.getNickName() + '\'' +
                ", weight=" + Horse.super.getWeight() +
                ", age=" + Horse.super.getAge() +
                ". gender='" + Horse.super.getGender() + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
