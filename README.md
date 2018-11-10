# Eta Init

This is a starter Eta project using Gradle.
It was modified by [g-pechorin](https://github.com/g-pechorin) to include a `.java` JUnit test.

- main `$ ./gradlew run -PetaSendMetrics=false`
- tests `$ ./gradlew check -PetaSendMetrics=false`

IntelliJ doesn't like it (sorry) but otherwise, [g-pechorin](https://github.com/g-pechorin) has tested it (successfully) on;

- works
    - Windows 10 / JDK10 amd64
    - macOS / JDK10
- nope
    - Raspbian GNU/Linux 8 (jessie / arm)

See [here](http://eta-lang.org/docs/user-guides/eta-user-guide/installation/gradle#requirements) for the full instructions.
