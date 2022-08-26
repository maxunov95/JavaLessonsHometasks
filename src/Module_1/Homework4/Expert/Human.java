package Module_1.Homework4.Expert;

public class Human {
    private int age;
    private String name;
    private int weight;

    private Human() {
    }

    public void info() {
        System.out.println(this.name + " - возраст " + this.age + ", вес " + this.weight);
    }

    static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public static class HumanBuilder {
        private Human human;

        public HumanBuilder() {
            human = new Human();
        }
        public HumanBuilder age(int age) {
            this.human.age = age;
            return this;
        }
        public HumanBuilder name(String name) {
            this.human.name = name;
            return this;
        }
        public HumanBuilder weight(int weight) {
            this.human.weight = weight;
            return this;
        }
        public Human build() {
            return this.human;
        }
    }
}
