public class Getrank
{
    private String name;
    private int ml;
    private boolean alkoholisch;

    public Getrank()
    {
        setName("Coca Cola");
        setMl(500);
        setAlkoholisch(false);
    }

    public Getrank(String name, int ml, boolean alkoholisch)
    {
        setName(name);
        setMl(ml);
        setAlkoholisch(alkoholisch);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setMl(int ml)
    {
        this.ml = ml;
    }

    public void setAlkoholisch(boolean alkoholisch)
    {
        this.alkoholisch = alkoholisch;
    }

    public String getName()
    {
        return name;
    }

    public int getMl()
    {
        return ml;
    }

    public boolean getAlkoholisch()
    {
        return alkoholisch;
    }

    public void printGetrank()
    {
        System.out.println("Getrank:\t" + name + "\t" + ml + "\t" + alkoholisch);
    }
}
