package filter_pattern;

import filter_pattern.entity.Person;

import java.util.List;

/**
 * Created by Kong on 2016/11/2.
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
