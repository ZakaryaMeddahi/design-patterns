## Adapter Design Pattern

This pattern is good when we have a class that does not expose what the client expect so we should convert it by using an intermidiate interface that could be implemented by adapter class.

The client could interact with this class in standard way, the class itself will adapte it to use methods from Non Standard class (We could use inheritance or composition to do that).
