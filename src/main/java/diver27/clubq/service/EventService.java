package diver27.clubq.service;

import diver27.clubq.model.Event;
import diver27.clubq.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getEventsLatest(int head, int pageLimit) {
        return eventRepository.findEventsByPage(head, pageLimit);
    }

    public List<Event> getEventsRandom(int pageLimit) {
        return eventRepository.findEventsByRandom(pageLimit);
    }

    public Optional<Event> getEventInfo(Integer id) {
        return eventRepository.findById(id);
    }

    public List<Event> getMyEvent(Integer userId){
        return eventRepository.findEventsByUserId(userId);
    }

    public List<Event> searchEvents(String title, int head, int pageLimit){
        return eventRepository.findEventsByTitle(title, head, pageLimit);
    }
}
