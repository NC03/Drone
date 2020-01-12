# Dronelib

## Documetation

[javadoc](nc03.github.io/drone)

## Example

```java
import com.nc03.dronelib.DroneConnection;

public class Example {
    public static void main(String[] args) {
        if (DroneControl.init()) {
            for (int i = 0; i < 4; i++) {
                DroneControl.forward(10);
                DroneControl.right(90);
            }
        }
    }
}
```
