package com.example.wbdvsp20jiawenlispringserver.repositories;

import com.example.wbdvsp20jiawenlispringserver.models.Topic;
import com.example.wbdvsp20jiawenlispringserver.models.Widget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WidgetRepository
    extends CrudRepository<Widget, Integer> {

    @Query(value = "SELECT * from widgets", nativeQuery = true)
    public List<Widget> findAllWidgets();

    @Query(value = "SELECT * from widgets where widgets.topic_id =:tid", nativeQuery = true)
    public List<Topic> findWidgetForTopic(@Param("tid") Integer topicId);

    @Query(value = "SELECT * from widgets where widgets.id =:wid", nativeQuery = true)
    public Widget findWidgetById(@Param("wid") Integer widgetId);
}
