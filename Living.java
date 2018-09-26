enum CAMP {CB, MO, NE}
//CB stands for CalabashBrothers, MO stands for monsters, NE stands for neutrals

enum MOUNT {LOTUS, FOOT, UNKNOWN}

public class Living {
    String myName;
    boolean isAlive;
    boolean hasMount;
    CAMP myCamp;
    Mount myMount;
    int myFamilyRank;
    {
        myMount = new Mount();
    }
    Living()
    {
        myName = new String("unknownName");
        isAlive = true;
        myCamp = CAMP.NE;
        myFamilyRank = -1;
        hasMount = false;
    }
    public void TellMyName()
    {
        System.out.println(myName);
    }
    public CAMP TellMyCamp()
    {
        return myCamp;
    }
    public void GoTo(int rowPosition,int columnPosition)
    {
        if(hasMount)
            myMount.MoveTo(rowPosition,columnPosition);
        else
            System.out.println("I don't have a mount!");
    }
}
