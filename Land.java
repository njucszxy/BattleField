public class Land {
    boolean isUsed;
    String userName;
    Land()
    {
        isUsed = false;
        userName = new String("unknownName");
    }
    public void SitHere(String name)
    {
        if(!isUsed) {
            userName = name;
            isUsed = true;
        }
        else
            System.out.println("There is someone here!");
    }
    public boolean isUsedUp()
    {
        return isUsed;
    }
    public String GetUserName()
    {
        return userName;
    }
}
