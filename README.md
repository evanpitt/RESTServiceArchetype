# REST Service Archetype

This project contains an Archetype for a REST Service.  This is intended to be the skeleton REST service archetype but with a little more infrastructure in place to hit the ground running.

**This project is part of my Developer Bat Belt**

## What is the Developer Bat Belt?
In short, I've noticed that throughout my life/career there are tons of designs, principles, code snippets, templates, and overall just components
that I have written that I feel are generically valuable and reusbale.  They are often so generic that they can be used anywhere and seem to be very commonly needed.
This made me start to ask myself questions like why would any programmer want to code it again? Wouldn't that be cool if these designs could be stored somewhere public for everyone?
The Developer Bat Belt is a continuous effort to provide code, deisgns, templates, and any soltuions that help developers get better, faster, stronger.  The Developer Bat Belt is made by a developer, for developers.
The code distributed within projects under the Developer Bat Belt is interlaced with my take on setup, config, and designs based off of my experiences but is of course open to public feedback.
Although what is contributed is not the greatest thing ever, I hope developers can leverage something from it.


### Build Tools
#### Apache Maven 3.3.9
I am using the bundled Maven included with IntelliJ IDEA.

Try running "clean site javadoc:test-javadoc javadoc:javadoc package" against the project for a full package including
the apidocs and the maven site documentation!

### Server Environment
This Archetype is aimed at being server-agnostic, but below are the jBoss/WildFly specs used:

| Attribute     | Spec          |
| ------------- |:-------------:|
| Server  Name  | WildFly Full  |
| Server Version| 10.1.0.Final  |
| Profile       | COMMUNITY     |
| HAL Version   | 2.8.27.Final  |
| Core Version   | 2.8.27.Final |

### Dependencies

#### Java 8
- Java version: 1.8.0_131
- Java TM SE Runtime Environment build 1.8.0_131-b11
- Java HotSpotTM 64-Bit Server VM build 25.131-b11, mixed mode

#### Spring 4.3.9.RELEASE
- Spring-core
- Spring-webmvc

#### Jackson
- Integrated Spring support for JSON
- jackson-dataformat-xml for XML

### Setup
1. Make sure to add the spring.profiles.active key to your application server's environment variables with the value of "local"
2. Build with Maven via **mvn clean compile**
3. Deploy to the local application server
4. Verify that the HTTP port on the aplpication server is configured to be 8080
5. Consume the test endpoint [http://localhost:8080/RESTServiceArchetype/services/appInfo/info](http://localhost:8080/RESTServiceArchetype/services/appInfo/info)
