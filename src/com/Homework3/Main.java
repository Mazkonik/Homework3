package com.Homework3;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(5);
System.out.println("Введите название элемента для того что бы добавить его на склад");
        String outputFileName = "file.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;

                while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writter.write(line);
                    while (arrayList.size()> 4  ){
                        System.out.println("Превышен размер склада");
                        System.out.println("Вы хотите добавить новый элемент и расширить склад?\n 'y' or 'n'");
                        Scanner add2 = new Scanner(System.in);
                        String name2 = add2.nextLine();
                        if (name2.equals("y")){
                            break;        }
                        if (name2.equals("n")){
                            return;
                        }
                    }
                if (line.equals("del")){
                    System.out.println("Какой элемент удалить?");
                    Scanner add1 = new Scanner(System.in);
                    String name = add1.nextLine();
                    arrayList.remove(name);
                    System.out.println("Элемент " + name + " удалён");
                    continue;
                }
                    if (arrayList.add(line)) {
                        System.out.println("Добавлен элемент " + line + "\nНа складе сейчас \n" + arrayList);
                    }

                }



            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        }
    }


