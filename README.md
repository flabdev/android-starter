# This is a Sample Android Project

### Prerequisite
JAVA 11 or 17

Android SDK

Android Studio IDE

**Clone the project to specified folder and import it into Android Studio**

```bash
git clone https://github.com/preethiboienwar/COEtask.git
```

**Now we can run the project**

**Generate APK in Debug mode**

```bash
./gradlew assembleDebug
```

**Generate APK in Release mode**

```bash
./gradlew assembleRelease
```

**To run the lint**

```bash
./gradlew lint
```

**For formatting kotlin code we use ktlint. Below commands are used to find and format the code**

**When you run the below command the files which need formatting are displayed**

```bash
./gradlew ktlint
``` 

**Below command formats the required files**

```bash
./gradlew ktlintFormat
```

## [Integrate sonarqube into the android project](https://www.innominds.com/blog/sonarqube-integration-with-android-studio)

**We need JAVA 11 or 17 for sonarqube**

**To run sonarqube**

```bash
./gradlew sonar -Dsonar.projectKey={project-name} -Dsonar.host.url=http://localhost:9000 -Dsonar.login={token generated while integration}
```