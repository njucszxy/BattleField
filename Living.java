enum CAMP {CB, MO, NE}
//CB stands for CalabashBrothers, MO stands for monsters, NE stands for neutrals

enum MOUNT {LOTUS, FOOT, UNKNOWN}

public class Living {
    String myName;
    boolean isAlive;
    CAMP myCamp;
    Mount myMount;
    {
        myMount = new Mount();
    }
    Living()
    {
        myName = new String("unknownName");
        isAlive = true;
        myCamp = CAMP.NE;
    }
    public void TellMyName()
    {
        System.out.println(myName);
    }
    public CAMP TellMyCamp()
    {
        return myCamp;
    }
}
