# java-22-log4j-slf4j
A simple Gradle app demonstrating how to use Log4j2, SLF4J and Gradle for logging.

One can execute the app by running 
```bash
./gradlew run
```

Here is an example of an output.
```bash
(base) ➜  java-22-log4j-slf4j git:(main) ✗ gw run

> Task :app:run
[09 Jan 2024 06:51:27,230] TRACE - io.itudoben.LogMeItu - This is a trace!
[09 Jan 2024 06:51:27,233] DEBUG - io.itudoben.LogMeItu - This is a debug!
[09 Jan 2024 06:51:27,233] INFO  - io.itudoben.LogMeItu - This is an info!
[09 Jan 2024 06:51:27,233] WARN  - io.itudoben.LogMeItu - This is a warn!
[09 Jan 2024 06:51:27,233] ERROR - io.itudoben.LogMeItu - This is an error!
[09 Jan 2024 06:51:27,234] INFO  - io.itudoben.log4j2.LogMe1 - This is an info!
[09 Jan 2024 06:51:27,234] WARN  - io.itudoben.log4j2.LogMe1 - This is a warn!
[09 Jan 2024 06:51:27,234] ERROR - io.itudoben.log4j2.LogMe1 - This is an error!
[09 Jan 2024 06:51:27,234] WARN  - io.itudoben.log4j2.LogMe2 - This is a warn!
[09 Jan 2024 06:51:27,234] ERROR - io.itudoben.log4j2.LogMe2 - This is an error!
[09 Jan 2024 06:51:27,254] WARN  - io.itudoben.slf4j.SlfLogMe - This is a warn!
[09 Jan 2024 06:51:27,254] ERROR - io.itudoben.slf4j.SlfLogMe - This is an error!
[09 Jan 2024 06:51:27,254] TRACE - io.itudoben.App - This is a trace!
[09 Jan 2024 06:51:27,254] DEBUG - io.itudoben.App - This is a debug!
[09 Jan 2024 06:51:27,254] INFO  - io.itudoben.App - This is an info!
[09 Jan 2024 06:51:27,254] WARN  - io.itudoben.App - This is a warn!
[09 Jan 2024 06:51:27,255] ERROR - io.itudoben.App - This is an error!

BUILD SUCCESSFUL in 7s
3 actionable tasks: 3 executed
```
