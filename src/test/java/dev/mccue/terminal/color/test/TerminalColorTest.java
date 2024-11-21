package dev.mccue.terminal.color.test;

import dev.mccue.color.Color;
import dev.mccue.color.terminal.ANSI256Color;
import dev.mccue.color.terminal.ANSIColor;
import dev.mccue.color.terminal.TrueColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TerminalColorTest {
    @Test
    public void testConversionToAnsi() {
        for (var value : ANSIColor.values()) {
            var ansi256 = ANSI256Color.of(value);
            assertEquals(value.sRGB(), ansi256.sRGB());
        }
    }

    @Test
    public void testTrueColor() {
        for (var c : Color.happy(50)) {
            assertEquals(
                    TrueColor.of(c).RGB255(),
                    c.RGB255()
            );
        }

    }
}
