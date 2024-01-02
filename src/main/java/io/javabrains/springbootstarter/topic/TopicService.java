package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

  private List<Topic> topics = new ArrayList<>(List.of(
      new Topic("spring", "Spring Framework", "Spring framework description"),
      new Topic("javascript", "Javascript Basics", "Javascript description"),
      new Topic("python", "Python Basics", "Python description")
  ));

  public List<Topic> getAllTopics() {
    return topics;
  }

  public Topic getTopic(String id) {
    return topics.stream()
        .filter(t -> t.getId().equals(id))
        .findFirst()
        .get();
  }

  public void addTopic(Topic topic){
    topics.add(topic);
  }

}
