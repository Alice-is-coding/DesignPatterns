# Design Patterns and Best Practices in Java - Packt - 2018

The SingletonSynchronized implementation is thread-safe but it introduces an unnecessary delay :
the block that checks whether the instance has already been created is synchronized.
This means that the block can be executed by only 1 thread at a time, and we should note that locking makes sense only when the instance has not been created yet.
When the singleton instance has already been created, each thread should be allowed to get the current instance in an unsynchronized manner.

So we added an additional condition before the synchronized block so that the thread-safe locking will be moved only when the singleton has not been instantiated yet.