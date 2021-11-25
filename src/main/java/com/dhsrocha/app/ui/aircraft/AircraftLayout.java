package com.dhsrocha.app.ui.aircraft;

import com.dhsrocha.app.ui.form.ActionButton;
import com.dhsrocha.app.ui.form.InputField;
import java.awt.*;
import javax.swing.*;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.val;

@Value
@EqualsAndHashCode(callSuper = true)
public class AircraftLayout extends JPanel {

  JPanel left;
  JPanel right;

  public static AircraftLayout create() {
    val leftPanel = new JPanel();
    leftPanel.setLayout(new GridLayout(3 ,1));
    val rightPanel = new JPanel();
    rightPanel.setLayout(new BoxLayout(rightPanel ,BoxLayout.Y_AXIS));
    val main = new AircraftLayout(leftPanel, rightPanel);
    main.setLayout(new GridLayout(1 ,2));
    main.add(leftPanel);
    main.add(rightPanel);
    // Left
    val length = InputField.create("Length");
    val width = InputField.create("Weight");
    val okButton = ActionButton.create("OK", e -> {

    });
    leftPanel.add(length);
    leftPanel.add(width);
    leftPanel.add(okButton);
    // Right
    val graphs = new AircraftGraphics();
    rightPanel.add(graphs);
    return main;
  }
}
