
Separation of concerns : 
The most important principle to follow is separation of concerns. It's a common mistake to write all your code in an Activity or a Fragment. These UI-based classes should only contain logic that handles UI and operating system interactions. By keeping these classes as lean as possible, you can avoid many lifecycle-related problems.

Drive UI from a model :
Another important principle is that you should drive your UI from a model, preferably a persistent model.
Persistence is ideal for the following reasons:
Your users don't lose data if the Android OS destroys your app to free up resources.
Your app continues to work in cases when a network connection is flaky or not available.
By basing your app on model classes with the well-defined responsibility of managing the data, your app is more testable and consistent.


