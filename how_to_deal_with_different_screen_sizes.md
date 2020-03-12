https://developer.android.com/training/multiscreen/screensizes

Use view dimensions that allow the layout to resize
Create alternative UI layouts according to the screen configuration
Provide bitmaps that can stretch with the views


1) ***Use ConstraintLayout***

The best way to create a responsive layout for different screen sizes is to use ConstraintLayout 
as the base layout in your UI. ConstraintLayout allows you to specify the position and size for each view according to spatial relationships with other views in the layout. This way, all the views can move and stretch together as the screen size changes.

***But ConstraintLayout won't solve every layout scenario (especially for dynamically-loaded lists, for which you should use RecyclerView), but no matter what layout you use, you should always avoid hard-coding layout sizes (see the next section).***


2) ***Avoid hard-coded layout sizes***

To ensure that your layout is flexible and adapts to different screen sizes, you should use "wrap_content" and "match_parent" for the width and height of most view components, instead of hard-coded sizes.
***"match_parent" makes the view expand to as much as possible within the parent view.***
***"wrap_content" tells the view to set its size to whatever is necessary to fit the content within that view.***
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 
 ***When using ConstraintLayout, you should not use match_parent. Instead, set the dimension to 0dp to enable a special behavior called "match constraints," which is generally the same as what you expect from match_parent***
 
 3)***Use the smallest width qualifier***
 
 The "smallest width" screen size qualifier allows you to provide alternative layouts for screens that have a minimum width measured in density-independent pixels(dp or dip).
 By describing the screen size as a measure of density-independent pixels, Android allows you to create layouts that are designed for very specific screen dimensions while avoiding any concerns you might have about different pixel densities.
 4)***Use the available width qualifier***
 5)***Use the available height qualifier***
 
 6)***Add orientation qualifiers***
 
Although you may be able to support all size variations using only combinations of the "smallest width" and "available width" qualifiers, you might also want to change the user experience when the user switches between ***portrait and landscape orientations.***

For that you can add the ***port or land qualifiers*** to your resource directory names. Just be sure these come after the other size qualifiers. For example:
 
 7) ***Modularize UI components with fragments***
 
 8) ***Support Android 3.1 with legacy size qualifiers***
 
 If your app supports Android 3.1 (API level 12) or lower, you need to use the legacy size qualifiers in addition to the smallest/available width qualifiers from above.

From the example above, if you want a two pane layout on larger devices you need to use the "large" configuration qualifier to support version 3.1 and lower


9) ***Create stretchable nine-patch bitmaps***

https://developer.android.com/studio/write/draw9patch
If you use a bitmap as the background in a view that changes size, you will notice Android scales your images as the view grows or shrinks based on the size of the screen or content in the view. This often leads to visible blurring or other scaling artifacts. ***The solution is using nine-patch bitmaps, which are specially formatted PNG files that indicate which areas can and cannot be stretched.***

A nine-patch bitmap is basically a standard PNG file, but with an extra 1px border that indicates which pixels should be stretched (and with a .9.png extension instead of just .png).

10)***Test on all screen sizes***

You can use emulator or Firebase has devices that can be tested
https://firebase.google.com/docs/test-lab/

11)***Declare specific screen size support***

https://developer.android.com/guide/practices/screens-distribution
 you can set limits for how much your screen should resize or even restrict which devices can install your 
 app based on their screen configuration

 
