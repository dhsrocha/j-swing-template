package com.dhsrocha.app;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.*;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

@Slf4j
public final class App extends Application {

  interface Entry {
    static void main(final String[] args) {
      App.main(args);
    }
  }

  public static void main(final String[] args) {
    // TODO Hot-reload
    launch(args);
  }

  @Override
  public void start(final Stage stage) {
    stage.setTitle("Swing in JavaFX Sample.");
    stage.setScene(scene());
    stage.show();
  }

  // TODO Make it as an injectable component.
  static final String TESTABLE_BUTTON = "testBtn";
  private static Scene scene() {
    val btn = new JButton("Click me!");
    btn.putClientProperty("id", TESTABLE_BUTTON);

    val swing = new SwingNode();
    SwingUtilities.invokeLater(() -> swing.setContent(btn));
    return new Scene(new StackPane(swing), 250, 150);
  }
}
