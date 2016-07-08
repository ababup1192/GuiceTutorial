import com.google.inject.{AbstractModule, Guice}
import org.ababup1192.{GuiceMain, JapaneseSpeaker, Speaker}
import org.scalatest._

class GuiceSpec extends FlatSpec with Matchers {
  "GuiceMain" should "have JapaneseSpeaker Instance" in {
    val injector = Guice.createInjector(new AbstractModule {
      override def configure(): Unit = {}
    })

    val main = injector.getInstance(classOf[GuiceMain])
    main.speaker.thankYou() should ===("ありがとう")
  }
}
