package com.dhsrocha.app.feature.aircraft;

import lombok.Value;

@Value(staticConstructor = "of")
public class Aircraft {

  double height;
  double width;
}
