(ns squelch.nodes.wave-shaper)

; -----------
; Properties:
; -----------

(defn get-curve
  "Is a Float32Array of numbers describing the distortion to apply."
  [wave-shaper]
  (.-curve wave-shaper))

(defn set-curve
  "Is a Float32Array of numbers describing the distortion to apply."
  [wave-shaper curve]
  (set! (.-curve wave-shaper) curve))

(defn get-oversample
  "Is an enumerated value indicating if oversampling must be used. Oversampling
  is a technique for creating more samples (up-sampling) before applying the
  distortion effect to the audio signal. Valid settings are none, 2x, and 4x."
  [wave-shaper]
  (.-oversample wave-shaper))

(defn set-oversample
  "Is an enumerated value indicating if oversampling must be used. Oversampling
  is a technique for creating more samples (up-sampling) before applying the
  distortion effect to the audio signal. Valid settings are none, 2x, and 4x."
  [wave-shaper value]
  (set! (.-oversample wave-shaper) value))
