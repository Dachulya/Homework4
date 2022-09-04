public class Main {
    public static void main(String[] args) {
        //Задание4
        byte age=17;
        if (age>=18){
        System.out.println("Поздравляю ты совершеннолетний");
    }else {
            System.out.println("Возраст совершеннолетия ещё не наступил, надо подождать");
        }
        //задание5
        if (age>=18&&age<24){
            System.out.println("Поздравляю ты закончил школу, можешь идти в вуз");
        } else if ((age<18)&&(age>7)){
            System.out.println("Возраст совершеннолетия ещё не наступил, ты учишься в школе");
        } else {
            System.out.println("Пора искать первую работу");
        }
        //задание6
        short place=103;
        if (place>60&&place<103){
            System.out.println("Стоячее место в вагоне");
        } else if (place<60){
            System.out.println("Сидячее место в вагоне");
        } else {
            System.out.println("Вагон переполнен");
        }
    }
}