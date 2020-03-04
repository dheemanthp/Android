
Separation of concerns : 
The most important principle to follow is separation of concerns. It's a common mistake to write all your code in an Activity or a Fragment. These UI-based classes should only contain logic that handles UI and operating system interactions. By keeping these classes as lean as possible, you can avoid many lifecycle-related problems.

Drive UI from a model :
Another important principle is that you should drive your UI from a model, preferably a persistent model.
Persistence is ideal for the following reasons:
Your users don't lose data if the Android OS destroys your app to free up resources.
Your app continues to work in cases when a network connection is flaky or not available.
By basing your app on model classes with the well-defined responsibility of managing the data, your app is more testable and consistent.

Assigning excessive responsibility to the UI controllers in this way also makes testing a lot harder.
It's easier and more efficient to separate out view data ownership from UI controller logic.


Implement a ViewModel
Architecture Components provides ViewModel helper class for the UI controller that is responsible for preparing data for the UI. ViewModel objects are automatically retained during configuration changes so that data they hold is immediately available to the next activity or fragment instance. For example, if you need to display a list of users in your app, make sure to assign responsibility to acquire and keep the list of users to a ViewModel, instead of an activity or fragment, as illustrated by the following sample code:
