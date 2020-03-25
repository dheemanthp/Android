# Declarative UI's Inside XML

Binding the gap between code and XML

Example:
If you put tag like "layout" in XML file, you will get a ***Binding Class ProfileBinding***

```
<!-- profile.xml -->
<layout>
<LinearLayout>
If you add variables to this layout , then setters and getters are generated in the Binding Class
  <data>
    <variable>
      name = "user"
      type = ".user"
    </variable>
  </data>
</LinearLayout>
</layout>'
```
