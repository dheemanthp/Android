//https://developer.android.com/topic/libraries/architecture/viewmodel#lifecycle
Youtube Video : https://www.youtube.com/watch?v=5qlIPTDE274&t=30s

***BEST PRACTICES    ***WARNINGS***
1) NEVER STORE CONTEXTS IN VIEWMODEL , this means no passing fragments , activities or views . The reason being
VIEWMODEL CAN OUTLIVE Activity , fragment , and views.
A VIEWMODEL HOLDING a REFERENCE TO ACTIVITY , FRAGMENT will cause ***memory leak when you rotate the screen.***
IF you need an application context to use , then use the "AndroidViewModel" class which is a subclass of ViewModel Class
with an application Context.

2) VIEWMODEL SHOULD BE USED ***IN ADDITION*** TO ONSAVEDINSTANCE STATE.
VIEWMODEL CAN STORE LARGE AMOUNT OF DATA where as ONSAVEDINSTANCE STATE CAN STORE SMALLEST AMOUNT OF DATA.
VIEWMODEL AND ONSAVEDINSTANCE STATE CAN SURVIVE CONFIGURATION CHANGES WHEN SCREEN IS ROTATED.
VIEWMODEL CANNOT SURVIVE PROCESS DEATH , where as ONSAVEDINSTANCE STATE BUNDLE CAN SURVIVE PROCESS DEATH.


***FUNDAMENTAL***

1) " IT IS A HELPER CLASS " 
2) Is responsible for preparing data for the UI Controller.
3) VIEW MODEL + LIVE DATA + DATA BINDING = REACTIVE UI , which means UI is updated as and when there are changes in data
4) ALL THE DATA IN YOUR VIEWMODEL SHOULD BE WRAPPED WITH LIVE DATA
5) Can Survive Configuration Changes , ViewModel objects are automatically retained during configuration changes so that data they hold is immediately available to the next activity or fragment instance.
6)Responsibility to acquire and keep the list of users to a ViewModel
7)If the activity is re-created, it receives the same MyViewModel instance that was created by the first activity.
8) VIEW MODEL CAN CONTAIN LIVEDATA OBJECTS , BUT SHOULD NEVER OBSERVE LIVEDATA OBJECTS. OBESERVING LIVE DATA OBJECTS IS
RESPONSIBLITY OF UI CONTROLLER.
9)The purpose of ViewModel is to encapsulate the data for a UI controller to let the data survive configuration changes. 
For information about how to load, persist, and manage data across configuration changes, see Saving UI States.
https://developer.android.com/topic/libraries/architecture/saving-states

***The lifecycle of a ViewModel***
https://developer.android.com/topic/libraries/architecture/viewmodel#lifecycle

If the activity is re-created, it receives the same MyViewModel instance that was created by the first activity. When the owner activity(destory) or Fragment(detach) is finished, ***the framework calls the ViewModel objects's onCleared() method so that it can clean up*** resources.

***Share data between fragments***
https://developer.android.com/topic/libraries/architecture/viewmodel#sharing
It's very common that two or more fragments in an activity need to communicate with each other. Imagine a common case of master-detail fragments, where you have a fragment in which the user selects an item from a list and another fragment that displays the contents of the selected item. This case is never trivial as both fragments need to define some interface description, and the owner activity must bind the two together. In addition, both fragments must handle the scenario where the other fragment is not yet created or visible.

This common pain point can be addressed by using ViewModel objects. These fragments can share a ViewModel using their activity scope to handle this communication, as illustrated by the following sample code:


***Replacing Loaders with ViewModel***
https://developer.android.com/topic/libraries/architecture/viewmodel#loaders
Loader classes like CursorLoader are frequently used to keep the data in an app's UI in sync with a database. 
ViewModel works with Room and LiveData to replace the loader. 

