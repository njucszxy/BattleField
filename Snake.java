public class Snake extends Living {
    Snake()
    {
        myName = new String("蛇精");
        myCamp = CAMP.MO;

        if(!myMount.AskForOwner())
            myMount.PickUp(myName,MOUNT.FOOT);
        else
            System.out.println(myName + " can not pick up a mount!");
    }
    // my abilities...
}
