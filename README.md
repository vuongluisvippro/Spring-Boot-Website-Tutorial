# SPRING BOOT TUTORIAL [![Build Status](https://travis-ci.org/nomensa/jquery.hide-show.svg)](https://travis-ci.org/nomensa/jquery.hide-show.svg?branch=master)

   ```Write once, run anywhere```

<p><i>We are living in the 22nd century. Most of the architectures of applications are getting a huge evolution. For examples: Google, Microsoft, Oracle, Facebook, Amazon, ...
However, Spring was born and existed, developed to stay relevant through a variety of spring modules and spring projects.
It sounds strange to me. Because I'm a beginner and just start to approach it. Anyways, If I got any mistakes. Please help me to fix it. I'll be ready to fix and improve it better in the future.</i></p>
  
## Schedule & Plan `Java Project`

``As you can see. When I'm starting to learn anything. Especially, these things want to connect with me. I couldn't say no or stop it. It takes me a lot of time to explore and understand "What the hell"?``

[x] What is the Spring?
[x] What is dependency injection?
[x] DEPENDENCY
[]
[]


## What is the Spring?
``In this lesson, we will learn about what is the definition of Spring in programming? Why do they call it as named "Framework"?``

``The most important thing here, we are mentioning about terminologies which are related to Spring. Spring is a dependency injection framework.``

