package diver27.clubq.controller;

import diver27.clubq.model.Event;
import diver27.clubq.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping(path = "/event")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping(path = "/latest")
    public @ResponseBody
    Iterable<Event> getEventLatest(@RequestParam int head, @RequestParam int pageLimit) {
        return eventService.getEventsLatest(head, pageLimit);
    }

    @GetMapping(path = "/random")
    public @ResponseBody
    Iterable<Event> getEventRandom(@RequestParam int pageLimit) {
        return eventService.getEventsRandom(pageLimit);
    }

    @GetMapping(path = "info")
    public @ResponseBody
    Optional<Event> getEventInfo(@RequestParam Integer eventId) {
        return eventService.getEventInfo(eventId);
    }
}
