## Singleton Design Pattern

One of the simplest design patterns, and its idea is to create only one instance from a class and return the same one if the user tries to create it again, this can be achieved by creating a static method to get an instance and make the constructor private to force the user to use the method for creating an instance.

The is useful when we need to use the class only one time like in the case of Database Connection.
