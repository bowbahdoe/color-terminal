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
import dev.mccue.color.terminal.ANSI256Color;
import dev.mccue.color.terminal.ANSIColor;
import dev.mccue.color.terminal.TrueColor;

void main() {
    var trueColor = TrueColor.of(255, 0, 125);
    var ansi256Color = ANSI256Color.of(40);
    var ansiColor = ANSIColor.RED;
}
```