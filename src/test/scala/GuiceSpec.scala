import com.google.inject.{AbstractModule, Guice}
import org.ababup1192._
import org.scalatest._

class GuiceSpec extends FlatSpec with Matchers {
  "GuiceMain" should "have Singleton Instance" in {
    val injector = Guice.createInjector(new AbstractModule {
      override def configure(): Unit = {}
    })

    val singletonScope = injector.getInstance(classOf[SingletonScope])
    val defaultScope = injector.getInstance(classOf[DefaultScope])

    singletonScope.count should ===(1000)
    defaultScope.count should ===(100)

    singletonScope.count = 9999
    defaultScope.count = 999

    val singletonScope2 = injector.getInstance(classOf[SingletonScope])
    val defaultScope2 = injector.getInstance(classOf[DefaultScope])

    singletonScope2.count should ===(9999)
    defaultScope2.count should ===(100)
  }
}
