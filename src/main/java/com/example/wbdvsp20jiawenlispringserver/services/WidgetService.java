package com.example.wbdvsp20jiawenlispringserver.services;

import com.example.wbdvsp20jiawenlispringserver.models.Widget;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class WidgetService {

    List<Widget> widgetList = new ArrayList<>();


    public Widget createWidget(Widget widget) {
        widgetList.add(widget);
        return widget;
    }


    public int deleteWidget(String wid) {
        widgetList = widgetList.stream().filter(widget -> !widget.getId().equals(wid)).collect(Collectors.toList());
        return 1;
    }

    public int updateWidget(String wid, Widget newWidget) {
        System.out.println(wid);
        System.out.println(newWidget);
        widgetList = widgetList.stream().map(widget -> {
            if (widget.getId().equals(wid))
                return newWidget;
            else
                return widget;
        }).collect(Collectors.toList());

        return 1;
    }

    public Widget findWidgetById(String wid) {
        List<Widget> tmp = widgetList.stream().filter(widget -> widget.getId().equals(wid)).collect(Collectors.toList());
        return tmp.get(0);
    }

    public List<Widget> findWidgetsForTopic(String topicId) {
        return widgetList.stream().filter(widget -> widget.getTid().equals(topicId)).collect(Collectors.toList());
    }

    public List<Widget> findAllWidgets() {
        return widgetList;
    }

}