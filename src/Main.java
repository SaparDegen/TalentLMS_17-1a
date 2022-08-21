import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Farm[] farms = {
                new Farm("Maksat Turdiev", "Bishkek"),
                new Farm("Jumgalbek Asanov", "Kant")
        };

        int[][] arrInt = {{3, 5, 2}, {1, 1, 1}};
        String[] gender = {"Male", "Female"};
        String[] color = {"Grey", "Brown" , "white", "Black"};

        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                DomesticAnimal[] animals;
                if (j == 0) {
                    animals = new Sheep[arrInt[i][j]];
                    for (int k = 0; k < arrInt[i][j]; k++) {
                        animals[k] = new Sheep("Sheep" + (k + 1), random.nextInt(15, 25), random.nextInt(1, 5), gender[random.nextInt(0, 2)]);
                    }
                    farms[i].setSheeps((Sheep[]) animals);
                } else if (j == 1) {
                    animals = new Cow[arrInt[i][j]];
                    for (int k = 0; k < arrInt[i][j]; k++) {
                        animals[k] = new Cow("Cow" + (k + 1), random.nextInt(50, 100), random.nextInt(3, 7), gender[random.nextInt(0, 2)]);
                    }
                    farms[i].setCows((Cow[]) animals);
                } else if (j == 2) {
                    animals = new Horse[arrInt[i][j]];
                    for (int k = 0; k < arrInt[i][j]; k++) {
                        animals[k] = new Horse("Horse" + (k + 1), random.nextInt(70, 150), random.nextInt(5, 10), gender[random.nextInt(0, 2)], color[random.nextInt(0, 4)]);
                    }
                    farms[i].setHorses((Horse[]) animals);
                }
            }
            System.out.println(farms[i].toString());
        }
    }
}