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

    //CB Formation
    void RandomSort(int[] queue, int queueLength)
    {

        //Get random queue
        //int[] queue = new int[7];
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
    }

    

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
