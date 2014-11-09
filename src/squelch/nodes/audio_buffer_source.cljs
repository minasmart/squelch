(ns squelch.nodes.audio-buffer-source)

; -----------
; Properties:
; -----------

(defn get-buffer
  "Is an AudioBuffer that defines the audio asset to be played, or when set to
  the value null, defines a single channel of silence."
  [buffer-source]
  (.-buffer buffer-source))

(defn set-buffer
  "Is an AudioBuffer that defines the audio asset to be played, or when set to
  the value null, defines a single channel of silence."
  [buffer-source buffer]
  (set! (.-buffer buffer-source) buffer))

(defn get-playback-rate
  "Read only.
  Is an a-rate AudioParam that defines the speed factor at which the audio
  asset will be played. Since no pitch correction is applied on the output,
  this can be used to change the pitch of the sample."
  [buffer-source]
  (.-playbackRate buffer-source))

(defn get-loop
  "Is a Boolean attribute indicating if the audio asset must be replayed when
  the end of the AudioBuffer is reached. Its default value is false."
  [buffer-source]
  (.-loop buffer-source))

(defn set-loop
  "Is a Boolean attribute indicating if the audio asset must be replayed when
  the end of the AudioBuffer is reached. Its default value is false."
  [buffer-source loop-status]
  (set! (.-loop buffer-source) loop-status))

(defn get-loop-start
  "Is a double value indicating, in seconds, where in the AudioBuffer the
  restart of the play must happen. Its default value is 0."
  [buffer-source]
  (.-loopStart buffer-source))

(defn set-loop-start
  "Is a double value indicating, in seconds, where in the AudioBuffer the
  restart of the play must happen. Its default value is 0."
  [buffer-source start]
  (set! (.-loopStart buffer-source) start))

(defn get-loop-end
  "Is a double value indicating, in seconds, where in the AudioBuffer the replay
  of the play must stop (and eventually loop again). Its default value is 0."
  [buffer-source]
  (.-loopEnd buffer-source))

(defn set-loop-end
  "Is a double value indicating, in seconds, where in the AudioBuffer the replay
  of the play must stop (and eventually loop again). Its default value is 0."
  [buffer-source end]
  (set! (.-loopEnd buffer-source) end))

; ---------------
; Event handlers:
; ---------------

(defn get-on-ended
  "Is an EventHandler containing the callback associated with the ended event."
  [buffer-source]
  (.-onended buffer-source))

(defn set-on-ended
  "Is an EventHandler containing the callback associated with the ended event."
  [buffer-source ended-fn]
  (set! (.-onended buffer-source) ended-fn))

; --------
; Methods:
; --------

(defn start
  "Schedules the start of the playback of the audio asset."
  ([buffer-source]
   (.start buffer-source))

  ([buffer-source start-when]
   (.start buffer-source start-when))

  ([buffer-source start-when offset]
   (.start buffer-source start-when offset))

  ([buffer-source start-when offset duration]
   (.start buffer-source start-when offset duration)))

(defn stop
  "Schedules the end of the playback of an audio asset."
  ([buffer-source]
   (.stop buffer-source))

  ([buffer-source stop-when]
   (.stop buffer-source stop-when)))
