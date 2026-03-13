public class Dog extends Animal {
    private String breed;

    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return getAnimalName() + ", Owner: " + getOwnerName() +
               ", Age: " + getAge() +
               " (Dog, Breed: " + breed + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            Dog other = (Dog) obj;
            return super.equals(other) &&
                   breed.equals(other.breed);
        }
        return false;
    }
}