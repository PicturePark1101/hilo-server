package org.example.hilo.external.rdb.common;

import jakarta.persistence.Embeddable;

@Embeddable
public class Point {

  private double latitude;

  private double longitude;
}
