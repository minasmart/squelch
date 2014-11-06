(ns squelch.nodes.script-processor)

; -----------
; Properties:
; -----------

(defn get-buffer-size
  "Read only.
  Returns an integer representing both the input and output buffer size. It's
  value can be a power of 2 value in the range 256–16384."
  [buffer-source]
  (.-bufferSize buffer-source))

; ---------------
; Event handlers:
; ---------------

(defn get-on-audio-process
  "Represents the EventHandler to be called."
  [buffer-source]
  (.-onaudioprocess buffer-source))

(defn set-on-audio-process
  "Represents the EventHandler to be called."
  [buffer-source audio-process-fn]
  (set! (.-onaudioprocess buffer-source) audio-process-fn))
