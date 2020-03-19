package com.example.wbdvsp20jiawenlispringserver.services;

import com.example.wbdvsp20jiawenlispringserver.models.Topic;
import com.example.wbdvsp20jiawenlispringserver.models.Widget;
import com.example.wbdvsp20jiawenlispringserver.repositories.TopicRepository;
import com.example.wbdvsp20jiawenlispringserver.repositories.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WidgetService {
    @Autowired
    WidgetRepository widgetRepository;

    @Autowired
    TopicRepository topicRepository;

    public Widget createWidget(int tid, Widget widget){
        Topic topic=topicRepository.findById(tid).get();
        widget.setTopic(topic);
        return widgetRepository.save(widget);
    }

    public List<Widget> findWidgetsForTopic(int tid){
        return widgetRepository.findWidgetForTopic(tid);
    }

    public int updateWidget(int wid, Widget widget){
        Optional<Widget> oldWidget = widgetRepository.findById(wid);
        if(oldWidget.isPresent()){
            widget.setId(wid);
            widget.setTopic(oldWidget.get().getTopic());
            try {
                widgetRepository.save(widget);
                return 1;
            } catch (Exception e) {
                return 0;
            }
        }
        return 0;

    }

    public int deleteWidget(int wid){
        try{
            widgetRepository.deleteById(wid);
            return 1;
        } catch (Exception e){
            return 0;
        }
    }

    public List<Widget> findAllWidgets(){
        return (List<Widget>) widgetRepository.findAll();
    }

    public Widget findWidgetById(int wid){
        return widgetRepository.findWidgetById(wid);
    }
}
