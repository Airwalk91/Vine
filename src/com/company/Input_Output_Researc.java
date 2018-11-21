package com.company;

import java.util.*;

public class Input_Output_Researc {

    SortedMap<String, String> vine = new TreeMap<String, String>();  // вино и сорт вина

    List time = new ArrayList<Integer>();    // время выдержки

    ArrayList<String> grapeType = new ArrayList<String>(); // тип винограда

    TreeSet<String> plaseType = new TreeSet<String>(); //  место збережения вина


    public void Input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите название вина: ");
        String vineName = input.nextLine();

        System.out.println("Введите сорт вина: ");
        String vineSort = input.nextLine();

        System.out.println("Введите тип винограда из которого сделано вино: ");
        String grapeSort = input.nextLine();

        System.out.println("Введите название места где хранилось вино: ");
        String plase = input.nextLine();

        System.out.println("Введите время выдержки вина: ");
        int vineTime = input.nextInt();

        Broadcast(vineName, vineSort);
        getGrape(grapeSort);
        getPlace(plase);
        getTime(vineTime);


        /*
        System.out.println(vine);
        System.out.println(time);
        System.out.println(grapeType);
        System.out.println(plaseType);
        */
    }


    public void Broadcast(String vineName, String vineSort) {
        vine.put(vineName, vineSort);
    }

    public void getGrape(String grapeSort) {
        grapeType.add(grapeSort);
    }

    public void getPlace(String plase) {
        plaseType.add(plase);
    }

    public void getTime(Integer vineTime) {
        time.add(vineTime);
    }


    public void Output() {
        System.out.println("Что-бы вывести всю информацию о винах нажмите '1' :");
        int value;
        Scanner scan = new Scanner(System.in);
        value = scan.nextInt();

        switch (value) {
            case 1:
                showAll(vine);
        }

    }


    public void showAll(Map<String, String> vine) {
        int count = 0;
        for (Map.Entry<String, String> pair : vine.entrySet()) {
            System.out.println("Название и сорт вина: ");
            System.out.println(pair.getKey() + " " + pair.getValue());


            System.out.println("Тип винограда: " + grapeType.get(count));

            System.out.println("Время выдержки: " + time.get(count));


            System.out.println("" + plaseType.iterator());

            count++;
        }


    }

}
