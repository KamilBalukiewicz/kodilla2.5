package com.kodilla;
import java.util.*;

class Grades {
    public static void main (String[] args) throws java.lang.Exception {

        ArrayList<Integer> itGrades = new ArrayList<Integer>();
        itGrades.add(5);
        itGrades.add(5);
        itGrades.add(4);
        itGrades.add(4);
        itGrades.add(1);
        itGrades.add(5);
        itGrades.add(4);
        itGrades.add(3);
        itGrades.add(3);
        itGrades.add(2);
        itGrades.add(6);
        itGrades.add(1);
        itGrades.add(6);
        itGrades.add(4);

        int sum = 0;
        double average = 0;

        int min = itGrades.get(0);
        int max = itGrades.get(0);

        for(int i=0; i < itGrades.size(); i++) {
            int grade = itGrades.get(i);
            sum += grade;
            if(grade < min) min = grade;
            if(grade > max) max = grade;
        }

        average = (sum - min - max) / (itGrades.size() - 2.0);

        for(Integer grade: itGrades) {
            System.out.println("The grade is " + grade);
        }
        System.out.println();
        System.out.println("The lowest grade is " + min);
        System.out.println("The highest grade is " + max);
        System.out.println("Number of grades is " + itGrades.size());
        System.out.println("Average equals " + average);
        System.out.println();

        System.out.println("Books published after 1999:");
        LinkedList<Books> books = new LinkedList<>();

        books.add(new Books("The Colour of Magic" , 1983));
        books.add(new Books("The Light Fantastic" , 1986));
        books.add(new Books("Equal Rites" , 1987));
        books.add(new Books("Mort" , 1987));
        books.add(new Books("Sourcery" , 1988));
        books.add(new Books("Wyrd Sisters" , 1988));
        books.add(new Books("Night Watch" , 2002));
        books.add(new Books("The Wee Free Men" , 2003));
        books.add(new Books("Monstrous Regiment" , 2003));
        books.add(new Books("A Hat Full of Sky", 2004));

        for(Books m: books) {
            if(m.year > 1999)
                System.out.println(m);
        }

    }
}

class Books {

    String title;
    Integer year;

    Books(String title, Integer year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getYear() {
        return this.year;
    }

    public String toString() {
        return title + ", " + year;
    }

}
