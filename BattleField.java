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
        lives[8] = new Scorpion();
        lives[9] = new Snake();
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
    void FishFormation(int[][] positionMap,CAMP camp)
    {
        //Formation
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


    //CB Formation
    public void CBFormation(FormationType ft)
    {
        switch(ft)
        {
            case Snake: break;
            case Zig: break;
            case Fish: break;
            case Moon: break;
            case Wing: break;
            case Arrow: break;
            case Goose: break;
            case Square: break;
            default: break;
        }
    }
}
