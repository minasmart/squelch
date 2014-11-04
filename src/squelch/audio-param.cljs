(ns squelch.audio-param)

; -----------
; Properties:
; -----------

(defn get-value
  "Represents the parameter's current floating point value; initially set to the
  value of AudioParam.defaultValue. Though it can be set, any modifications
  happening while there are automation events scheduled — that is events
  scheduled using the methods of the AudioParam — are ignored, without raising
  any exception."
  [param]
  (.-value param))

(defn set-value
  "Represents the parameter's current floating point value; initially set to the
  value of AudioParam.defaultValue. Though it can be set, any modifications
  happening while there are automation events scheduled — that is events
  scheduled using the methods of the AudioParam — are ignored, without raising
  any exception."
  [param value]
  (set! (.-value param) value))

(defn get-default-value
  "Read only.
  Represents the initial value of the attributes as defined by the specific
  AudioNode creating the AudioParam."
  [param]
  (.-defaultValue param))

; --------
; Methods:
; --------

(defn set-value-at-time
  "Schedules an instant change to the value of the AudioParam at a precise time,
  as measured against AudioContext.currentTime. The new value is given in the
  value parameter."
  [param value start-time]
  (.setValueAtTime param value start-time))

(defn linear-ramp-to-value-at-time
  "Schedules a gradual linear change in the value of the AudioParam. The change
  starts at the time specified for the previous event, follows a linear ramp to
  the new value given in the value parameter, and reaches the new value at the
  time given in the endTime parameter."
  [param value end-time]
  (.linearRampToValueAtTime param value start-time))

(defn exponential-ramp-to-value-at-time
  "Schedules a gradual exponential change in the value of the AudioParam. The
  change starts at the time specified for the previous event, follows an
  exponential ramp to the new value given in the value parameter, and reaches
  the new value at the time given in the endTime parameter."
  [param value end-time]
  (.exponentialRampToValueAtTime param value end-time))

(defn set-target-at-time
  "Schedules the start of a change to the value of the AudioParam. The change
  starts at the time specified in startTime and exponentially moves towards the
  value given by the target parameter. The exponential decay rate is defined by
  the timeConstant parameter, which is a time measured in seconds."
  [param target start-time time-constant]
  (.setTargetAtTime param target start-time time-constant))

(defn set-value-curve-at-time
  "Schedules the values of the AudioParam to follow a set of values, defined by
  the values Float32Array scaled to fit into the given interval, starting at
  startTime, and having a specific duration."
  [param value start-time duration]
  (.setValueCurveAtTime param value start-time duration))

(defn cancel-scheduled-values
  "Cancels all scheduled future changes to the AudioParam."
  [param start-time]
  (.cancelScheduledValues param start-time))
