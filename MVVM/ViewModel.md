//https://developer.android.com/topic/libraries/architecture/viewmodel#lifecycle

1) " IT IS A HELPER CLASS " 
2) Is responsible for preparing data for the UI Controller.
3) Can Survive Configuration Changes , ViewModel objects are automatically retained during configuration changes so that data they hold is immediately available to the next activity or fragment instance.
4)Responsibility to acquire and keep the list of users to a ViewModel
5)If the activity is re-created, it receives the same MyViewModel instance that was created by the first activity.
6) VIEW MODEL CAN CONTAIN LIVEDATA OBJECTS , BUT SHOULD NEVER OBSERVE LIVEDATA OBJECTS. OBESERVING LIVE DATA OBJECTS IS
RESPONSIBLITY OF UI CONTROLLER.

/// The lifecycle of a ViewModel ///
