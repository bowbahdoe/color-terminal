package dev.mccue.color.terminal;

import dev.mccue.color.Color;

/// Represents a color suitable for display
/// on a terminal.
///
/// ANSI (including ANSI256) and 24-bit "true colors" fall under this category.
public sealed interface TerminalColor
        extends Color
        permits ANSIColor, ANSI256Color, TrueColor {
    default ANSIColor ansi() {
        return switch (this) {
            case ANSIColor c -> c;
            case ANSI256Color c -> c.closestANSI();
            case TrueColor c -> c.closestANSI();
        };
    }

    default ANSI256Color ansi256() {
        return switch (this) {
            case ANSIColor c -> ANSI256Color.of(c);
            case ANSI256Color c -> c;
            case TrueColor c -> c.closestANSI256();
        };
    }

    default TrueColor trueColor() {
        return switch (this) {
            case ANSIColor c -> TrueColor.of(c);
            case ANSI256Color c -> TrueColor.of(c);
            case TrueColor c -> c;
        };
    }
}
