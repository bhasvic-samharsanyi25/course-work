import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    public void act(){ 
        time++;
        if ( time % 360 == 0){
            addObject(new enemy(),Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(800));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        enemy enemy = new enemy();
        addObject(enemy,Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(800));
        enemy enemy2 = new enemy();
        addObject(enemy2,Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(800));
        enemy enemy3 = new enemy();
        addObject(enemy3,Greenfoot.getRandomNumber(1200),Greenfoot.getRandomNumber(800));

        mid mid = new mid();
        addObject(mid,1053,224);
        mid.setLocation(980,231);
        mid mid2 = new mid();
        addObject(mid2,845,472);
        mid2.setLocation(865,468);
        mid mid3 = new mid();
        addObject(mid3,733,572);
        mid3.setLocation(754,566);
        mid mid4 = new mid();
        addObject(mid4,1114,577);
        mid4.setLocation(1106,577);
        mid mid5 = new mid();
        addObject(mid5,305,569);
        mid5.setLocation(306,569);
        mid5.setLocation(309,565);
        small small = new small();
        addObject(small,706,350);
        small.setLocation(694,346);
        small small2 = new small();
        addObject(small2,1140,352);
        small2.setLocation(1146,348);
        small small3 = new small();
        addObject(small3,580,226);
        small3.setLocation(586,232);
        small small4 = new small();
        addObject(small4,234,223);
        small4.setLocation(238,230);
        small small5 = new small();
        addObject(small5,104,470);
        small5.setLocation(118,466);
        small small6 = new small();
        addObject(small6,455,463);
        small6.setLocation(465,455);
        tiny tiny = new tiny();
        addObject(tiny,499,347);
        tiny.setLocation(480,346);
        mid mid6 = new mid();
        addObject(mid6,266,340);
        mid6.setLocation(302,346);
        huge huge = new huge();
        addObject(huge,856,108);
        huge.setLocation(686,110);
        huge huge2 = new huge();
        addObject(huge2,543,690);
        huge2.setLocation(581,689);
        vSmall vSmall = new vSmall();
        addObject(vSmall,1100,498);
        vSmall.setLocation(1100,498);
        vSmall.setLocation(1053,479);
        small2.setLocation(1126,352);
        small2.setLocation(1147,341);
        small2.setLocation(1154,350);
        vSmall.setLocation(1100,389);
        vSmall.setLocation(1093,411);
        vSmall.setLocation(1095,410);
        vSmall vSmall2 = new vSmall();
        addObject(vSmall2,874,308);
        vSmall2.setLocation(862,296);
        mid.setLocation(995,228);
        mid.setLocation(982,232);
        vSmall vSmall3 = new vSmall();
        addObject(vSmall3,750,186);
        vSmall3.setLocation(750,170);
        vSmall vSmall4 = new vSmall();
        addObject(vSmall4,644,308);
        vSmall4.setLocation(637,287);
        small3.setLocation(582,235);
        small.setLocation(700,350);
        small.setLocation(691,342);
        small3.setLocation(608,235);
        small3.setLocation(590,233);
        small3.setLocation(580,228);
        small3.setLocation(581,233);
        small3.setLocation(578,231);
        small3.setLocation(630,237);
        vSmall4.setLocation(643,326);
        vSmall4.setLocation(637,289);
        small.setLocation(742,343);
        small.setLocation(695,347);
        vSmall vSmall5 = new vSmall();
        addObject(vSmall5,747,389);
        vSmall5.setLocation(752,409);
        small3.setLocation(541,238);
        small3.setLocation(583,231);
        vSmall2.setLocation(860,273);
        vSmall2.setLocation(863,292);
        vSmall vSmall6 = new vSmall();
        addObject(vSmall6,508,423);
        vSmall6.setLocation(523,402);
        vSmall6.setLocation(523,402);
        vSmall vSmall7 = new vSmall();
        addObject(vSmall7,294,396);
        vSmall7.setLocation(290,405);
        vSmall vSmall8 = new vSmall();
        addObject(vSmall8,177,268);
        vSmall8.setLocation(183,291);
        small4.setLocation(226,227);
        small4.setLocation(246,232);
        mid3.setLocation(799,572);
        mid.setLocation(947,228);
        mid.setLocation(988,232);
        vSmall2.setLocation(871,271);
        vSmall2.setLocation(862,278);
        vSmall2.setLocation(871,265);
        vSmall2.setLocation(861,278);
        vSmall2.setLocation(861,277);
        mid2.setLocation(827,469);
        mid2.setLocation(855,466);
        mid6.setLocation(210,349);
        mid6.setLocation(290,347);
        tiny.setLocation(451,332);
        tiny.setLocation(466,344);
        tiny.setLocation(467,347);
        tiny.setLocation(522,348);
        tiny.setLocation(522,392);
        small6.setLocation(527,467);
        small6.setLocation(462,459);
        small6.setLocation(463,458);
        mid5.setLocation(322,570);
        mid5.setLocation(304,564);
        small5.setLocation(148,464);
        small5.setLocation(131,467);
        vSmall8.setLocation(187,292);
        vSmall8.setLocation(184,292);
        mid4.setLocation(1116,578);
        mid4.setLocation(1096,578);
        mid3.setLocation(743,560);
        tiny.setLocation(517,351);
        tiny.setLocation(509,354);
        tiny.setLocation(451,236);
        tiny.setLocation(462,358);
        tiny.setLocation(468,345);
        tiny.setLocation(467,348);
        vSmall6.setLocation(516,416);
        vSmall6.setLocation(522,393);
        mid3.setLocation(819,564);
        mid3.setLocation(762,567);
        vSmall vSmall9 = new vSmall();
        addObject(vSmall9,397,513);
        vSmall9.setLocation(409,507);
        vSmall9.setLocation(409,507);
        vSmall vSmall10 = new vSmall();
        addObject(vSmall10,861,514);
        vSmall10.setLocation(867,513);
        vSmall vSmall11 = new vSmall();
        addObject(vSmall11,628,517);
        vSmall11.setLocation(641,522);
        vSmall11.setLocation(639,522);
        vSmall vSmall12 = new vSmall();
        addObject(vSmall12,754,607);
        vSmall12.setLocation(752,628);
        vSmall vSmall13 = new vSmall();
        addObject(vSmall13,513,644);
        vSmall13.setLocation(520,625);
        vMid vMid = new vMid();
        addObject(vMid,1000,376);
        vMid.setLocation(977,361);
        vMid vMid2 = new vMid();
        addObject(vMid2,388,248);
        vMid2.setLocation(411,235);
        vTall vTall = new vTall();
        addObject(vTall,75,336);
        vTall.setLocation(66,405);
        vTall vTall2 = new vTall();
        addObject(vTall2,1137,463);
        vTall2.setLocation(1214,418);
        vTall2.setLocation(1199,409);
        removeObject(vTall2);
        Ant ant = new Ant();
        addObject(ant,126,98);
        small small7 = new small();
        addObject(small7,38,110);
        small7.setLocation(1410,776);
        removeObject(small7);
        vSmall vSmall14 = new vSmall();
        addObject(vSmall14,1110,763);
        vSmall14.setLocation(1092,744);
        bread bread = new bread();
        addObject(bread,794,509);
        bread.setLocation(799,522);
        bread bread2 = new bread();
        addObject(bread2,1165,304);
        bread bread3 = new bread();
        addObject(bread3,1145,762);
        bread bread4 = new bread();
        addObject(bread4,1015,749);
        bread bread5 = new bread();
        addObject(bread5,477,407);
        bread bread6 = new bread();
        addObject(bread6,264,296);
        teleport teleport = new teleport();
        addObject(teleport,918,292);
        teleport teleport2 = new teleport();
        addObject(teleport2,685,629);

        frog frog = new frog();
        addObject(frog,116,405);
        frog frog2 = new frog();
        addObject(frog2,578,622);
        frog frog3 = new frog();
        addObject(frog3,803,410);
        frog frog4 = new frog();
        addObject(frog4,1040,513);
        tiny tiny2 = new tiny();
        addObject(tiny2,120,7);
        tiny2.setLocation(125,-6);
        tiny2.setLocation(135,11);
        youWin youWin = new youWin();
        addObject(youWin,1151,39);
    }
}
