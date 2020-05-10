package diver27.clubq.controller;

import diver27.clubq.model.Event;
import diver27.clubq.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/my_event")
public class AttendanceController {
    @Autowired
    AttendanceService attendanceService;

//    @GetMapping(path="/list")
//    public @ResponseBody
//    List<Event> getEventAttended(@RequestParam Integer userId){
//
//    }//Todo: 多表查询
}
