import com.google.inject.name.Names
import com.google.inject.{AbstractModule, Guice}
import org.ababup1192.{EnglishSpeaker, GuiceMain, JapaneseSpeaker, Speaker}
import org.scalatest._

class GuiceSpec extends FlatSpec with Matchers {
  "GuiceMain" should "have JapaneseSpeaker and EnglishSpeaker Instances" in {
    val injector = Guice.createInjector(new AbstractModule {
      override def configure(): Unit = {
        bind(classOf[Speaker]).annotatedWith(Names.named("japanese")).to(classOf[JapaneseSpeaker])
        bind(classOf[Speaker]).annotatedWith(Names.named("english")).to(classOf[EnglishSpeaker])
      }
    })

    val main = injector.getInstance(classOf[GuiceMain])
    main.japaneseSpeaker.thankYou() should ===("ありがとう")
    main.englishSpeaker.thankYou() should ===("Thank you")
  }
}
