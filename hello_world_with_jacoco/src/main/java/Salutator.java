public class Salutator
{
    private static final Salutator instance = new Salutator();

    private final String normal = "Hola, qué pasa?";
    private final String formal = "Buenas, qué sucede?";
    
    public static Salutator get()
    {
        return instance;
    }
    public String getNormal() 
    {
        System.out.println(normal);
        return normal;
    }

    public String getFormal() 
    {
        System.out.println(formal);
        return formal;
    }
}
