# java-sero-client
Java client utils for SERO


* Run the test

```sh
-Dlibpath=so-file-fullpath

java -Dlibpath=your-so-file-fullpath TestSeroClient.class
```
the `so-file-fullpath` must absolute path.

* `.so` file in the `java-sero-client/lib` PATH：

  * MacOS: `lib/darwin/libczero.dylib`
  * linux4: `lib/linux_4/libczero.so`
  * linux3: `lib/linux_3/libczero.so`
  * windows: `lib/windows/libczero.dll`
