
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

  It is well suited


                    








  
