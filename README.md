# 🧠 Daily Mood Tracker – Java RMI (Quick Commands for Windows)

```bash
:: 🛠️ Compile all Java files
javac -cp ".;mysql-connector-j-9.3.0.jar" *.java
:: ✅ After compiling, you can close this terminal with 'exit' or by closing the window.

:: 🔁 Start RMI registry (in a new terminal)
start rmiregistry
:: ⚠️ Keep this terminal open

:: 🚀 Start the server (in another terminal)
java -cp ".;mysql-connector-j-9.3.0.jar" MoodServer

:: 👤 Run the client (in another terminal)
java -cp ".;mysql-connector-j-9.3.0.jar" MoodClient
