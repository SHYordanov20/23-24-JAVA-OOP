package Comperators;

import java.util.Comparator;

public class DogComparatorByNameAndAge implements Comparator<Dog> {
    @Override
    public int compare(Dog first, Dog seccond) {
        if(first.getName().compareTo(seccond.getName())>0)
        {
            return 1;
        }else if(first.getName().compareTo(seccond.getName())<0)
        {
            return -1;
        }else
        {
            if(first.getAge() > seccond.getAge())
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    }
}
