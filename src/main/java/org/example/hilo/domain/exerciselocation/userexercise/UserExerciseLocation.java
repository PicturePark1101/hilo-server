package org.example.hilo.domain.exerciselocation.userexercise;

import java.time.LocalDateTime;
import org.example.hilo.domain.exerciselocation.ExerciseLocation;
import org.example.hilo.domain.user.User;

public class UserExerciseLocation {
  private User user;
  private ExerciseLocation exerciseLocation; // 등록한 사용자
  private LocalDateTime createdAt;
  private UserExerciseLocationStatus userExerciseLocationStatus;
}
