package lab2.ch2;

public class Film {
    private Integer anAparitie;
    private String name;
    private Actor[] actors;

    public Film(Integer anAparitie, String name, Actor[] actors) {
        this.anAparitie = anAparitie;
        this.name = name;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public Actor[] getActors() {
        return actors;
    }

    public Actor getActorByName(String actorName){
        for(Actor actor:actors){
            if(actor!=null && actor.getName().equals(actorName)){
                return actor;
            }
        }
        return null;
    }

    public boolean hasActorsAboveAge(int age){
        for(Actor actor:actors){
            if(actor!=null && actor.getAge()>age){
                return true;
            }
        }
        return false;
    }

}
