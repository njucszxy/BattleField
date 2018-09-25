public class Minions extends Living {
    Minions()
    {
        myName = new String("小喽啰");
        myCamp = CAMP.MO;

        if(!myMount.AskForOwner())
            myMount.PickUp(myName,MOUNT.FOOT);
        else
            System.out.println(myName + " can not pick up a mount!");
    }
    // my abilities...
}
