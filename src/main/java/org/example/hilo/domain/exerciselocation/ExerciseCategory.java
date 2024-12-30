package org.example.hilo.domain.exerciselocation;

public enum ExerciseCategory {
  GYM("헬스장"),
  YOGA("요가"),
  PILATES("필라테스"),
  BOXING("복싱"),
  CROSSFIT("크로스핏"),
  MULTI_CENTER("다목적 운동 시설"),
  OUTDOOR("야외 장소"),
  SPORTS_FIELD("필드");

  private String value;

  ExerciseCategory(String name) {
  }
}
