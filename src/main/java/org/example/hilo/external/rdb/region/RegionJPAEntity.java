package org.example.hilo.external.rdb.region;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RegionJPAEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "region_id")
  private Long id;

  @Column(nullable = false)
  private String province;

  @Column(nullable = false)
  private String city;

  @Column(nullable = false)
  private String dong;
}
