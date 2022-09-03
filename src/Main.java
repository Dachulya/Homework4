public class Main {
    public static void main(String[] args) {
        //Задание1
        byte age=17;
        if (age>=18){
        System.out.println("Поздравляю ты совершеннолетний");
    }
        if (age<18){
            System.out.println("Возраст совершеннолетия ещё не наступил, надо подождать");
        }
        //задание2
        if (age>=18&&age<24){
            System.out.println("Поздравляю ты закончил школу, можешь идти в вуз");
        }
        if ((age<18)&&(age>7)){
            System.out.println("Возраст совершеннолетия ещё не наступил, ты учишься в школе");
        }
        if (age>24){
            System.out.println("Пора искать первую работу");
        }
        //задание3
        short place=103;
        if (place>60&&place<103){
            System.out.println("Стоячее место в вагоне");
        }
        if (place<60){
            System.out.println("Сидячее место в вагоне");
        }
        if (place>102){
            System.out.println("Вагон переполнен");
        }
    }
}