import scala.io.StdIn.readLine

@main
def sayHello = {
  println("Hey, what's your name? (please press <Enter> after entering your name)")

  val name = readLine()

  // Don't forget to buy milk on the way home from the lecture -- there's no more food at home.
  // TODO: Don't forget to remove the comment above before committing.

  val greeting =
    s"""Hello there, ${name}, nice to see you!
      |
      |Seems like you have all dependencies set up correctly.
      |Apparently, this application is running on ${os} with JDK ${jdkVersion}.
      |
      |Have fun in the Software Engineering course! :)
      |""".stripMargin

  println(greeting)
}


def jdkVersion = System.getProperty("java.version")

def os = System.getProperty("os.name")
