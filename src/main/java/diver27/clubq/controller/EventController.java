package diver27.clubq.controller;

import diver27.clubq.model.Event;
import diver27.clubq.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/event")
public class EventController {
    @Autowired
    private EventService eventService;

    /**
     * 最近发布社团活动列表
     * @param head 列表起始位置
     * @param pageLimit 列表长度
     * @return
     * [
     *     {
     *         "id": 4,
     *         "title": "test4",
     *         "clubId": 3,
     *         "time": "2020-05-22T14:03:02.000+0000",
     *         "location": "testplace4",
     *         "description": "testintro4",
     *         "status": 3
     *     }
     * ]
     */
    @GetMapping(path = "/latest")
    public @ResponseBody
    Iterable<Event> getEventLatest(@RequestParam int head, @RequestParam int pageLimit) {
        return eventService.getEventsLatest(head, pageLimit);
    }

    /**
     * 随机取得活动列表
     * @param pageLimit 列表长度
     * @return 同上
     */
    @GetMapping(path = "/random")
    public @ResponseBody
    Iterable<Event> getEventRandom(@RequestParam int pageLimit) {
        return eventService.getEventsRandom(pageLimit);
    }

    /**
     * 获得活动详情
     * @param eventId 活动id
     * @return
     * {
     *     "id": 1,
     *     "title": "test1",
     *     "clubId": 1,
     *     "time": "2019-11-20T00:00:00.000+0000",
     *     "location": "testplace1",
     *     "description": "testintro1",
     *     "status": 1
     * }
     */
    @GetMapping(path = "/info")
    public @ResponseBody
    Optional<Event> getEventInfo(@RequestParam Integer eventId) {
        return eventService.getEventInfo(eventId);
    }

    /**
     * 获取已参与的活动列表
     * @param userId 用户id
     * @return
     * [
     *     {
     *         "id": 1,
     *         "title": "test1",
     *         "clubId": 1,
     *         "time": "2019-11-20T00:00:00.000+0000",
     *         "location": "testplace1",
     *         "description": "testintro1",
     *         "status": 1
     *     }
     * ]
     */
    @GetMapping(path = "/my_event")
    public @ResponseBody
    List<Event> getMyEvent(@RequestParam Integer userId){
        return eventService.getMyEvent(userId);
    }

    /**
     * 依名称搜索活动
     * @param keyword 名称关键词
     * @param head 列表起始
     * @param pageLimit 列表长度
     * @return 同上
     */
    @GetMapping(path="/search")
    public @ResponseBody
    List<Event> searchEvents(@RequestParam String keyword, @RequestParam int head, @RequestParam int pageLimit){
        return eventService.searchEvents(keyword, head, pageLimit);
    }
}
