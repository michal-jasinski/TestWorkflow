package netgloo.controllers;

import netgloo.models.Events;
import netgloo.models.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * A class to test interactions with the MySQL database using the UserDao class.
 *
 * @author netgloo
 */
@Controller
@RequestMapping("/events")
public class EventsController {
    @Autowired
    private EventsRepository eventsRepository;

    @RequestMapping("/get")
    @ResponseBody
    public List<Events> get() {
        return eventsRepository.findAll();
    }

}
