package task4.inner.builder;

import task4.util.DomesticAnimalType;
import utils.mytypes.Gender;

public class Pet {
    private Integer animalId;
    private DomesticAnimalType typeOfAnimal;
    private String name;
    private Gender gender;
    private Integer yearOfBirth;
    private String fullNameOfOwner;
    private String addressOfOwner;

    private static Integer numOfPets = 0;

    private Pet() {
    }

    public DomesticAnimalType getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public String getFullNameOfOwner() {
        return fullNameOfOwner;
    }

    public String getAddressOfOwner() {
        return addressOfOwner;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "animalId=" + animalId +
                ", typeOfAnimal=" + typeOfAnimal +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", yearOfBirth=" + yearOfBirth +
                ", fullNameOfOwner='" + fullNameOfOwner + '\'' +
                ", addressOfOwner='" + addressOfOwner + '\'' +
                '}';
    }

    public static Builder newBuilder(){
        return new Pet().new Builder();
    }

    public class Builder{
        private Builder(){

        }

        public Builder withTypeOfAnimal(DomesticAnimalType type){
            Pet.this.typeOfAnimal = type;
            return this;
        }

        public Builder withName(String name){
            Pet.this.name = name;
            return this;
        }

        public Builder withGender(Gender gender){
            Pet.this.gender = gender;
            return this;
        }

        public Builder withYearOfBirth(Integer yearOfBirth){
            Pet.this.yearOfBirth = yearOfBirth;
            return this;
        }

        public Builder withFullNameOfOwner(String nameOfOwner, String surnameOfOwner){
            Pet.this.fullNameOfOwner = nameOfOwner + " " + surnameOfOwner;
            return this;
        }

        public Builder withAddressOfOwner(String addressOfOwner){
            Pet.this.addressOfOwner = addressOfOwner;
            return this;
        }

        public Pet build(){
            Pet pet = new Pet();
            pet.typeOfAnimal = Pet.this.typeOfAnimal;
            pet.name = Pet.this.name;
            pet.gender = Pet.this.gender;
            pet.yearOfBirth = Pet.this.yearOfBirth;
            pet.fullNameOfOwner = Pet.this.fullNameOfOwner;
            pet.addressOfOwner = Pet.this.addressOfOwner;
            pet.animalId = ++Pet.numOfPets;

            return pet;
        }
    }
}
