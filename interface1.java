public class interface1{
    public static void main(String args[]) {
         Bear b = new Bear();
        b.eat_type();
         b.eat_type1();
        
    }
}


interface herbivore{
    void eat_type();
}
interface carnivore
{
    void eat_type1();
}
class Bear implements herbivore,carnivore{
      public void eat_type()
    {
        System.out.println("Eats Vegetation");
    }
      public void eat_type1()
    {
        System.out.println("Eats flesh");
    }
}