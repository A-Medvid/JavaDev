package hw11;

public class SuperRepository {
    private Entity entity = new Entity(1);

    private static Entity entities[] = new Entity[10];

    //повертає масив
    public void getAll() {
        for (int i = 0; i < entities.length; i++) {
            entity = entities[i];
            System.out.println(entity);
        }
    }

    //додавання нової лекції
    public void add(int id, Entity entity){
        entities[id] = entity;
    }

    //відкрити вибрану лекцію
    public void getById(int id) {
        entity = entities[id];
        System.out.println(entity);
    }

    //видалити вибрану лекцію
    public void deleteById(int id) {
        entities[id] = null;
    }



}
