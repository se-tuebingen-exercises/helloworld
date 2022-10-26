import scala.io.StdIn.readLine

@main
def sayhello = {
  println("Hey, what's your name? (please press <ENTER> after entering your name)")

  val name = readLine()

  val greeting =
    s"""Hello there, ${name}.
      |
      |Seems like you have all dependencies set up correctly, great.
      |Apparently, this application is running on ${os} with JDK ${jdkVersion}.
      |""".stripMargin

  println(greeting)
}


def jdkVersion = System.getProperty("java.version")

def os = System.getProperty("os.name")
