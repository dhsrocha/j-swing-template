package com.dhsrocha.app;

import com.dhsrocha.app.ui.aircraft.AircraftLayout;
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
    stage.setTitle("AirTop soft test");
    stage.setScene(scene());
    stage.show();
  }

  private static Scene scene() {
    val layout = AircraftLayout.create();
    val swing = new SwingNode();
    SwingUtilities.invokeLater(() -> swing.setContent(layout));
    return new Scene(new StackPane(swing),
                     layout.getWidth(),
                     layout.getHeight());
  }
}
