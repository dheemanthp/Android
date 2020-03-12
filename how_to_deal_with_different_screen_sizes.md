
Use view dimensions that allow the layout to resize
Create alternative UI layouts according to the screen configuration
Provide bitmaps that can stretch with the views


***Use ConstraintLayout***
The best way to create a responsive layout for different screen sizes is to use ConstraintLayout 
as the base layout in your UI. ConstraintLayout allows you to specify the position and size for each view according to spatial relationships with other views in the layout. This way, all the views can move and stretch together as the screen size changes.

***But ConstraintLayout won't solve every layout scenario (especially for dynamically-loaded lists, for which you should use RecyclerView), but no matter what layout you use, you should always avoid hard-coding layout sizes (see the next section).***


Avoid hard-coded layout sizes
To ensure that your layout is flexible and adapts to different screen sizes, you should use "wrap_content" and "match_parent" for the width and height of most view components, instead of hard-coded sizes.
***"wrap_content" tells the view to set its size to whatever is necessary to fit the content within that view.***
***"match_parent" makes the view expand to as much as possible within the parent view.***
