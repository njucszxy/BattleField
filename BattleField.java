import java.util.Random;

enum FormationType {Snake, Wing, Goose, Zig, Fish, Square, Moon, Arrow}

public class BattleField {
    Living[] lives;
    boolean[][] land;
    BattleField()
    {
        lives = new Living[20];
        land = new boolean[10][10];

        //CB
        lives[0] = new Grandpa();
        lives[1] = new RedBoy();
        lives[2] = new OrangeBoy();
        lives[3] = new YellowBoy();
        lives[4] = new GreenBoy();
        lives[5] = new CyanBoy();
        lives[6] = new BlueBoy();
        lives[7] = new PurpleBoy();

        //MO
        lives[8] = new Snake();
        lives[9] = new Scorpion();
        for(int i = 10;i <= 15;i++)
            lives[i] = new Minions();

        //Initialize Land
        for(int i = 0;i < 10;i++)
            for(int j = 0;j < 10;j++)
                land[i][j] = false;
    }

    //General Formation
    void ZigFormation(int[][] positionMap, CAMP camp)
    {
        //Formation
        int column = 0;
        if(camp == CAMP.CB)
            column = 2;
        else if(camp == CAMP.MO)
            column = 7;
        else
            System.out.println("Error CAMP!");
        positionMap[4][column] = 1;
        positionMap[3][column] = 2;
        positionMap[5][column] = 3;
        positionMap[2][column] = 4;
        positionMap[6][column] = 5;
        positionMap[1][column] = 6;
        positionMap[7][column] = 7;
    }
    void WingFormation(int[][]positionMap,CAMP camp)
    {
        //Formation
        if(camp == CAMP.CB)
        {
            positionMap[4][3] = 1;
            positionMap[3][2] = 2;
            positionMap[5][2] = 3;
            positionMap[2][1] = 4;
            positionMap[6][1] = 5;
            positionMap[1][0] = 6;
            positionMap[7][0] = 7;
        }
        else if(camp == CAMP.MO)
        {
            positionMap[4][6] = 1;
            positionMap[3][7] = 2;
            positionMap[5][7] = 3;
            positionMap[2][8] = 4;
            positionMap[6][8] = 5;
            positionMap[1][9] = 6;
            positionMap[7][9] = 7;
        }
        else
            System.out.println("Error CAMP!");
    }
    void GooseFormation(int [][]positionMap, CAMP camp)
    {
        //Formation
        if(camp == CAMP.CB)
        {
            positionMap[4][2] = 1;
            positionMap[3][3] = 2;
            positionMap[5][1] = 3;
            positionMap[2][3] = 4;
            positionMap[6][1] = 5;
            positionMap[1][4] = 6;
            positionMap[7][0] = 7;
        }
        else if(camp == CAMP.MO)
        {
            positionMap[4][7] = 1;
            positionMap[3][6] = 2;
            positionMap[5][8] = 3;
            positionMap[2][6] = 4;
            positionMap[6][8] = 5;
            positionMap[1][5] = 6;
            positionMap[7][9] = 7;
        }
        else
            System.out.println("Error CAMP!");
    }
    void FishFormation(int[][] positionMap,CAMP camp)
    {
        //Formation
        if(camp == CAMP.CB)
        {
            positionMap[4][3] = 1;
            positionMap[4][2] = 2;
            positionMap[3][2] = 3;
            positionMap[5][2] = 4;
            positionMap[4][1] = 5;
            positionMap[2][1] = 6;
            positionMap[6][1] = 7;
        }
        else if(camp == CAMP.MO)
        {
            positionMap[4][6] = 1;
            positionMap[4][7] = 2;
            positionMap[3][7] = 3;
            positionMap[5][7] = 4;
            positionMap[4][8] = 5;
            positionMap[2][8] = 6;
            positionMap[6][8] = 7;
        }
        else
            System.out.println("Error CAMP!");
    }
    void SquareFormation(int[][] positionMap, CAMP camp)
    {
        //Formation
        if(camp == CAMP.CB)
        {
            positionMap[3][3] = 1;
            positionMap[5][3] = 2;
            positionMap[2][2] = 3;
            positionMap[6][2] = 4;
            positionMap[3][1] = 5;
            positionMap[5][1] = 6;
            positionMap[4][0] = 7;
        }
        else if(camp == CAMP.MO)
        {
            positionMap[3][6] = 1;
            positionMap[5][6] = 2;
            positionMap[2][7] = 3;
            positionMap[6][7] = 4;
            positionMap[3][8] = 5;
            positionMap[5][8] = 6;
            positionMap[4][9] = 7;
        }
        else
            System.out.println("Error CAMP!");
    }
    void MoonFormation(int[][] positionMap, CAMP camp)
    {
        //Formation
        if(camp == CAMP.CB)
        {
            positionMap[4][2] = 1;
            positionMap[3][2] = 2;
            positionMap[5][2] = 3;
            positionMap[2][3] = 4;
            positionMap[6][3] = 5;
            positionMap[1][4] = 6;
            positionMap[7][4] = 7;
        }
        else if(camp == CAMP.MO)
        {
            positionMap[4][7] = 1;
            positionMap[3][7] = 2;
            positionMap[5][7] = 3;
            positionMap[2][6] = 4;
            positionMap[6][6] = 5;
            positionMap[1][5] = 6;
            positionMap[7][5] = 7;
        }
        else
            System.out.println("Error CAMP!");
    }
    void ArrowFormation(int[][] positionMap, CAMP camp)
    {
        //Formation
        if(camp == CAMP.CB)
        {
            positionMap[4][3] = 1;
            positionMap[4][2] = 2;
            positionMap[3][2] = 3;
            positionMap[5][2] = 4;
            positionMap[2][1] = 5;
            positionMap[4][1] = 6;
            positionMap[1][1] = 7;
        }
        else if(camp == CAMP.MO)
        {
            positionMap[4][6] = 1;
            positionMap[4][7] = 2;
            positionMap[3][7] = 3;
            positionMap[5][7] = 4;
            positionMap[2][8] = 5;
            positionMap[4][8] = 6;
            positionMap[1][8] = 7;
        }
        else
            System.out.println("Error CAMP!");
    }
    void SnakeFormation(int[][] positionMap, CAMP camp)
    {
        //Get random queue
        int queueLength = 7;
        int []queue = new int[queueLength];
        for(int j = 0;j < queueLength;j++)
            queue[j] = -1;
        int ran = 0;
        int count = 0;
        boolean flag = false;
        while(count < queueLength)
        {
            Random RandomNumber = new Random();
            ran = Math.abs(RandomNumber.nextInt()) % queueLength + 1;
            for(int i = 0;i < count;i++) {
                if (ran == queue[i]) {
                    flag = true;
                    break;
                } else
                    flag = false;
            }
            if(!flag)
            {
                queue[count] = ran;
                count++;
            }
        }
        //Formation
        if(camp == CAMP.CB)
        {
            for(int i = 0;i < 7;i++)
                positionMap[1+i][2] = queue[i];
        }
        else if(camp == CAMP.MO)
        {
            for(int i = 0;i < 7;i++)
                positionMap[1+i][7] = queue[i];
        }
        else
            System.out.println("Error CAMP!");
    }


    //Formation
    public void Formation(FormationType ft,CAMP camp)
    {
        int[][] positionMap = new int[10][10];
        for(int i = 0;i < 10;i++)
            for(int j = 0;j < 10;j++)
                positionMap[i][j] = -1;
        switch(ft)
        {
            case Snake: SnakeFormation(positionMap,camp);break;
            case Zig: ZigFormation(positionMap,camp);break;
            case Fish: FishFormation(positionMap,camp);break;
            case Moon: MoonFormation(positionMap,camp);break;
            case Wing: WingFormation(positionMap,camp);break;
            case Arrow: ArrowFormation(positionMap,camp);break;
            case Goose: GooseFormation(positionMap,camp);break;
            case Square: SquareFormation(positionMap,camp);break;
            default: System.out.println("No Such Formation!");break;
        }
        for(int i = 0;i < 10;i++)
        {
            for(int j = 0;j < 10;j++)
            {
                if(positionMap[i][j] != -1)
                {
                    switch (positionMap[i][j])
                    {
                        case 1:break;
                        case 2:break;
                        case 3:break;
                        case 4:break;
                        case 5:break;
                        case 6:break;
                        case 7:break;
                        default:break;
                    }
                }
            }
        }
    }
}
