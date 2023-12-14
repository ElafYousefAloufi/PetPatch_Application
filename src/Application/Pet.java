
package Application;

import cpit380practice.Picture;

public class Pet {

     String Name;
     String Age;
     String weight;
     String sex;
     Picture pic ;
     String petId;

    public Pet(String Name, String Age, String weight, String sex, Picture pic, String petId) {
        this.Name = Name;
        this.Age = Age;
        this.weight = weight;
        this.sex = sex;
        this.pic = pic;
        this.petId = petId;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }
     
    public Pet() {
 
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Pet(String Name, String Age, String weight, String sex, Picture img) {
        this.Name = Name;
        this.Age = Age;
        this.weight = weight;
        this.sex = sex;
        this.pic=img;
        this.petId = ((int)(Math.random()*10000)) + "";
    }

    public Picture getPic() {
        return pic;
    }

    public void setPic(Picture img) {
        this.pic = img;
    }
    
    
    
}
