package Comperators;

import java.util.Comparator;

public class DogComparatorByBreed implements Comparator<Dog> {
    @Override
    public int compare(Dog first, Dog second) {
        if(first.getType().compareTo(second.getType()) > 0)
        {
            return 1;
        }else if(first.getType().compareTo(second.getType()) <0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
