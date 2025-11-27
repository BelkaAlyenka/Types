public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte oceans = 5;
        System.out.println("Значение переменной oceans с типом byte равно "+oceans);
        int typesTrees = 73300;
        System.out.println("Значение переменной typesTrees с типом int  равно "+typesTrees);
        short countries = 195;
        System.out.println("Значение переменной countries с типом short равно "+countries);
        long people = 8000000000L;
        System.out.println("Значение переменной people с типом long равно "+people);
        float fatMilk = 2.5f;
        System.out.println("Значение переменной fatMilk с float равно "+fatMilk);
        double pi = 3.14159265358;
        System.out.println("Значение переменной pi с типом double равно "+pi);
        //Задача 2
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        //Задача 3
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        int papers = 480;
        int papersStudent = papers/(firstClass+secondClass+thirdClass);
        System.out.println("На каждого ученика рассчитано "+papersStudent+" листов бумаги");
        //Задача 4
        byte bottles = 16;
        byte minutes = 2;
        int oneMinute = bottles/minutes;
        byte twentyMinutes = 20;
        int firstTotal = oneMinute*twentyMinutes;
        System.out.println("За "+twentyMinutes+" минут машина произвела "+firstTotal+" штук бутылок");
        short day = 1440;
        int secondTotal = oneMinute*day;
        System.out.println("За "+day+" минут машина произвела "+secondTotal+" штук бутылок");
        short threeDays = (short) (day*3);
        int thirdTotal = oneMinute*threeDays;
        System.out.println("За "+threeDays+" минут машина произвела "+thirdTotal+" штук бутылок");
        int month = day*31;
        int fourthTotal = oneMinute*month;
        System.out.println("За "+month+" минут машина произвела "+fourthTotal+" штук бутылок");
        //Задача 5
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte total = 120;
        byte classes = (byte) (total/(whitePaint+brownPaint));
        byte whiteCans = (byte) (classes*whitePaint);
        byte brownCans = (byte) (classes*brownPaint);
        System.out.println("В школе, где "+classes+" классов, нужно "+whiteCans+" банок белой краски и "+brownCans+" банок коричневой краски");
        //Задача 6
        byte bananas = 5;
        byte bananasWeight = 80;
        byte milk = 2;
        byte milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
        short recipe = (short) (bananas*bananasWeight+milk*milkWeight+iceCream*iceCreamWeight+egg*eggWeight);
        System.out.println("Вес завтрака в составляет "+recipe+" грамм");
        double recipeKg = (double) recipe/1000;
        System.out.println("Вес завтрака в составляет "+recipeKg+" кг");
        //Задача 7
        short grams = 250;
        short moreGrams = 500;
        short weightLossDays = (short) (7000/grams);
        short weightLossDaysResult = (short) (7000/moreGrams);
        System.out.println("Для похудения потребуется при сбросе 250 грамм в день "+weightLossDays+ " дней");
        System.out.println("Для похудения потребуется при сбросе 500 грамм в день "+weightLossDaysResult+ " дней");
        //Задача 8
        float percent = 1.1f;
        int firstEmployee = 67760;
        int secondEmployee = 83690;
        int thirdEmployee = 76230;
        float differencePercentage = 1.2f;
        int firstSalary = (int) (firstEmployee*percent);
        int firstDifference = (int) (firstEmployee*differencePercentage);
        int secondSalary = (int) (secondEmployee*percent);
        int secondDifference = (int) (secondEmployee*differencePercentage);
        int thirdSalary = (int) (thirdEmployee*percent);
        int thirdDifference = (int) (thirdEmployee*differencePercentage);
        System.out.println("Маша теперь получает "+firstSalary+" рублей. Годовой доход вырос на "+firstDifference+" рублей");
        System.out.println("Денис теперь получает "+secondSalary+" рублей. Годовой доход вырос на "+secondDifference+" рублей");
        System.out.println("Кристина теперь получает "+thirdSalary+" рублей. Годовой доход вырос на "+thirdDifference+" рублей");
    }
}