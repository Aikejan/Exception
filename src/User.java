public class User {
    private  String name;
    private  Integer age;



    public String getName() {
        return name;
    }

    public void setName(String name) throws  IllegalNameException {
        if(name.length() > 20){
            throw  new IllegalNameException ("Oshibka Dlina imena ne doljno" +"byt bolshe 20 simvolom" + name);

        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge( Integer age) throws IllegalAgeException {

        if(age > 100 ||  age <= 0){
            throw  new IllegalAgeException("Oshibka vozrast" +" Usera ne mojet byt bolshe 100"  +  " Ili menshe 0.  vy zadali" + age);

        }
        this.age = age;
    }
}
