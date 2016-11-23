package filter_pattern;

import filter_pattern.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kong on 2016/11/2.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femaleCriteria = new ArrayList<>();
        for(Person person: persons){
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                femaleCriteria.add(person);
            }
        }
        return femaleCriteria;
    }
}
