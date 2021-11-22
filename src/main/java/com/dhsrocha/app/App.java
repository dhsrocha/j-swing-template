package com.dhsrocha.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class App {

  // TODO Inversion of control.

  public static void main(final String[] args) {
    log.info("App running. [ {} ]", String.join(" ", args));
  }
}
