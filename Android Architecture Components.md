Followed : To build the APP
https://www.youtube.com/watch?v=BofWWZE1wts
https://developer.android.com/jetpack/docs/guide

    Activity/Fragment [Display user Data , and captures Users Events and OS events ]
    ||
    ViewModel LiveData [Holds All of the Data Needed for the UI ]
    ||
    Repository [ This is a Best practice with Clean API , Hides Complexity of Managing Different Data sources ]
    ||
    Room [Consists bunch of different classes (Entity, DAO,database class) Manages Local Data using SQLite data source using objects]
    



Guide to app architecture : 
1) Building robust, production-quality apps
2) apps need to adapt to different kinds of user-driven workflows and tasks.
3) app-hopping behavior is common on mobile devices, so your app must handle these flows correctly.
4)Sepearation of responsiblity for each of the classes.
5)Strict Rule of Classes only have references to classes directly below them, makes it more testable , and easy to make layered changes without modifying other layers.
6)Data changes are sent "back up to views" using LiveData and Observation.(Basically using observer pattern).
In the past we would have callbacks but not any more.



Room Library : Easier SQLite persistence , robust SQL object mapping library.
LifeCycle Library(LiveData): Easier LifeCycle Management , Hold all of the data needed for UI) 
Paging Library : Easier LAZY Loading of Large Data sets

A typical Android app contains multiple app components
including activities
fragments
services
content providers
and broadcast receivers.



=====================================================================================
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
