# java-sero-client
Java client utils for SERO

* Usage
```
import org.sero.client;

SeroClient.pkrValid("hPfwD5 ...... DQB2r9");
SeroClient.pkValid("4bbE4n ...... JAe1jwq");

```

* Run the test

For run the `java-sero-client` must specify env variable `libpath` by `-Dlibpath=so-file-fullpath`.

the `so-file-fullpath` must absolute path.

```sh
java -Dlibpath=your-so-file-fullpath TestSeroClient.class
```


* `.so` file in the `java-sero-client/lib` PATH：

  * MacOS: `lib/darwin/libczero.dylib`
  * linux4: `lib/linux_4/libczero.so`
  * linux3: `lib/linux_3/libczero.so`
  * windows: `lib/windows/libczero.dll`
