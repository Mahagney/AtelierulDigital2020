package lab6.ch2;

public class Pair <T extends Shoe>{
    private T first;
    private T second;

    public Pair(T first, T second) throws Exception {
        if(!first.getColor().equals(second.getColor())){
            throw new Exception("Colors don't match!");
        }

        if(first.getSize()!=second.getSize()){
            throw new Exception("Size doesn't match!");
        }

        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public String toString(){
        return "" + this.getClass() + " contains: \n " + first + " \n " + second;
    }
}
