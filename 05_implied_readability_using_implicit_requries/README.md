This example illustrates how you can pass on the modules that you use to the downstream users of your module. 
The previous example in directory _04_implied_readability_using_explicit_requries_ the downstream module explicitly
declares that it requires _com.greetings_ module.

A better way to do this is that the intermediate module can declare that a particular upstream module is transitive and 
make it available to the downstream modules.

Here, the module _greetings.user_ declares _com.greetings_ as transitive as follows:

`module greetings.user {
     exports com.greetings.user;
     requires transitive com.greetings;
 }`