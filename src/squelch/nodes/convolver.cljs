(ns squelch.nodes.convolver)

; -----------
; Properties:
; -----------

(defn get-buffer
  "A mono, stereo, or 4-channel AudioBuffer containing the (possibly
  multichannel) impulse response used by the ConvolverNode to create the reverb
  effect."
  [convolver]
  (.-buffer convolver))

(defn set-buffer
  "A mono, stereo, or 4-channel AudioBuffer containing the (possibly
  multichannel) impulse response used by the ConvolverNode to create the reverb
  effect."
  [convolver buffer]
  (set! (.-buffer convolver)))

(defn get-normalize
  "A boolean that controls whether the impulse response from the buffer will be
  scaled by an equal-power normalization when the buffer attribute is set, or
  not."
  [convolver]
  (.-normalize convolver))

(defn set-normalize
  "A boolean that controls whether the impulse response from the buffer will be
  scaled by an equal-power normalization when the buffer attribute is set, or
  not."
  [convolver normalize]
  (set! (.-normalize convolver) normalize))
