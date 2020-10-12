package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        //1
//        Dog dog = new Dog("Байра");
//        //dog.putLeash();
//        dog.putCollar();
//        dog.putMuzzle();
//        try {
//            dog.walk();
//        } catch (DogException e) {
//            System.out.println(e.getMessage());
//            System.out.println("Ошейник:" + dog.isCollar + "\r\n Поводок: "
//                    + dog.isLeash+ "\r\n Намордник: " + dog.isMuzzle);
//        }
        //2
        String[] arr = new String[]{"яблоко", "картошка",  null, "10"};

        String[] newArr =  (String[]) filter(arr, new Filter() {
            @Override
            public boolean apply(Object obj) {
                //если в массиве null
                return obj != null;
            }
        });
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }





    public static Object[] filter(Object[] arr, Filter filter) {
            int counter = 0;

            for(int i = 0; i< arr.length; i++){
                if(!filter.apply(arr[i])){
                    counter++;
                } else{
                    arr[i - counter] = arr[i];
                }
            }

            return Arrays.copyOf(arr, arr.length - counter);
        }

    }
