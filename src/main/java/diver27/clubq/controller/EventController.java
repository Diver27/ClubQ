package diver27.clubq.controller;

import diver27.clubq.model.Act;
import diver27.clubq.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping(path="/event")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping(path="/latest")
    public @ResponseBody
    Iterable<Act> getEventLatest(){
        return eventService.getEventsLatest(0,0);
    }

    @GetMapping(path="info")
    public @ResponseBody
    Optional<Act> getEventInfo(@RequestParam Integer eventId){
        return eventService.getEventInfo(eventId);
    }
}
