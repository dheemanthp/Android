88

IPC is inter-process communication. It describes the mechanisms used by different types of android components 
to communicate with one another.

1) Intents are messages which components can send and receive. 
It is a universal mechanism of passing data between processes. With help of the intents one can start services or activities, invoke broadcast receivers and so on.

2) Bundles (key,value store) are entities of data that is passed through. 
Bundles are generally used for passing data between various Android activities. It depends on you what type of values you want to pass, 
but bundles can hold all types of values and pass them to the new activity.
It is similar to the serialization of an object, but much faster on android. Bundle can be read from intent via the getExtras() method.

3) Binders are the entities which allow activities and services to obtain a reference to another service. It allows not simply sending messages to services but directly invoking methods on them.
