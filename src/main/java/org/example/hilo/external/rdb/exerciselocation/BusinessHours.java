package org.example.hilo.external.rdb.exerciselocation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.DayOfWeek;
import java.time.LocalTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BusinessHours {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "business_hours_id")
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "exercise_location_id")
  private ExerciseLocationJPAEntity exerciseLocation;

  @Enumerated(EnumType.STRING)
  private DayOfWeek dayOfWeek;

  private LocalTime openingTime;

  private LocalTime closingTime;

  private String detail;
}
