public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19.0;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var oneFighter = 78.2;
        var twoFighter = 82.7;
        var fightersWeight = oneFighter + twoFighter;
        System.out.println("Общий вес бойцов " + fightersWeight + " кг");

        var differenceWeight = twoFighter - oneFighter;
        System.out.println("Разница бойцов в весе " + differenceWeight + " кг");

        var remains = twoFighter % oneFighter;
        System.out.println("Остаток деления " + remains + " кг");

        var hours = 640;
        var work = 8;
        var staff = hours / work;
        System.out.println("Всего работников в компании – " + staff + " человек");

        var newWork = 8;
        var newStaff = staff + 94;
        System.out.println("Всего сотрудников в компании " + newStaff + " человек");
        var officeHours = newWork * newStaff;
        System.out.println("Если в компании работает " + newStaff + " человека, то всего " + officeHours + " часа работы может быть поделено между сотрудниками");




    }
}