## What is dependency injection?
![alt text](https://github.com/vuongluisvippro/Spring-Boot-Website-Tutorial/blob/master/training/1.png)
### Analyze it: 
- This is a structure of developing website app.
- You have layers of an application. In the past, we usually talk about website or application. It means that we just think that only one layer. Now, when we have more chances to approach and observe more systems. Everything will be changed by a huge evolution. It's not general structure. But, It's quite a bit typical. 
- Let's talk about business layer, data layer and web layer. Actually, web layer is most concerned with the UI of the application. => **How do you show stuff to user?**
- Finally, this is how we build web applications.
- The web layer is dependent on business layer and the business layer is dependent on the data.

## DEPENDENCY
- For example, we design a view that allow users to input number. After they click on Submit button. We will get data. 
- Logic business here: Data will be sorted before storing in database.
- A new complex business was born to do before transfer next.

```java
public class ComplexBusinessService {
	SortAlgorithm sortAlgorithm;
}
```
- So **SortAlgorithm** is dependency of the Business Login class. But, the concept of dependency is fairly simple. What does complex business service need to be able to provide it service? It needs a sort algorithm. Dependency of a class is basically what are all the things. It needs to be able to perform its functionality.

![alt text](https://github.com/vuongluisvippro/Spring-Boot-Website-Tutorial/blob/master/training/2.png)

- We inject interface **SortAlgorithm** or declare interface **SortAlgorithm** inside class **ComplexBusinessService**. Now, we need to create a class to define all methods inside it. Here is class **BubbleSortAlgorithm.java**.
- Assume that, we define two method named is A and B. From interface **SortAlgorithm** in class **ComplexBusinessService**. We just call both of two methods above.
- Expand all: We can implement interfaces.

## CONTINUE

```java
import java.util.ArrayList;
import java.util.List;

  public class Subject {

  private int state;

  public int getState() {
    return state;
  }

 public void setState(int state) {
 import java.util.ArrayList;
  import java.util.List;

  public class Subject {

  private int state;

  public int getState() {
    return state;
  }

 public void setState(int state) {
   this.state = state;
 }
}   
```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> We need <b>ArrayList<Observer>()</b>, <b>attach(Observer observer)</b>, <b>notifyAllObservers()</b> and finally <b>notifyAllObservers()</b>
   
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/c.png" width="24px" height="24px"/>  Create variable to contain these observers<br>
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/c.png" width="24px" height="24px"/>  Attach observer from outside of scope of object<br>
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/c.png" width="24px" height="24px"/>  Implement sync when update its object with other observer<br>
```java
import java.util.ArrayList;
import java.util.List;

  public class Subject {

  private List<Observer> observers 
        = new ArrayList<Observer>();
  private int state;

  public int getState() {
    return state;
  }

 public void setState(int state) {
   this.state = state;
   notifyAllObservers();
 }

   public void attach(Observer observer){
     observers.add(observer);       
   }

  public void notifyAllObservers(){
    for (Observer observer : observers) {
     observer.update();
  }
} 
```

<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Create interface to communicate between Subject and other Observer
```java
public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}
```

<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Create concrete observer classes
```java
public class BinaryObserver extends Observer{

  public BinaryObserver(Subject subject){
     this.subject = subject;
     this.subject.attach(this);
  }

  @Override
  public void update() {
     System.out.println( "Binary String: " 
     + Integer.toBinaryString( subject.getState() ) ); 
  }
}

public class OctalObserver extends Observer{

   public OctalObserver(Subject subject){
     this.subject = subject;
    this.subject.attach(this);
 }

  @Override
  public void update() {
    System.out.println( "Octal String: " 
    + Integer.toOctalString( subject.getState() ) ); 
  }
}

public class HexaObserver extends Observer{

  public HexaObserver(Subject subject){
    this.subject = subject;
    this.subject.attach(this);
 }

  @Override
  public void update() {
     System.out.println( "Hex String: " 
    + Integer.toHexString( subject.getState() ).toUpperCase() ); 
 }
}
```

<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Use Subject and concrete observer objects.
```java
public class ObserverPatternDemo {
    public static void main(String[] args) {
       Subject subject = new Subject();

       new HexaObserver(subject);
       new OctalObserver(subject);
       new BinaryObserver(subject);

       System.out.println("First state change: 15");    
       subject.setState(15);
       System.out.println("Second state change: 10");   
       subject.setState(10);
   }
}
```
## We research about "Iterator Design Pattern in Java"
``Java developers have to be familiar with the Iterator interface:``
![alt text](https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/2.png)
```java
import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExample {
	public static void main(String[] args) {
		// iterators
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(6);
		list.add(11);
		for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
			Integer i = it.next();
			System.out.println(""+i);
		}
		Iterator<Integer> it = list.iterator();
		it.next();
		it.next();
		it.remove();
		System.out.println(list);
	}
}
```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Upgrade level 1
```java
package upgrade;

@SuppressWarnings("all")
public class Shape {
	private int id;
	private String name;
	
	Shape(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

package upgrade;

@SuppressWarnings("all")
public class Main {
	public static void main(String[] args) {
		Shape rectangle = new Shape(1, "Rectangle");
		Shape square = new Shape(2, "Square");
		Shape circle = new Shape(3, "Circle");
		Shape triangle = new Shape(4, "Triangle");
		
		ShapeStorage shapeStorage = new ShapeStorage();
		shapeStorage.add(rectangle);
		shapeStorage.add(square);
		shapeStorage.add(circle);
		shapeStorage.add(triangle);
		
		// Create an iterator to iterate through this collection
	}
}

package upgrade;

@SuppressWarnings("all")
public class ShapeStorage {

	private Shape[] shapes = new Shape[4];
	private int index = 0;
	
	public void add(Shape shape) {
		shapes[index] = shape;
		index++;
	}

}

```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Create method to get list (<b>Object Collection</b>)
### <b>Create an iterator to iterate through this collection</b>

```java
public Shape[] getShapes() {
	return shapes;
}
	
```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Embed Iterator into Collection and access element of collection easily.

```java
package upgrade;

import java.util.Iterator;
import java.util.function.Consumer;

@SuppressWarnings("all")
public class ShapeInterator implements Iterator<Shape> {

	private Shape[] shapes;
	private int index = 0;

	public ShapeInterator(Shape[] shapes) {
		this.shapes = shapes;
	}

	public void forEachRemaining(Consumer<? super Shape> arg0) {
		// TODO Auto-generated method stub
	}

	public boolean hasNext() {
		if (index < shapes.length) {
			return true;
		}
		return false;
	}

	public Shape next() {
		if (this.hasNext()) {
			return shapes[index++];
		}
		return null;
	}

	public void remove() {
		for (int i = index - 1; i < shapes.length - 1; i++) {
			shapes[i] = shapes[i+1];
		}
		shapes[shapes.length - 1] = null;
	}

}

package upgrade;

@SuppressWarnings("all")
public class Main {
	public static void main(String[] args) {
		Shape rectangle = new Shape(1, "Rectangle");
		Shape square = new Shape(2, "Square");
		Shape circle = new Shape(3, "Circle");
		Shape triangle = new Shape(4, "Triangle");
		
		ShapeStorage shapeStorage = new ShapeStorage();
		shapeStorage.add(rectangle);
		shapeStorage.add(square);
		shapeStorage.add(circle);
		shapeStorage.add(triangle);
		
		// Create an iterator to iterate through this collection
		ShapeInterator iterator = new ShapeInterator(shapeStorage.getShapes());
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		iterator.next();
		iterator.remove();
	}
}

```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> 

```java
package upgrade;

@SuppressWarnings("all")
public class Shape {
	private int id;
	private String name;
	
	Shape(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

package upgrade;

@SuppressWarnings("all")
public class ShapeStorage {

	private Shape[] shapes = { new Shape(1, "Rectangle"),
			new Shape(2, "Square"), new Shape(3, "Circle"),
			new Shape(4, "Triangle") };

	public Iterator getShaIterator() {
		return new ShapeInterator();
	}
	
	interface Iterator {
		
		boolean hasNext();

		Object next();

		void remove();
	}

	class ShapeInterator implements Iterator {

		private int index = 0;

		public boolean hasNext() {
			if (index < shapes.length) {
				return true;
			}
			return false;
		}

		public Shape next() {
			if (this.hasNext()) {
				return shapes[index++];
			}
			return null;
		}

		public void remove() {
			for (int i = index - 1; i < shapes.length - 1; i++) {
				shapes[i] = shapes[i + 1];
			}
			shapes[shapes.length - 1] = null;
		}
	}
}

package upgrade;

import upgrade.ShapeStorage.Iterator;


@SuppressWarnings("all")
public class Main {
	public static void main(String[] args) {
		// Create an iterator to iterate through this collection
		ShapeStorage shapeStorage = new ShapeStorage();
	      for(Iterator iter = shapeStorage.getShaIterator(); iter.hasNext();){
	         Shape shape = (Shape)iter.next();
	         System.out.println(shape.toString());
	      }   
	}
}

```
## Build blocks for RxJava
The build blocks for RxJava code are the following:
- <b>observables</b> representing sources of data
- <b>subscribers</b> (or observers) listening to the observables 
- a set of methods for modifying and composing the data
An observable emits items; a subscriber consumes those items.
![alt text](https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/3.png)
![alt text](https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/4.png)

### Flowable<T>
	
```java
public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Flowable<List<Node>> flowable = Flowable.fromArray(testGetNodes());
        flowable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<List<Node>>() {
            @Override
            public void accept(@NonNull List<Node> nodes) throws Exception {
                Log.i("TAG", nodes.get(0).getName());
            }
        });
    }

    private List<Node> testGetNodes() {
        ArrayList<Node> list = new ArrayList<>();
        list.add(new Node(1, "Math"));
        list.add(new Node(2, "English"));
        list.add(new Node(3, "Geography"));
        list.add(new Node(4, "History"));
        return list;
    }
}
```
#### subscribeOn
![alt text](https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/5.png)
- <b>subscribeOn</b>: Register Asynchronously 
#### Schedulers.io
This Scheduler is similar to the newThread except for the fact that already started threads are recycled and can possibly handle future requests.

This implementation works similarly to ThreadPoolExecutor from java.util.concurrent with an unbounded pool of threads. Every time a new worker is requested, either a new thread is started (and later kept idle for some time) or the idle one is reused:
Readmore here: http://www.baeldung.com/rxjava-schedulers
```java
Flowable<List<Node>> flowable = Flowable.fromArray(testGetNodes());
        flowable.subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe(new Consumer<List<Node>>() {

                    @Override
                    public void accept(@NonNull List<Node> nodes) throws Exception {
                        Log.i("TAG", nodes.get(0).getName());
                    }
                });
```
![alt text](https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/6.png)
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Continue with <b>Observable.create</b>
```java
Observable<Node> observable = Observable.create(new ObservableOnSubscribe<Node>() {
            @Override
            public void subscribe(ObservableEmitter<Node> emitter) throws Exception {
                try {
                    List<Node> nodes = testGetNodes();
                    for (Node node : nodes) {
                        emitter.onNext(node);
                    }
                    emitter.onComplete();
                } catch (Exception e) {
                    emitter.onError(e);
                }
            }
        });
```
We using to make sure. No issues or bugs with list of nodes.
```java
for (Node node : nodes) {
	emitter.onNext(node);
}
emitter.onComplete();
```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Maybe in reality</b>
```java
@Query("SELECT * FROM "+ DatabaseInfo.Tables.Listing)
Maybe<List<Listing>> getListings();
```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Maybe in example</b>
```java
Maybe<List<Node>> way1 = (Maybe<List<Node>>) testGetNodes();
Maybe<List<Node>> way2 = Maybe.create(new MaybeOnSubscribe<List<Node>>() {
    @Override
    public void subscribe(MaybeEmitter<List<Node>> emitter) throws Exception {
	try {
	    List<Node> nodes = testGetNodes();
	    if(nodes != null && !nodes.isEmpty()) {
		emitter.onSuccess(nodes);
	    } else {
		emitter.onComplete();
	    }
	} catch (Exception e) {
	    emitter.onError(e);
	}
    }
});
```

<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Perfect</b>
```java
 public class FlowableExampleActivity extends AppCompatActivity {

    private static final String TAG = FlowableExampleActivity.class.getSimpleName();
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        btn = (Button) findViewById(R.id.btn);
        textView = (TextView) findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSomeWork();
            }
        });
    }

    /*
     * simple example using Flowable
     */
    private void doSomeWork() {

        Flowable<Integer> observable = Flowable.just(1, 2, 3, 4);

        observable.reduce(50, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer t1, Integer t2) {
                return t1 + t2;
            }
        }).subscribe(getObserver());

    }

    private SingleObserver<Integer> getObserver() {

     return new SingleObserver<Integer>() {
        @Override
        public void onSubscribe(Disposable d) {
            Log.d(TAG, " onSubscribe : " + d.isDisposed());
        }

        @Override
        public void onSuccess(Integer value) {
            Log.d(TAG, " onSuccess : value : " + value);
        }

        @Override
        public void onError(Throwable e) {
            Log.d(TAG, " onError : " + e.getMessage());
        }
    };
}
}
```
### Subscribing in RxJava
To receive the data emitted from an observable you need to subscribe to it. observables offer a large variety of subscribe methods.
```java
static class GetAll extends AsyncTask<Void, Void, Void> {
@Override
protected Void doInBackground(Void... voids) {
    mListingDao.getListings().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<List<Listing>>() {
	@Override
	public void accept(@io.reactivex.annotations.NonNull List<Listing> listings) throws Exception {
	    mPresenter.onGetListingsSuccess(listings);
	}
    });
    return null;
}
}
```
There are two common ways to get it
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Way 1
```java
way2.subscribeWith(new DisposableMaybeObserver<List<Node>>() {
            @Override
            public void onSuccess(List<Node> nodes) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Way 2 (Observable + DisposableObserver)
```java
Observable<Node> observable =Observable.create(new ObservableOnSubscribe<Node>() {
            @Override
            public void subscribe(ObservableEmitter<Node> emitter) throws Exception {
                try {
                    List<Node> nodes = testGetNodes();
                    for (Node node : nodes) {
                        emitter.onNext(node);
                    }
                    emitter.onComplete();
                } catch (Exception e) {
                    emitter.onError(e);
                }
            }
        });

        DisposableObserver<Node> disposable = observable.subscribeWith(new DisposableObserver<Node>() {
            @Override
            public void onNext(Node o) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

        // Dispose the subscription when not interested in the emitted data any more
        disposable.dispose();
```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Way 2 (Observable + DisposableObserver)

```java
Observable<Node> observable =Observable.create(new ObservableOnSubscribe<Node>() {
            @Override
            public void subscribe(ObservableEmitter<Node> emitter) throws Exception {
                try {
                    List<Node> nodes = testGetNodes();
                    for (Node node : nodes) {
                        emitter.onNext(node);
                    }
                    emitter.onComplete();
                } catch (Exception e) {
                    emitter.onError(e);
                }
            }
        });

        DisposableObserver<Node> disposable = observable.subscribeWith(new DisposableObserver<Node>() {
            @Override
            public void onNext(Node o) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

        // Dispose the subscription when not interested in the emitted data any more
        disposable.dispose();
```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Way 2 (Observable + DisposableObserver)
```java
Single<List<Todo>> todosSingle = getTodos();

Disposable disposable = todosSingle.subscribeWith(new DisposableSingleObserver<List<Todo>>() {

    @Override
    public void onSuccess(List<Todo> todos) {
        // work with the resulting todos
    }

    @Override
    public void onError(Throwable e) {
        // handle the error case
    }
});

// continue working and dispose when value of the Single is not interesting any more
disposable.dispose();
```
