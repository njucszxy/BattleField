enum CAMP {CB, MO, NE}
//CB stands for CalabashBrothers, MO stands for monsters, NE stands for neutrals

public class Living {
    String myName;
    boolean isAlive;
    boolean hasMount;
    CAMP myCamp;
    int myFamilyRank;
    Mount myMount;
    Living()
    {
        myName = new String("unknownName");
        isAlive = true;
        myCamp = CAMP.NE;
        myFamilyRank = -1;
        hasMount = false;
        myMount = new Mount();
    }
    public void TellMyName()
    {
        System.out.println(myName);
    }
    public CAMP TellMyCamp()
    {
        return myCamp;
    }
    public void GoTo(int rowPosition,int columnPosition,Land land)
    {
        if(hasMount)
            myMount.MoveTo(rowPosition, columnPosition, land);
        else
            System.out.println("I don't have a mount!");
    }
}
