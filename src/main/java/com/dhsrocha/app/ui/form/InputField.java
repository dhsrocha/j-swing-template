package com.dhsrocha.app.ui.form;

import java.awt.*;
import javax.swing.*;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class InputField extends JPanel {

  JTextField textField;

  public static InputField create(final @NonNull String label) {
    final var input = new JTextField(10);
    final var panel = new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    final var holder = new InputField(input);
    holder.add(new JLabel(label));
    holder.add(input);
    return holder;
  }
}
