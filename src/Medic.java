public class Medic extends Hero{
    int healPoints;
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность: Healing");
    }

    public void increaseExperience(){
        healPoints *= 1.1;
    }
}
