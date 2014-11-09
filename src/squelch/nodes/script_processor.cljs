(ns squelch.nodes.script-processor)

; -----------
; Properties:
; -----------

(defn get-buffer-size
  "Read only.
  Returns an integer representing both the input and output buffer size. It's
  value can be a power of 2 value in the range 256–16384."
  [processor]
  (.-bufferSize processor))

; ---------------
; Event handlers:
; ---------------

(defn set-on-audio-process
  "Represents the EventHandler to be called. Instead of receiving the raw audio
  event the function receives input and output audio buffers. The signature of
  the handler should be [input-buffer output-buffer]."
  [processor audio-process-fn]
  (let [process-proxy (fn [audio-event]
                        (let [input-buffer (.-inputBuffer audio-event)
                              output-buffer (.-outputBuffer audio-event)]
                          (audio-process-fn input-buffer output-buffer)))]
    (set! (.-onaudioprocess processor) process-proxy)))
