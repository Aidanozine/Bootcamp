package Book4.chapter6;

// import java.util.*;
//
//public class Spell {
//    public String name;
//    public SpellType type;
//    public String description;
//
//    public enum SpellType {SPELL, CHARM, CURSE}
//
//    public Spell (String spellName, SpellType spellType, String spellDescription){
//        name = spellName;
//        type = spellType;
//        description = spellDescription;
//    }
//
//    @Override
//    public String toString(){
//        return name + " " + type + " " + description;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Spell> spells = new ArrayList<>();
//        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL,
//                "Makes invisible ink appear."));
//        spells.add(new Spell("Avis", Spell.SpellType.SPELL,
//                "Launches birds from your wand."));
//        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
//                "Enlarges something."));
//        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
//                "Hides a secret within someone."));
//        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
//                "Stops all current spells."));
//        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
//                "Locks an opponent's legs."));
//        for (Spell spell : spells){
//            System.out.println(spell);
//        }
//        for (Spell spell : spells){
//            if (spell.type == SpellType.SPELL){
//                System.out.println(spell);
//            }
//        }
//    }
//}

//import java.util.*;
//
//public class Spell {
//    public String name;
//    public SpellType type;
//    public String description;
//    public int price;
//
//    public enum SpellType {SPELL, CHARM, CURSE}
//
//    public Spell (String spellName, SpellType spellType, String spellDescription, int price){
//        name = spellName;
//        type = spellType;
//        description = spellDescription;
//        this.price = price;
//    }
//
//    @Override
//    public String toString(){
//        return name + " " + type + " " + description + " " + price;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Spell> spells = new ArrayList<>();
//        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL,
//                "Makes invisible ink appear.", 10));
//        spells.add(new Spell("Avis", Spell.SpellType.SPELL,
//                "Launches birds from your wand.", 15));
//        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
//                "Enlarges something.", 5));
//        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
//                "Hides a secret within someone.",30));
//        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
//                "Stops all current spells.", 25));
//        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
//                "Locks an opponent's legs.", 20));
////        spells.stream().forEach(s -> System.out.println(s));
//
////        spells.stream()
////        .filter(s -> s.type == SpellType.SPELL)
////        .forEach(s -> System.out.println(s));
//
//        spells.stream()
//                .filter(s -> s.name.toLowerCase().startsWith("a"))
//                .filter(s -> s.type == SpellType.SPELL)
//                .forEach(s -> System.out.println(s));
//    }
//}

//import java.util.*;
//
//public class Spell {
//    public String name;
//    public SpellType type;
//    public String description;
//    public int price;
//
//    public enum SpellType {SPELL, CHARM, CURSE}
//
//    public Spell (String spellName, SpellType spellType, String spellDescription, int price){
//        name = spellName;
//        type = spellType;
//        description = spellDescription;
//        this.price = price;
//    }
//
//    @Override
//    public String toString(){
//        return name + " " + type + " " + description + " " + price;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Spell> spells = new ArrayList<>();
//        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL,
//                "Makes invisible ink appear.", 10));
//        spells.add(new Spell("Avis", Spell.SpellType.SPELL,
//                "Launches birds from your wand.", 15));
//        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
//                "Enlarges something.", 5));
//        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
//                "Hides a secret within someone.",30));
//        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
//                "Stops all current spells.", 25));
//        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
//                "Locks an opponent's legs.", 20));
//        spells.stream().forEach(s -> System.out.println(s));
//
//        double total = spells.stream()
//                .mapToDouble(s -> s.price)
//                .sum();
//        System.out.println("Total: " + total);
//
//        double count = spells.stream()
//                .count();
//        System.out.println("Count: " + count);
//    }
//}

import java.util.*;

public class Spell {
    public String name;
    public SpellType type;
    public String description;
    public int price;

    public enum SpellType {SPELL, CHARM, CURSE}

    public Spell (String spellName, SpellType spellType, String spellDescription, int price){
        name = spellName;
        type = spellType;
        description = spellDescription;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + " " + type + " " + description + " " + price;
    }

    public static void main(String[] args) {
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL,
                "Makes invisible ink appear.", 10));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL,
                "Launches birds from your wand.", 15));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
                "Enlarges something.", 5));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
                "Hides a secret within someone.",30));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
                "Stops all current spells.", 25));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
                "Locks an opponent's legs.", 20));
//        spells.stream().forEach(s -> System.out.println(s));
//
//        OptionalDouble avg = spells.stream()
//                .mapToDouble(s -> s.price)
//                .average();
//        if (avg.isPresent()){
//            System.out.println("Average: " + avg.getAsDouble());
//        }
//        System.out.println("Average: " + avg.getAsDouble());

        System.out.println("First stream:");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));

        System.out.println("Second stream:");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));

        System.out.println("Third stream:");
        spells.parallelStream()
                .forEach(s -> System.out.println(s));
        //Each stream is different
    }
}