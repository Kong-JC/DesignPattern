package filter_pattern;

import filter_pattern.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kong on 2016/11/2.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for(Person person: persons){
            if (person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
