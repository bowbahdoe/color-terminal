# color-terminal

Colors for terminal output.

```xml 
<dependency>
    <groupId>dev.mccue</groupId>
    <artifactId>color-terminal</artifactId>
    <version>2024.11.21</version>
</dependency>
```

## Usage

```java
import dev.mccue.color.Color;
import dev.mccue.color.terminal.ANSI256Color;
import dev.mccue.color.terminal.ANSIColor;
import dev.mccue.color.terminal.TerminalStyle;
import dev.mccue.color.terminal.TrueColor;

void main() {
    var trueColor = TrueColor.of(255, 0, 125);
    var ansi256Color = ANSI256Color.of(40);
    var ansiColor = ANSIColor.RED;

    String s = TerminalStyle.builder()
            .bold()
            .backgroundColor(ANSIColor.BLUE)
            .foregroundColor(ANSIColor.BLACK)
            .apply("Hello, world");

    System.out.println(s);
}
```