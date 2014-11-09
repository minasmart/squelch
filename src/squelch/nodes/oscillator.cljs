(ns squelch.nodes.oscillator)

; -----------
; Properties:
; -----------

(defn get-frequency
  "An a-rate AudioParam representing the frequency of oscillation in hertz
  (though the AudioParam returned is read-only, the value it represents is
  not.)"
  [oscillator]
  (.-frequency oscillator))

(defn set-frequency
  "An a-rate AudioParam representing the frequency of oscillation in hertz
  (though the AudioParam returned is read-only, the value it represents is
  not.)"
  [oscillator frequency]
  (set! (.-frequency oscillator) frequency))

(defn get-detune
  "An a-rate AudioParam representing detuning of oscillation in cents (though
  the AudioParam returned is read-only, the value it represents is not.)"
  [oscillator]
  (.-detune oscillator))

(defn set-detune
  "An a-rate AudioParam representing detuning of oscillation in cents (though
  the AudioParam returned is read-only, the value it represents is not.)"
  [oscillator detune]
  (set! (.-detune oscillator) detune))

(defn get-type
  "Represents the shape of the oscillator wave generated. Different waves will
  produce different tones."
  [oscillator]
  (.-type oscillator))

(defn set-type
  "Represents the shape of the oscillator wave generated. Different waves will
  produce different tones. Supported types are sine, square, sawtooth, triangle,
  and custom."
  [oscillator wave-type]
  (set! (.-type oscillator) wave-type))

; --------
; Methods:
; --------

(defn start
  "As defined in AudioBufferSourceNode, this method specifies the exact time to
  start playing the tone."
  ([oscillator]
   (.start oscillator))

  ([oscillator when-seconds]
   (.start oscillator when-seconds)))

(defn stop
  "As defined in AudioBufferSourceNode, this method specifies the exact time to
  stop playing the tone."
  ([oscillator]
   (.stop oscillator))

  ([oscillator when-seconds]
   (.stop oscillator when-seconds)))

(defn set-periodic-wave
  "Used to point to a PeriodicWave defining a periodic waveform that can be used
  to shape the oscillator's output, when type = \"custom\" is used. This
  replaces the now-obsolete OscillatorNode.setWaveTable."
  [oscillator wave]
  (.setPeriodicWave oscillator wave))

; ---------------
; Event handlers:
; ---------------

(defn set-on-ended
  "Used to set the event handler for the ended event, which fires when the tone
  has stopped playing."
  [oscillator ended-fn]
  (set! (.-onended oscillator) ended-fn))

(defn get-on-ended
  "Used to set the event handler for the ended event, which fires when the tone
  has stopped playing."
  [oscillator]
  (.-onended oscillator))
