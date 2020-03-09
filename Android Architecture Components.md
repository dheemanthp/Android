Followed : To build the APP
https://www.youtube.com/watch?v=BofWWZE1wts
https://developer.android.com/jetpack/docs/guide
CODE LAB: https://codelabs.developers.google.com/codelabs/android-room-with-a-view/#0


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



Room Library : Easier SQLite persistence 
1)robust SQL object mapping library.
2)Maps database Rows to objects
3)No content values or cursors
4)Compile Time validation of SQL queries , throws error
5)Support for Observation , Live Data and RxJava
6)Has Annotations which generates API to access the Database like 
@primaryKey(autogenerate  = true) 
@Entity - defines schema of a database table 
@Dao - Data base Access object for read/write operations
@Database - Access to a database , must be an abstract class extending Room Database , also singleton as you only
need a single instance of a database.
7) Can pass in a model or return a model , as long as their fields match fields in the data base
8) Room has created an ExecutorService with a fixed thread pool that you will use to run database operations asynchronously on a background thread.

[ BEST PRACTICE & NOT PART OF ANY LIBRARY] Repository class:handles Data Operations
1)Provides clean API for rest of the app , for app data 
2) In a complicated scenario , it can act as a mediator between different Data sources , for example sources
can be Database , another source can be network.
3)It is good to make this also a singleton, and then use dependecy injection to get it inside of the viewmodel.
4)Using dependency injection would mean it is easy to mock the repository , and hence easy to test viewModel[ KEY POINT].

ViewModel: ****they survive configuration change but dont survice activity being finished(back button)/App being killed***
**they are not a permanent thing that stays for ever
** they are not a replacement for persistence or OnSavedInstanceState
OnSavedInstanceState can survive total App destruction , but viewModel cannot survive total App destruction**
Read This : https://medium.com/androiddevelopers/viewmodels-persistence-onsaveinstancestate-restoring-ui-state-and-loaders-fc7cc4a6c090

1)these are objects that provide data for UI components and survive config changes.
2) they survive configuration change
3) Can replace AsyncTaskLoaders
4)Strict No Bloated Activity Class , but rather focus on seperation of responsibility
so activity/fragment should focus on displaying data
where as ViewModel should focus on Holding UI Data
For example : user rotates the phone , the configuration changes , 
and hence activity instance is destroyed and recreated.
Android framework is smart it will try to save some UI data for us using onSavedInstanceState in a Bundle.
Now by giving responsibility to viewModel , activity need not worry about saving Data.
Recreated Activity has to just establish connection with ViewModel and will get all the Data the activity needs.


Activity/Fragment : ****they do not survive configuration change***

LifeCycle Library class called LiveData: 
1)It is lifecycle aware of the actvitity/fragment class
2)it only notifies observers with they are in STARTED/RESUMED state.
3)Easier LifeCycle Management , Hold all of the data needed for UI) 
4)Helps to keep the UI updated and in sync with the database
5)Adding the LiveData Class in Dao class , would mean , that it will automatically send the updates if things changes.
6)LifeCycleObserver - Interface for observing a lifecycle owner.
Enable listeners/services to deal with their own life cycles.
7)If activity is destroyed 
8) Reactive UI , Life Cycle aware , and cleans itself of observers, allows database to communicate with UI without knowing
about it.


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
