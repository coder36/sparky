# Sparkjava Experiment

I've come across really nice, lightweight java web framework called [Sparkjava](http://sparkjava.com).
Spark was inspired by Ruby's Sinatra.  It looks and feels similar...

1) Is it as easy to use as it looks ?

2) How does it play with templating languages ?

3) How can it be configured for different environments ?

I've put together a demo and point of reference to show exactly what Spark can offer:


# Prerequisites

 * JDK 8
 * Maven
 * Ruby 2.2.3  (if you want to run the cucumber tests)



# Quick Setup

    mvn clean install
    java -jar target/sparky-1.0-SNAPSHOT-jar-with-dependencies.jar

This will start the spark server up, listening on http://localhost:4567/bill



# Production

    mvn clean install
    java -Denv=prod -jar target/sparky-1.0-SNAPSHOT-jar-with-dependencies.jar


# Testing

I've approached this using BDD ie. Testing things from a customer / product owner perspective.
I'm using cucumber and Capybara (ruby).

    bundle install
    cucumber


# Environment based configuration

I could have used the standard java properties,
  however its nice to be able to group properties together in a logical way.
  So, I created my own based on a json configuration file.  I choose json as it can have a nested structure:

```
{
  "dev": {
    "bill_json" : "http://localhost:4567/bill.json"
    "other":
      "param1" : "my other config"

  },

  "prod": {
    "bill_json" : "https://pure-savannah-9942.herokuapp.com/billa.json"
  }
}

```

Accessing the properties:

It will look at the -Denv parameter passed on start to fix the config root in the json structure.
If not provided will default to 'dev'


```
import static coder36.utils.Config.*;

config("bill_json")   ==> http://localhost:4567/bill.json  (since it defaults to 'dev')
config("other.param1") ==> "my other config"

```


# Conclusion

1) Is it as easy as it looks ? - Yes!

And with JDK8 it makes it syntactically very nice.
It will break the well established java coding conventions and styles, but Spark is a pardigm
shift.  Effectively you have one big ```static void main(String[])``` method that is your web
  app.


2) How does it play with the templating languages ? - Use Freemarker

Mustache/Handlebars - not a great experience.  They are more of a javascript/client side rendering framework.  On java server side it was just clunky!  I found very difficult to extend e.g writing a date_nicifier's'

Freemarker -  OMG awesomeness!  Freemarker is what jsp's should have been.
 It was simple and obvious to use.  I'll be using freemarker in my future projects.  It kind of
 just worked... how often can you say that?


3) How can it be configured for different environments ? - Roll your own


I see Spark being used for single page apps (ie. javascript client side apps), for



# Links

* [Spark Home page](http://sparkjava.com/)
* [Spark Github](https://github.com/perwendel/spark)
* [Reasons to replace your jsps with freemarker](http://blog.stackhunter.com/2014/01/17/10-reasons-to-replace-your-jsps-with-freemarker-templates)
