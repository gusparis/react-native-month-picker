package com.gusparis.monthpicker.adapter;

import java.util.Locale;

public interface RNMonthPickerProps {

  RNDate value();

  RNDate minimumValue();

  RNDate maximumValue();

  String okButton();

  String cancelButton();

  String neutralButton();

  Locale locale();

  String mode();

  void onChange(int year, int month, int flag);

  void onChange();
}
