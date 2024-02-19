public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a = 66666;
        System.out.println(a);
        byte b = 100;
        System.out.println(b);
        short c = 30000;
        System.out.println(c);
        long d = 777777777777L;
        System.out.println(d);
        float e = 3.75f;
        System.out.println(e);
        double f = 6.66d;
        System.out.println(f);

        float two = 27.12f;
        System.out.println(two);
        long twoTwo = 987678965549L;
        System.out.println(twoTwo);
        double twoThree = 2.786d;
        System.out.println(twoThree);
        short abc = 569;
        System.out.println(abc);
        int bca = (-159);
        System.out.println(bca);
        char acv = 27897;
        System.out.println(acv);
        byte bfd = 67;
        System.out.println(bfd);

        short total = 480;
        System.out.println("Всего листов бумаги "+total);
        byte classA = 23;
        System.out.println("У Людмилы Павловны "+ classA + "учеников");
        byte classB = 27;
        System.out.println("У Анны Сергеевны "+ classB + "учеников");
        byte classC = 30;
        System.out.println("У Екатерины Андреевны "+classC + "учеников");
        int sheetsForOnePupil = (total/(classA+classB+classC));
        System.out.println("На каждого ученика рассчитано "+sheetsForOnePupil+ " листов бумаги");

        int bottle = 16;
        int time = 2;
        System.out.println("Производительность машины для изготовления бутылок - "+bottle+" бутылок за "+time+" минуты");
        bottle=bottle*10;
        System.out.println("Производительность машины для изготовления бутылок - "+bottle+" бутылок за 20 минут");
        bottle=bottle*72;
        System.out.println("Производительность машины для изготовления бутылок - "+bottle+" бутылок в сутки");
        bottle=bottle*3;
        System.out.println("Производительность машины для изготовления бутылок - "+bottle+" бутылок за 3 суток");
        bottle=bottle*10;
        System.out.println("Производительность машины для изготовления бутылок - "+bottle+" бутылок за 1 месяц");

        int totalPaint = 120;
        int white = 2;
        int brown = 4;
        int classrooms = (totalPaint/(white+brown));
        white=white*classrooms;
        brown=brown*classrooms;
        System.out.println("В школе, где "+classrooms+" классов, нужно "+white+" банок белой краски и "+brown+" банок коричневой краски");

        int bananas = 80;
        int milk = 105;
        int icecream = 100;
        int eggs = 70;
        bananas = bananas*5;
        milk = milk*2;
        icecream = icecream*2;
        eggs=eggs*4;
        int totalWeight = bananas+milk+icecream+eggs;
        float totalWeightKgramms = totalWeight/1000f;
        System.out.println("Вес спортзавтрака "+totalWeight+ " грамм или "+totalWeightKgramms+" килограмм");

        int overweight = 7000;
        int loss_1 = 250;
        int loss_2 = 500;
        int day_250= overweight/loss_1;
        int day_500= overweight/loss_2;
        System.out.println("При похудении на 250 грамм в день потребуется "+day_250+" дней, а при похудении на 500 грамм в день потребуется "+day_500+" дней");

        int Masha_1 = 67760;
        int Denis_1 = 83690;
        int Kristina_1 = 76230;
        double Masha_2 = Masha_1*1.1d;
        double Denis_2 = Denis_1*1.1d;
        double Kristina_2 = Kristina_1*1.1d;
        double differenceMasha = (Masha_2-Masha_1)*12;
        double differenceDenis = (Denis_2-Denis_1)*12;
        double differenceKristina = (Kristina_2-Kristina_1)*12;
        double roundedMasha = Math.round(Masha_2 * 100.0) / 100.0;
        double roundedDenis = Math.round(Denis_2 * 100.0) / 100.0;
        double roundedKristina = Math.round(Kristina_2 * 100.0) / 100.0;
        double roundedMasha_2 = Math.round(differenceMasha * 100.0) / 100.0;
        double roundedDenis_2 = Math.round(differenceDenis * 100.0) / 100.0;
        double roundedKristina_2 = Math.round(differenceKristina * 100.0) / 100.0;
        System.out.println("Маша теперь получает "+roundedMasha+" рублей. Годовой доход вырос на "+roundedMasha_2+" рублей");
        System.out.println("Денис теперь получает "+roundedDenis+" рублей. Годовой доход вырос на "+roundedDenis_2+" рублей");
        System.out.println("Кристина теперь получает "+roundedKristina+" рублей. Годовой доход вырос на "+roundedKristina_2+" рублей");













    }
}
