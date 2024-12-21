package org.example.hilo.domain.user;

import java.util.List;
import org.example.hilo.domain.location.userexercise.UserExerciseLocation;
import org.example.hilo.domain.region.Region;

public class User {
  private long userId;
  private String nickname;
  private Region region;
  private List<UserExerciseLocation> userExerciseLocations;
}
