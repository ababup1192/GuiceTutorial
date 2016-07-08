package org.ababup1192

trait Speaker {
  def thankYou(): String
}

class JapaneseSpeaker extends Speaker {
  override def thankYou(): String = "ありがとう"
}