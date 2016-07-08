package org.ababup1192

import com.google.inject.Singleton

@Singleton
class SingletonScope {
  var count = 1000
}

class DefaultScope{
  var count = 100
}
