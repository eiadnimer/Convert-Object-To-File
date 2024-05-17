package org.example.file;

import org.example.core.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void if_name_equal_to_null_must_be_failed(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Person(null,"male",1));
    }

    @Test
    public void if_gender_equal_to_null_must_be_failed(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Person("eiad",null,1));
    }

    @Test
    public void if_id_equal_to_zero_or_less_must_be_failed(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Person("eiad","male",0));
    }
}
