package diver27.clubq.service;

import diver27.clubq.model.User_act;
import diver27.clubq.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class AttendanceService {
    @Autowired
    AttendanceRepository attendanceRepository;

    public List<User_act> getEventsAttended(int userId){
        return attendanceRepository.findByUserId(userId);
    }
}
