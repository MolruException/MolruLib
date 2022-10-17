package com.molruexception.molrulib.format;

import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;

public class Formatter {

    private static final DecimalFormat FORMATTER = new DecimalFormat("###,###.###");

    @NotNull
    public static synchronized String format(double number) {
        return FORMATTER.format(number);
    }

    @NotNull
    public static String format(double number, @NotNull String format) {
        return new DecimalFormat(format).format(number);
    }

}
