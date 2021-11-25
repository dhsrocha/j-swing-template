package com.dhsrocha.app.ui.form;

import java.awt.event.ActionListener;
import javax.swing.*;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class ActionButton extends JButton {

  private ActionButton(final String label) {
    super(label);
  }

  public static ActionButton create(final @NonNull String label,
                                    final @NonNull ActionListener event) {
    final var btn = new ActionButton(label);
    btn.addActionListener(event);
    return btn;
  }
}
