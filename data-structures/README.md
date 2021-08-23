# Collections

Implement following data structures together with unit tests proving their invariants. You can add more methods to interface if needed (size(), isEmpty() etc.).
You can also define common parent or interface.

## Implement stack from scratch
```java
    public interface Stack {
        void push(T item);
        T pop();
        T peek();
    }
```

##  Implement queue from scratch
```java
    public interface Queue {
        void enqueue(T item);
        T dequeue();
    }
```

##  Implement  future queue

```java
    /**
    * Queue with fixed size.
    */
    public interface FutureQueue {
        /**
        * When queue is full, do not put item to queue, return CompletionStage. When some item is dequeued, so queue isn't full
        * anymore, complete the stage and add the item.
        */
        CompletionStage<Void> enqueue(T item);
        /**
        * When the queue is empty, return CompletionStage, which completes when item is enqueued.
        */
        CompletionStage<T> dequeue();
    }
```
