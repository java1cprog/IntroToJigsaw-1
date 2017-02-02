This example illustrates how you can pass on the modules that you use to the downstream users of your module. 
First way to achieve this is that the downstream module _greetings.seconduser_ explicitly declares that it requires
_com.greetings_ module.

This would mean that the downstream module will need to maintain a long list of required modules in case it wants to use 
something that the upstream module as exposed.