package org.example.hilo.external.rdb.chat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.hilo.external.rdb.common.BaseCreatedTimeEntity;
import org.example.hilo.external.rdb.exerciselocation.ExerciseLocationJPAEntity;
import org.example.hilo.external.rdb.user.UserJPAEntity;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatJPAEntity extends BaseCreatedTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "chat_id")
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  private UserJPAEntity user;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "exercise_location_id")
  private ExerciseLocationJPAEntity exerciseLocation;

  @Column(nullable = false)
  private String message;

  @Column(nullable = false)
  private boolean isRegistered;
}
