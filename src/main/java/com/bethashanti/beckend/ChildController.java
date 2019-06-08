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
                          @RequestParam(value = "eMail", defaultValue = "") String eMail,
                          @RequestParam(value = "parentsStatus", defaultValue = "") String parentsStatus,
                          @RequestParam(value = "numOfSiblings", defaultValue = "") String numOfSiblings,
                          @RequestParam(value = "economicStatus", defaultValue = "") String economicStatus,
                          @RequestParam(value = "origin", defaultValue = "") String origin,
                          @RequestParam(value = "nation", defaultValue = "") String nation,
                          @RequestParam(value = "placeOfBirth", defaultValue = "") String placeOfBirth,
                          @RequestParam(value = "passportNum", defaultValue = "") String passportNum,
                          @RequestParam(value = "citizenship", defaultValue = "") String citizenship,
                          @RequestParam(value = "dream", defaultValue = "") String dream,
                          @RequestParam(value = "dreamPriority", defaultValue = "") String dreamPriority,
                          @RequestParam(value = "personalSidur", defaultValue = "") String personalSidur,
                          @RequestParam(value = "restriction1", defaultValue = "") String restriction1,
                          @RequestParam(value = "restriction2", defaultValue = "") String restriction2,
                          @RequestParam(value = "endDate1", defaultValue = "") String endDate1,
                          @RequestParam(value = "endDate2", defaultValue = "") String endDate2,
                          @RequestParam(value = "leaveDate", defaultValue = "") String leaveDate,
                          @RequestParam(value = "moveTo", defaultValue = "") String moveTo,
                          @RequestParam(value = "reasonForLeaving", defaultValue = "") String reasonForLeaving) {

        return new Child(this.counter.incrementAndGet(), idNumber, arrivaleDate, firstName, lastName, gender, dateOfBirth,
                city, address, staffInCharge, status, phoneNum, eMail, mothersName, fathersName, house, parentsStatus ,numOfSiblings,
                economicStatus, origin, nation, placeOfBirth, passportNum, citizenship, dream, dreamPriority, personalSidur,
                restriction1, restriction2, endDate1, endDate2, leaveDate, moveTo, reasonForLeaving);
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


