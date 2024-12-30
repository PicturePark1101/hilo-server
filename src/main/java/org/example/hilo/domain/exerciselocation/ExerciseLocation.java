package org.example.hilo.domain.exerciselocation;

import java.util.List;
import org.example.hilo.domain.chat.ChatRoom;
import org.example.hilo.domain.region.Region;

public class ExerciseLocation {
  private long exerciseLocationId;
  private String name;
  private ExerciseCategory exerciseCategory;
  private Point point;
  private Region region;
  private int scrapCount;
  private int myRegionPeopleCount;
  private BusinessHour businessHours;
  private List<ExerciseLocationImage> exerciseLocationImages;
  private ChatRoom chatRoom;
}
