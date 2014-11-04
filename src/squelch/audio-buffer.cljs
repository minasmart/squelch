(ns squelch.audio-buffer)

; -----------
; Properties:
; -----------

(defn get-sample-rate
  "Read only.
  Returns a float representing the sample rate, in samples per second, of the
  PCM data stored in the buffer."
  [buffer]
  (.-sampleRate buffer))

(defn length
  "Read only.
  Returns an integer representing the length, in sample-frames, of the PCM data
  stored in the buffer."
  [buffer]
  (.-length buffer))

(defn duration
  "Read only.
  Returns a double representing the duration, in seconds, of the PCM data
  stored in the buffer."
  [buffer]
  (.-duration buffer))

(defn number-of-channels
  "Read only.
  Returns an integer representing the number of discrete audio channels
  described by the PCM data stored in the buffer."
  [buffer]
  (.-numberOfChannels buffer))

; --------
; Methods:
; --------

(defn get-channel-data
  "Returns a Float32Array containing the PCM data associated with the channel,
  defined by the channel parameter (with 0 representing the first channel)."
  [buffer channel]
  (.getChannelData buffer channel))

(defn copy-from-channel
  "Copies the samples from the specified channel of the AudioBuffer to the
  destination array."
  ([buffer destination channel-number]
   (.copyFromChannelbbuffer buffer destination channel-number))

  ([buffer destination channel-number start-in-channel]
   (.copyFromChannelbbuffer buffer
                            destination
                            channel-number
                            start-in-channel)))

(defn copy-to-channel
  "Copies the samples to the specified channel of the AudioBuffer, from the
  source array."
  ([buffer source channel-number]
   (.copyFromChannelbbuffer buffer source channel-number))

  ([buffer source channel-number start-in-channel]
   (.copyFromChannelbbuffer buffer
                            source
                            channel-number
                            start-in-channel)))
