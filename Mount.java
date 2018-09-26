enum MOUNT {LOTUS, FOOT, UNKNOWN}

public class Mount {
    String ownerName;
    MOUNT myType;
    int rowPosition;
    int columnPosition;
    boolean isUsed;
    Mount()
    {
        ownerName = new String("unknownName");
        myType = MOUNT.UNKNOWN;
        rowPosition = -1;
        columnPosition = -1;
        isUsed = false;
    }
    Mount(String name, MOUNT type)
    {
        ownerName = name;
        myType = type;
        rowPosition = -1;
        columnPosition = -1;
        isUsed = true;
    }
    public boolean PickUp(String name, MOUNT type)
    {
        if(!isUsed)
        {
            ownerName = name;
            myType = type;
            rowPosition = -1;
            columnPosition = -1;
            isUsed = true;
            return true;
        }
        else
        {
            System.out.println("This Mount has been picked up!");
            return false;
        }
    }
    public boolean AskForOwner()
    {
        return isUsed;
    }
    public void MoveTo(int newRow, int newColumn,Land land)
    {
        rowPosition = newRow;
        columnPosition = newColumn;
        land.SitHere(ownerName);
    }
    public int GetRowPosition()
    {
        return rowPosition;
    }
    public int GetColumnPosition()
    {
        return columnPosition;
    }
    //...
}
