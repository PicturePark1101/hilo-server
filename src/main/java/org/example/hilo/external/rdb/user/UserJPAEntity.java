package org.example.hilo.external.rdb.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.hilo.external.rdb.common.BaseTimeEntity;
import org.example.hilo.external.rdb.region.RegionJPAEntity;

@Entity
@Getter
@Builder(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "users")
public class UserJPAEntity extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Long id;

  @Enumerated(EnumType.STRING)
  private UserStatus status;

  @Enumerated(EnumType.STRING)
  private UserRole role;

  private String nickname;

  private String profileUrl;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "region_id")
  private RegionJPAEntity region;
}
