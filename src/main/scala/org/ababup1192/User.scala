package org.ababup1192

import com.google.inject.Provider

class User(val name: String){
  def introduce: String =
  s"My name is $name."
}

class UserProvider extends Provider[User] {
  override def get(): User = new User("Bob")
}
