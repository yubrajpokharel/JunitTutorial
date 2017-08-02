import com.yubraj.domain.Person;
import com.yubraj.services.PersonService;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yubrajpokharel on 8/1/17.
 */

public class PersonServiceTest {

    private PersonService personService = new PersonService();

    @Test
    public void check_if_personList_is_empty_or_not() {
        Assert.assertEquals(0, personService.getAllPerson().size());
    }

    @Test
    public void check_if_person_is_added_or_not() {
        Person person = new Person("rajiv", "mhrz", "email@email.com", 23);
        personService.addPerson(person);
        Assert.assertEquals(1, personService.getAllPerson().size());
    }

    @Test
    public void chech_if_people_is_delete_or_not() {
        Person person = new Person("rajiv", "mhrz", "email@email.com", 23);
        personService.removePerson(person);
        Assert.assertEquals(0, personService.getAllPerson().size());
    }
}