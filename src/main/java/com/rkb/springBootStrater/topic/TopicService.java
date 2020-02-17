package com.rkb.springBootStrater.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(1, "spring framework", "spring framework description"),
			new Topic(2, "java", "java framework description"),
			new Topic(3, "javascript", "javascript framework description"),
			new Topic(4, "angular", "angular framework description")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopic(int id) {
		return topics.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
