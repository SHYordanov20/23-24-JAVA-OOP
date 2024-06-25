package _11_15.People;

public class Human {
    protected String name;
    protected int age;

    public Human(String name,int age)
    {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if(name.length() < 2)
        {
            throw  new IllegalArgumentException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if(age < 1)
        {
            throw new IllegalArgumentException("Negative age");
        }
        this.age = age;
    }
    public void PrintInfo()
    {
        System.out.println("Name: "+ getName() + " Age: " +getAge());
    }
}
