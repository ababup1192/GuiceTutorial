import com.google.inject.{AbstractModule, Guice}
import org.ababup1192._
import org.scalatest._

class GuiceSpec extends FlatSpec with Matchers {
  "GuiceMain" should "have User Instance" in {
    val injector = Guice.createInjector(new AbstractModule {
      override def configure(): Unit = {
        bind(classOf[User]).toInstance(new User("Bob"))
      }
    })

    val main = injector.getInstance(classOf[GuiceMain])
    main.user.introduce should ===("My name is Bob.")
  }
}
