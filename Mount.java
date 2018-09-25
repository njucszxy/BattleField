public class Mount {
    String ownerName;
    MOUNT myType;
    int rowPosition;
    int columnPosition;
    Mount()
    {
        ownerName = new String("unknownName");
        myType = MOUNT.UNKNOWN;
        rowPosition = -1;
        columnPosition = -1;
    }
    Mount(String name, MOUNT type)
    {
        ownerName = name;
        myType = type;
        rowPosition = -1;
        columnPosition = -1;
    }
    public void MoveTo(int newRow, int newColumn)
    {
        rowPosition = newRow;
        columnPosition = newColumn;
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
