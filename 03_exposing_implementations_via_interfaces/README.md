This example demonstrates that when a package is not exported by the _com.greetings_ module, the MyHelper class is not 
accessible by the _greetings.user_ module.

If we add _"exports com.greetings.internal;"_ to the _com.greetings/module-info.java_ and run the example again, 
the _greetings.user_ module is able to access the _MyHelper_ class.

Now remove the export statement from the first module and build only the first module jar, when you run the program, then
the below IllegalAccessError is thrown:

`Exception in thread "main" java.lang.IllegalAccessError: class com.greetings.user.User (in module greetings.user) cannot access class com.greetings.internal.MyHelper (in module com.greetings) because module com.greetings does not export com.greetings.internal to module greetings.user`
