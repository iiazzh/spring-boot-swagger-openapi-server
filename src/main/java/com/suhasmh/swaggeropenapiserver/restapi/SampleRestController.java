package com.suhasmh.swaggeropenapiserver.restapi;

import com.suhasmh.swaggeropenapiserver.model.request.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @GetMapping("/person")
    public Person getAPerson() {
        var person = new Person();
        person.setAge(24);
        person.setName("Josh Cody");
        return person;
    }
}
