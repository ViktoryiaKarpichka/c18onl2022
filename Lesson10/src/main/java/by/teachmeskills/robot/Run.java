package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например, у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot[] robots = new Robot[3];
        robots[0] = new Robot(new SamsungHead(100), new SonyHand(90), new ToshibaLeg(80));
        robots[1] = new Robot(new SonyHead(110), new ToshibaHand(80), new SamsungLeg(75));
        robots[2] = new Robot(new ToshibaHead(105), new SamsungHand(90), new SonyLeg(80));
        int max = robots[0].getPrice();
        for (int i = 0; i < robots.length; i++) {
            robots[i].action();
            if (max < robots[i].getPrice()) {
                System.out.printf("The most expensive robot is %s, price - %d", robots[i], robots[i].getPrice());
            }
        }
    }
}
