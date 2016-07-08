import com.google.inject.{AbstractModule, Guice}
import org.ababup1192.GuiceMain
import org.scalatest._

class GuiceSpec extends FlatSpec with Matchers {
  "GuiceMain" should "have HelloWorld Instance" in {
    val injector = Guice.createInjector(new AbstractModule {
      override def configure(): Unit = {}
    })

    val main = injector.getInstance(classOf[GuiceMain])
    main.helloWorld.hello() should === ("Hello Google Guice")
  }
}
