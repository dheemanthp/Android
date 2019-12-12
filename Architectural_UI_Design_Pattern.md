```
**Architectural UI Design Pattern**
Learn all the semantics , rule , vocabulary

The goal is not to have a pattern , but gol is to have a Flexible , testable , maintainable , 
extendible , reusable architecture. The pattern is only a tool.
We can create a corelation to acheive the goal.


You can have variations of each of the Models
==============================================================================
1]MVC : Model(data) view(data) Controller : the Controller and view are tightly coupled 
==============================================================================
here controller references the view
here controller references the model
By creating an abstraction we can make it MVP

Break the view Controller into Tiny MVC's.
==============================================================================
2]MVVM: Model(can have behaviour and data) View(can have behaviour and data)  &  View-Model or Binder , 
hence controller is replaced with (view-model).
Before 2014 , there was no MVVM in the market.
==============================================================================
MVVM was created by Microsoft , to remove all the boiler plate code of Controller.
here view references (View-Model)
or there is a concept of binder , hence MVVM is also called Model View Binder.
XAML - is a Binder

(View Model) should be platform agnostic.
Example : A Date object part of a model , is rendered as a presentable string in the View.
All the formatting logic stays in the (View Model)

==============================================================================
3]MVP : Model(data) View(data) Presenter , this is more reusable as it has more abstraction.
==============================================================================
Presenter is again the mediator here.
Presenter should not refererence the UI view object directly but should reference the abstraction.
If you compare it to MVC , then Basically it is an abstraction b/w the Model and Controller.
UI implements the presenter.
You can acheieve the same level of Abstraction with other architecture.
================================================================================================================
Least Reusable rankings:
MVC -
MVVM -
MVP -
================================================================================================================
Tests: Follow Pyramid
Maximum unit Tests
then Integrated Tests , Happy Path
then UI tests

```






