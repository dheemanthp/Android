//https://developer.android.com/topic/libraries/architecture/viewmodel#lifecycle

***FUNDAMENTAL***

1) " IT IS A HELPER CLASS " 
2) Is responsible for preparing data for the UI Controller.
3) Can Survive Configuration Changes , ViewModel objects are automatically retained during configuration changes so that data they hold is immediately available to the next activity or fragment instance.
4)Responsibility to acquire and keep the list of users to a ViewModel
5)If the activity is re-created, it receives the same MyViewModel instance that was created by the first activity.
6) VIEW MODEL CAN CONTAIN LIVEDATA OBJECTS , BUT SHOULD NEVER OBSERVE LIVEDATA OBJECTS. OBESERVING LIVE DATA OBJECTS IS
RESPONSIBLITY OF UI CONTROLLER.
7)The purpose of ViewModel is to encapsulate the data for a UI controller to let the data survive configuration changes. 
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

