package com.bethashanti.beckend;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ChildController {

    private static final String template = "Hello, %s!";// by marking %s, we can use String format to insert a String to replace %s
    private final AtomicLong counter = new AtomicLong();//atomic increment of long value

    /*
    when a request is mapped to "/greeting" this controller is triggered and runs

    @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.
     If the name parameter is absent in the request, the defaultValue of "World" is used
    */
    @RequestMapping("/greetings")
    public Child greeting(@RequestParam(value = "id", defaultValue = "") String idNumber,
                          @RequestParam(value = "arrivalDate", defaultValue = "") String arrivaleDate,
                          @RequestParam(value = "firstName", defaultValue = "") String firstName,
                          @RequestParam(value = "lastName", defaultValue = "") String lastName,
                          @RequestParam(value = "sex", defaultValue = "unknown") String gender,
                          @RequestParam(value = "dateOfBirth", defaultValue = "") String dateOfBirth,
                          @RequestParam(value = "mothersName", defaultValue = "") String mothersName,
                          @RequestParam(value = "fathersName", defaultValue = "") String fathersName,
                          @RequestParam(value = "house", defaultValue = "GeneralHouse") String house,
                          @RequestParam(value = "city", defaultValue = "") String city,
                          @RequestParam(value = "address", defaultValue = "") String address,
                          @RequestParam(value = "staffInCharge", defaultValue = "") String staffInCharge,
                          @RequestParam(value = "status", defaultValue = "other") String status,
                          @RequestParam(value = "phoneNum", defaultValue = "") String phoneNum,
                          @RequestParam(value = "eMail", defaultValue = "") String eMail) {

        return new Child(this.counter.incrementAndGet(), idNumber, arrivaleDate, firstName, lastName, gender, dateOfBirth,
                city, address, staffInCharge, status, phoneNum, eMail, mothersName, fathersName, house);
            /*
            The implementation of the method body creates and returns a new Greeting object with id and content
            attributes based on the next value from the counter, and formats the given name by using the greeting template.
             */
    }
        /*A key difference between a traditional MVC controller and the RESTful web service controller above is the way
        that the HTTP response body is created. Rather than relying on a view technology to perform server-side rendering
        of the greeting data to HTML, this RESTful web service controller simply populates and returns a Greeting object.
        The object data will be written directly to the HTTP response as JSON.
         */

        /*
        This code uses Spring 4’s new @RestController annotation, which marks the class as a controller where every method
        returns a domain object instead of a view. It’s shorthand for @Controller and @ResponseBody rolled together.

        The Greeting object must be converted to JSON. Thanks to Spring’s HTTP message converter support, you don’t need to do
        this conversion manually. Because Jackson 2 is on the classpath, Spring’s MappingJackson2HttpMessageConverter is automatically
         chosen to convert the Greeting instance to JSON.
         */
}

