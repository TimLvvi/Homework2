//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1:"); // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        System.out.println("Задача 2:"); // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        System.out.println("Задача 3:"); // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        System.out.println("Задача 4:"); // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(" ");

        System.out.println("Задача 5:"); // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(" ");

        System.out.println("Задача 6:"); // Задача 6
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeightBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println("общая масса двух бойцов = " + totalWeightBoxers + "кг");
        var differenceBoxersWeights = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница между массами двух бойцов = " + differenceBoxersWeights + "кг");
        System.out.println(" ");

        System.out.println("Задача 7:"); // Задача 7
        var remainderDivision = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Остаток от деления между двумя весами = " + remainderDivision + "кг");
        System.out.println(" ");

        System.out.println("Задача 8:"); // Задача 8
        var totalHoursOperation = 640;
        var WorkingHoursOneEmployee = 8;
        var totalEmployees = totalHoursOperation / WorkingHoursOneEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        totalHoursOperation = totalEmployees * WorkingHoursOneEmployee;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalHoursOperation + " часов работы может быть поделено между сотрудниками");
        }
    }