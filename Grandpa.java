public class Grandpa extends Living {
    int myFamilyRank;
    Grandpa()
    {
        myName = new String("爷爷");
        myCamp = CAMP.CB;
        //myMount = MOUNT.FOOT;
        myFamilyRank = 0;

        if(!myMount.AskForOwner())
        {
            myMount.PickUp(myName,MOUNT.LOTUS);
            hasMount = true;
        }
        else
            System.out.println(myName + " can not pick up a mount!");
    }
    // my abilities...
}
