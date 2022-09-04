public class Main {
    public static void main(String[] args) {
        //Задание7
        byte age=17;
        if (age>=2 && age<=6){
        System.out.println("Ходишь в детский сад, тебе "+(age));
    }else if (age>=7 && age<=18){
            System.out.println("Ходишь в школу, тебе "+(age));
        }
        else if (age>18 && age<24){
            System.out.println("Ходишь в ВУЗ, тебе "+(age));
        }
        else {
            System.out.println("Ходишь на работу, тебе "+(age));
        }
        //задание8
        if (age>=5 && age<14){
            System.out.println("Может кататься в сопровождение взрослых");
        } else if (age<5){
            System.out.println("Не может кататься");
        } else {
            System.out.println("Может кататься без сопровождения");
        }
        //задание9
        short one=11;
        short two=2;
        short free=34;
        if (one>two && one>free){
            System.out.println((one)+" Наибольшее");
        } else if (two>one && two>free){
            System.out.println((two)+" Наибольшее");
        } else {
            System.out.println((free)+" Наибольшее");
        }
    }
}