package diver27.clubq.service;

import diver27.clubq.model.Event;
import diver27.clubq.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public void getEventsLatest(int head, int end) {
    }//Todo: Page

    public void getEventsRandom(int num) {
    }//Todo: Page

    public Optional<Event> getEventInfo(Integer id) {
        return eventRepository.findById(id);
    }//Todo: How to catch?

}