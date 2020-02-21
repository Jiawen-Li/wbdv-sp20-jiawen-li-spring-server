package controllers;

import models.Widget;
import org.springframework.web.bind.annotation.*;
import services.WidgetService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
class WidgetController {
    WidgetService widgetService = new WidgetService();

    @GetMapping("/api/widgets")
    public List<Widget> findAllWidget(){
        return widgetService.findAllWidgets();
    }

    @GetMapping("/api/topics/{tid}/widgets")
    public List<Widget> findWidgetsForTopic(@PathVariable("tid") String tid){
        return widgetService.findWidgetsForTopic(tid);
    }

    @PutMapping("/api/widgets/{wid}")
    int updateWidget(@PathVariable("wid") String wid, @RequestBody Widget widget){
        return widgetService.updateWidget(wid,widget);
    }

    @DeleteMapping("/api/widgets/{wid}")
    int deleteWidget(@PathVariable("wid") String wid){
        return widgetService.deleteWidget(wid);
    }

}