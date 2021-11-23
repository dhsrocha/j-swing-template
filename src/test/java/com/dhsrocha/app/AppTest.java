package com.dhsrocha.app;

import javafx.application.Application;
import javafx.stage.Stage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

/**
 * Acceptance tests suite.
 */
@SuppressWarnings("unused")
@Disabled
@ExtendWith(ApplicationExtension.class)
final class AppTest {

  private Application subject;

  @Start
  void start(final Stage stage) throws Exception {
    subject = new App();
    stage.setAlwaysOnTop(Boolean.FALSE);
    subject.start(stage);
    // Arrange
  }

  @Test
  @DisplayName(""
      + "GIVEN a main button "
      + "WHEN clicking on it "
      + "THEN pops out an alert.")
  void givenAMainButton_whenClickingOnIt_thenPopsOutAnAlert(final FxRobot robot) {
    // Arrange
    robot.lookup("#" + App.TESTABLE_BUTTON); // TODO
    // Act
    // Assert
  }
}
