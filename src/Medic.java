public class Medic extends Hero {
    int healPoints;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность: Healing");
    }

    public void increaseExperience() {
        healPoints *= 1.1;
        System.out.println("Medic Увеличил лечения на 10%");
    }
}
