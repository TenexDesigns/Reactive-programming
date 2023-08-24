
Reactive programimg - Is about the concepts not implememtion. 
  These concepts include 
                        - Event driven
                        - Data streams    
                        - Asynchronous  
                        - Non-blocking  
                        - Backpressure  
                        - Functional/Declaritive programing
                          



  Events
  When we have exvents we have observalves that can React in a Cold or a Hot way

  Observables can be cold or hot
         - Cold - Lazy ones. They do not do anything until someone statrs observing them.They will only start running when they are consumed.E.g downloadin file,File will not be downloaded untill someone subscribes to tht event and then the dowload starts
         - Hot  - Hard workers . They are active even before the subscription happens e.g A sensor that is always trnsmitting data. Doenst matter if there is  subscriber or not, it is always transmitting data but you will only get the data the moment you subscribe, meaning all the data befor subscribing will be lost,but htere are ways to cache what is happening before the subscription


                          
 Reactive Streams
Initiative: Reactive Streams

  Its is  standard for asynchrouns stream processing with non-blicking pressure (Basicaly the concepts for reactive programing)
          - Process a potentially unbounded number of elements
          - In sequence
          - Asynchrounsly passing elememt between components
          - With mandatory non-blocking backpressure

  quiz-> Reactive streams vs Java streams





  
  Reactive Streams API Components

  The API consistes of the follwing components that are required to be provided by Reactive Strem 
  impleemmtions :
                  - Publisher
                  - Subscriber  
                  - Subscription
                  - procesoor





                    
Project Reactor
Implememtion: Project Reactor
  There other impleemmtion librlies we can use for reactive programing implelelmtion e.g rxjs but we choose project reactor because it is used in springwebflux

  Reactor - Is fully  non-blocking and provides effcient demand management process a potentially unbounded number of elememts
  Reactor offers two reactive an composable APIs Flux[N] and Mono[01][01]

  It is well suited for a microservice architeure,Reator offers backpressure-ready newtwork engines for http
Reactor provices a wide range of perators. These operators allow us to select , filete ,transform and combine streams

                    





Certainly! It looks like youre seeking an explanation of various concepts related to reactive programming and the specific concepts within Project Reactor. Lets break down the concepts you've mentioned:

**Reactive Streams**:
Reactive Streams is an initiative that provides a standard for asynchronous stream processing with non-blocking backpressure. This initiative aims to define a common API for reactive programming across different libraries and platforms. Reactive Streams address the challenge of dealing with asynchronous data streams by specifying how data can be efficiently processed in a reactive, non-blocking manner while managing backpressure to prevent overwhelming consumers.

**Asynchronous**:
In the context of reactive programming, asynchronous operations involve executing tasks concurrently without blocking the main thread. This allows the program to continue processing other tasks while waiting for a potentially time-consuming operation to complete.

**Non-blocking**:
Non-blocking operations don't halt the program's execution while waiting for a task to complete. They allow the program to continue executing other tasks, resulting in better resource utilization and responsiveness.

**Backpressure**:
Backpressure is a mechanism that prevents data producers from overwhelming data consumers with more data than they can handle. It's a key aspect of reactive programming and ensures that data flows between components are balanced, preventing memory and resource issues in scenarios where producers emit data faster than consumers can process.

**Publisher <- subscribe**:
This notation represents the relationship between a Publisher (source of data) and its Subscribers (consumers). Publishers emit data items, and Subscribers subscribe to these Publishers to receive and process the emitted data asynchronously. The "Publisher <- subscribe" concept encapsulates the core idea of reactive programming, where data is pushed from Publishers to Subscribers.

**Event Driven**:
Event-driven programming revolves around reacting to events, which are occurrences or changes in a system. Reactive programming is built on the concept of handling events and responding to them asynchronously.

**Data Streams**:
Data streams represent sequences of data items emitted over time. In reactive programming, data streams are manipulated and processed using various operators to perform transformations, filtering, and combining of data.

**Functional/Declarative Programming**:
Functional programming is a programming paradigm that treats computation as the evaluation of mathematical functions. Declarative programming involves specifying the desired outcome rather than detailing the steps to achieve it. Reactive programming often encourages a functional and declarative approach to processing data streams.

**Cold and Hot Observables**:
Observables represent sources of events or data streams. Cold observables are lazy; they only start producing data when someone subscribes to them. Hot observables are always active, emitting data regardless of subscribers. When subscribing to a hot observable, you might miss data emitted before your subscription, but you can use techniques like caching to handle this.

These concepts form the foundation of reactive programming and are implemented in frameworks like Project Reactor. They enable you to build applications that are responsive, resilient, and elastic, capable of handling asynchronous and event-driven scenarios efficiently.





  


  
