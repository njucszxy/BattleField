public class Scorpion extends Living {
    Scorpion()
    {
        myName = new String("蝎子精");
        myCamp = CAMP.MO;

        if(!myMount.AskForOwner())
            myMount.PickUp(myName,MOUNT.FOOT);
        else
            System.out.println(myName + " can not pick up a mount!");
    }
    // my abilities...
}
