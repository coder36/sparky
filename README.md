# Sparkjava Experiment

I've found this really nice and lightweight java web framework. Some
  questions I'm looking to answer:

1) Is it as easy to use as it looks ?
2) How does it play with the templating languages




# Prerequisites

 * JDK 8
 * Maven
 * Ruby 2.2.3  (if you want to run the cucumber tests)



# Quick Setup

    mvn clean install
    java -jar target/sparky-1.0-SNAPSHOT-jar-with-dependencies.jar

This will start the sparl server up, listening on http://localhost:4567/bill


# Testing

I've approached this using BDD ie. Testing things from a customer / product owner perspective.
I'm using cucumber and Capybara (ruby).

    bundle install
    cucumber



# Conclusion

1) Is it as easy as it looks ? - Yes!

And with JDK8 it makes it syntactically very nice.
It will break the well established java coding conventions and styles, but Spark is a pardigm
shift.  Effectively you have one big ```static void main(String[])``` method that is your web
  app.  It's a game changer.


2) How does it play with the templating languages - Use Freemarker

Mustache/Handlebars - not a great experience.  They are more of a javascript/client side rendering framework.  On java server side it was just clunky!  I found very difficult to extend e.g writing a date_nicifier

Freemarker -  Freemarker is what jsp's should have been.  It was simple and obvious to use.  I'll be using freemarker in my furture projects.


# Links

[Reasons to replace your jsps with freemarker](http://blog.stackhunter.com/2014/01/17/10-reasons-to-replace-your-jsps-with-freemarker-templates)
