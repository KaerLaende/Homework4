public class Main {
    public static void main(String[] args) {
        // Условные операторы. Часть 1.
        //Задание 1
        System.out.println("Задание 1");
        int userAge1 = 18;
        int userAge2 = 16;
        if (userAge1>=18){
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (userAge2<18){
            System.out.println("Ваш возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        int manAge1 = 7;
        int manAge2 = 18;
        int manAge3 = 24;
        if (manAge1>=7){
            System.out.println("Ребенок ходит в школу в возрасте "+manAge1);}
        if (manAge2>=18){
            System.out.println("Человек уже закончил школу и может отправляться в университет в возрасте "+manAge2);}
        if (manAge3>=24){
            System.out.println("Человек окончил университет и ему пора искать первую работу в возрасте "+manAge3);}
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        int wagonCapacity = 102;
        int seatPlace = 60;
        int standingPlace = wagonCapacity-seatPlace;
        int wagonOccupancy = 1;
        if (wagonOccupancy<60){
            System.out.println("В вагоне есть сидячие места");}
        wagonOccupancy = 65;
        if (wagonOccupancy<102){
            System.out.println("В вагоне есть стоячие места");}
        wagonOccupancy=102;
        if (wagonOccupancy==102){
            System.out.println("В вагоне уже нет мест");}
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");
        if (userAge2>=18){
            System.out.println("Поздравляем с совершеннолетием!");}
        else {
            System.out.println("Ваш возраст совершеннолетия ещё не наступил, и нужно немного подождать.");}
        System.out.println();

        //Задание 5
        System.out.println("Задание 5");
        if (manAge1>=7){
            System.out.println("Ребенок ходит в школу в возрасте "+manAge1);}
        else if (manAge2 >= 18){
            System.out.println("Человек уже закончил школу и может отправляться в университет в возрасте "+manAge2);}
        else {
            System.out.println("Человек окончил университет и ему пора искать первую работу в возрасте "+manAge3);}
        System.out.println();


        //Задание 6
        System.out.println("Задание 6");
        if (wagonOccupancy<60){
            System.out.println("В вагоне есть сидячие места");}
                else if (wagonOccupancy<102){
            System.out.println("В вагоне есть стоячие места");}
                else  {
            System.out.println("В вагоне уже нет мест");}
        System.out.println();

        //Задание 7
        System.out.println("Задание 7");
        int peopleAge =25;
        boolean needGoKindergarten = peopleAge>2 && peopleAge<6;
        boolean needGoSchool = peopleAge>7 && peopleAge<18;
        boolean needGoUniversity = peopleAge>18 && peopleAge<24;
        boolean needGoJob = peopleAge>24 && peopleAge<65;
        if(needGoKindergarten){
            System.out.println("Если возраст человека равен " +peopleAge+ ", то ему нужно ходить в садик");
        }
            else if (needGoSchool){
            System.out.println("Если возраст человека равен " +peopleAge+ ", то ему нужно ходить в школу");
        }
            else if (needGoUniversity) {
            System.out.println("Если возраст человека равен " +peopleAge+ ", то ему нужно ходить в университет");
        }
            else if (needGoJob) {
            System.out.println("Если возраст человека равен " +peopleAge+ ", то ему нужно ходить на работу");
        }
        System.out.println();

        //  Задание 8
        System.out.println("Задание 8");
        int kinderAge = 8;
        boolean haveAdult = true;
        boolean canNotAttractions = kinderAge<5;
        boolean rideWithAdult = kinderAge>=5 &&kinderAge<14 || haveAdult;
        boolean youCanRide = kinderAge>=14;
        if (canNotAttractions){
            System.out.println("Вашему ребенку только " +kinderAge+ " года и он еще не может кататься на аттракционе.");
        }
        else if(rideWithAdult){
            System.out.println("Вашему ребенку " +kinderAge+ " лет значит он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (youCanRide) {
            System.out.println("Вам уже "+kinderAge+" лет, Вы можете кататься без сопровождения взрослого.");
        }
        System.out.println();

        //Задание 9
        System.out.println("Задание 9");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean firstCondition = one>two&&one>three;
        boolean secondCondition = two>three&&two>one;
        boolean thirdCondition = three>two&&three>one;
        if (firstCondition){
            System.out.println("Число "+one+" - самое большое!"); // Подскажите как выводить в принт Название переменной "one.getName" что то типо этого?
        }                                                   // toString  - это для классов, а для переменных есть что то такое?
        else if (secondCondition) {
            System.out.println("Число "+ two +" - самое большое!");
        }
        else if (thirdCondition) {
            System.out.println("Число "+ three +" - самое большое!");
        }
        else System.out.println("Секретный, неотоброжаемый код");

        //Если вы проверяете напишите фидбек какой нибудь хоть 1 слово! спасибо!
        System.out.println("\n");
        System.out.println("Конец");


    }
}
