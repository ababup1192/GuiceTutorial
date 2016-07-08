package org.ababup1192

import com.google.inject.ImplementedBy

@ImplementedBy(classOf[JapaneseSpeaker])
trait Speaker {
  def thankYou(): String
}

class JapaneseSpeaker extends Speaker {
  override def thankYou(): String = "ありがとう"
}

class EnglishSpeaker extends Speaker {
  override def thankYou(): String = "Thank you"
}

