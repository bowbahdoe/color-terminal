# color-terminal

Colors for terminal output.

```xml 
<dependency>
    <groupId>dev.mccue</groupId>
    <artifactId>color-terminal</artifactId>
    <version>2024.11.20</version>
</dependency>
```

## Usage

```java
import dev.mccue.color.Color;
import dev.mccue.color.terminal.*;

void main() {
    TerminalColor trueColor = TrueColor.of(255, 0, 125);
    TerminalColor ansi256Color = ANSI256Color.of(40);
    TerminalColor ansiColor = ANSIColor.RED;

    String s = TerminalStyle.builder()
            .bold()
            .backgroundColor(ANSIColor.BLUE)
            .foregroundColor(ANSIColor.BLACK)
            .apply("Hello, world");

    System.out.println(s);
}
```