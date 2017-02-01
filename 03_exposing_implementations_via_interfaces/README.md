This example demonstrates that an implementation can be exposed to the users of a module by hiding it behind an interface. The package containing the interface is exported and available to the downstream modules whereas the implementation is in an non-exported package.

This way he can discard the implementation and provide a new one in future without having any impact on the downstream modules.
