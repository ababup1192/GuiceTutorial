package org.ababup1192

import com.google.inject.Inject
import com.google.inject.name.Named

class GuiceMain @Inject()(
                           @Named("japanese") val japaneseSpeaker: Speaker,
                           @Named("english") val englishSpeaker: Speaker
                         )



