public abstract class DomesticAnimal {
    private String nickName;
    private int weight;
    private int age;
    private String gender;

    public DomesticAnimal(String name, int weight, int age, String gender){
        this.nickName = name;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{" +
                "nickName='" + nickName + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
