Schedulers in Project Reactor are a crucial part of the reactive programming paradigm. 
    They provide a way to manage the execution context and threads that are used for executing tasks within reactive pipelines. 
    Schedulers help control where and when tasks are executed, allowing developers to manage concurrency, parallelism, and responsiveness in reactive applications.

Project Reactor provides various built-in schedulers, and you can also create custom schedulers to fit your application's requirements.

Here's an overview of some common built-in schedulers in Project Reactor:

1. **Schedulers.immediate()**: Executes tasks on the current thread synchronously, without any additional threading.

2. **Schedulers.single()**: Uses a single worker thread to execute tasks sequentially. Useful for scenarios where tasks must be executed in a specific order.

3. **Schedulers.parallel()**: Provides a pool of worker threads, suitable for parallel execution of tasks. 
    The number of threads is typically equal to the number of CPU cores.

4. **Schedulers.elastic()**: Uses an elastic pool of worker threads, which can expand or shrink based on the load. This is suitable for I/O-bound tasks.

5. **Schedulers.boundedElastic()**: Similar to `elastic()`, but with a bounded thread pool, which prevents excessive thread creation.

6. **Schedulers.fromExecutorService(ExecutorService)**: Allows you to provide a custom `ExecutorService` for task execution.

Now let's look at code samples demonstrating the usage of schedulers:

```java
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class SchedulersExample {

    public static void main(String[] args) throws InterruptedException {
        Flux<Integer> flux = Flux.range(1, 10);

        flux
            .map(i -> i * 2)
            .subscribeOn(Schedulers.parallel()) // Use parallel scheduler for the source
            .publishOn(Schedulers.single())   // Use single scheduler for the subsequent operations
            .doOnNext(i -> System.out.println("Processed: " + i))
            .subscribe();

        Thread.sleep(100); // Give some time for the tasks to complete before the main thread exits
    }
}
```

In this example:

- The `flux` emits integers from 1 to 10.
- The `map` operation is performed on the parallel scheduler, allowing for parallel processing of items.
- The `publishOn` operation switches to the single scheduler, which is used for the subsequent operations.
- The `doOnNext` operation prints the processed value on the single scheduler.
- The `subscribe` method initiates the subscription.

By using different schedulers, you can control the concurrency and parallelism of the operations. In this case, parallel processing is used for mapping, and then the processing is switched to a single thread for printing. This separation can improve performance and resource utilization.

Schedulers are essential for managing the execution context of reactive operations and ensure that tasks are executed efficiently and non-blocking. By selecting the appropriate scheduler, you can optimize your reactive application for various workloads and scenarios.




  ------------------------------------------------------------------------------------------------------------------------------------------------------

  The `publishOn` and `doOnNext` are two methods provided by Project Reactor's `Flux` and `Mono` types. These methods are used to control the execution context and apply side effects to the reactive pipeline. Let's take a closer look at each of these methods:

1. **`publishOn` Method**:
   - **Usage**: The `publishOn` method is used to switch the execution context (scheduler) for the downstream operations that follow it in the reactive pipeline. This is useful when you want to perform certain operations on a specific scheduler while keeping the upstream operations on a different scheduler.
   - **Example**:

```java
Flux<Integer> flux = Flux.range(1, 10);

flux
    .map(i -> i * 2)             // Operates on the original scheduler (e.g., parallel)
    .publishOn(Schedulers.single()) // Switches execution to the single scheduler
    .doOnNext(i -> System.out.println("Processed on single scheduler: " + i))
    .subscribe();
```

In this example, `map` operates on the original scheduler (which could be parallel), but then `publishOn` switches the subsequent `doOnNext` operation to the `single` scheduler. This separation of execution context can be particularly useful when you want to perform some operations on a specific thread pool while keeping other operations unaffected.

2. **`doOnNext` Method**:
   - **Usage**: The `doOnNext` method is used to apply a side effect for each item emitted by the reactive pipeline. It doesn't modify the data stream but allows you to perform actions based on the emitted items.
   - **Example**:

```java
Flux<Integer> flux = Flux.range(1, 5);

flux
    .doOnNext(i -> System.out.println("Before processing: " + i))
    .map(i -> i * 2)
    .doOnNext(i -> System.out.println("After processing: " + i))
    .subscribe();
```

In this example, the `doOnNext` method is used to print a message before and after the `map` operation. It's important to note that `doOnNext` does not modify the data stream; it's purely for side effects. You can use it to log, perform monitoring, or interact with external systems while processing the data stream.

Both of these methods are powerful tools for controlling the execution context and applying side effects in reactive pipelines. They help maintain the principles of reactive programming by providing a non-blocking and declarative approach to processing data streams.

  




  
