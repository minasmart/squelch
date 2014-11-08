(ns squelch.nodes.panner)

; -----------
; Properties:
; -----------

(defn get-panning-model
  "Is an enumerated value determining which spatialisation algorithm to use to
  position the audio in 3D space. Valid models are equalpower and HRTF"
  [panner]
  (.-panningModel panner))

(defn set-panning-model
  "Is an enumerated value determining which spatialisation algorithm to use to
  position the audio in 3D space. Valid models are equalpower and HRTF"
  [panner panning-model]
  (set! (.-panningModel panner) panning-model))

(defn get-distance-model
  "Is an enumerated value determining which algorithm to use to reduce the
  volume of the audio source as it moves away from the listener. Valid models
  are linear, inverse, and exponential"
  [panner]
  (.-distanceModel panner))

(defn set-distance-model
  "Is an enumerated value determining which algorithm to use to reduce the
  volume of the audio source as it moves away from the listener. Valid models
  are linear, inverse, and exponential"
  [panner distance-model]
  (set! (.-distanceModel panner) distance-model))

(defn get-ref-distance
  "Is a double value representing the reference distance for reducing volume as
  the audio source moves further from the listener."
  [panner]
  (.-refDistance panner))

(defn set-ref-distance
  "Is a double value representing the reference distance for reducing volume as
  the audio source moves further from the listener."
  [panner ref-distance]
  (set! (.-refDistance panner) ref-distance))

(defn get-max-distance
  "Is a double value representing the maximum distance between the audio source
  and the listener, after which the volume is not reduced any further."
  [panner]
  (.-maxDistance panner))

(defn set-max-distance
  "Is a double value representing the maximum distance between the audio source
  and the listener, after which the volume is not reduced any further."
  [panner max-distance]
  (set! (.-maxDistance panner) max-distance))

(defn get-rolloff-factor
  "Is a double value describing how quickly the volume is reduced as the source
  moves away from the listener. This value is used by all distance models."
  [panner]
  (.-rolloffFactor panner))

(defn set-rolloff-factor
  "Is a double value describing how quickly the volume is reduced as the source
  moves away from the listener. This value is used by all distance models."
  [panner rolloff-factor]
  (set! (.-rolloffFactor panner) rolloff-factor))

(defn get-cone-inner-angle
  "Is a double value describing the angle, in degrees, of a cone inside of which
  there will be no volume reduction."
  [panner]
  (.-coneInnerAngle panner))

(defn set-cone-inner-angle
  "Is a double value describing the angle, in degrees, of a cone inside of which
  there will be no volume reduction."
  [panner cone-inner-angle]
  (set! (.-coneInnerAngle panner) cone-inner-angle))

(defn get-cone-outer-angle
  "Is a double value describing the angle, in degrees, of a cone outside of
  which the volume will be reduced by a constant value, defined by the
  coneOuterGain attribute."
  [panner]
  (.-coneOuterAngle panner))

(defn set-cone-outer-angle
  "Is a double value describing the angle, in degrees, of a cone outside of
  which the volume will be reduced by a constant value, defined by the
  coneOuterGain attribute."
  [panner cone-outer-angle]
  (set! (.-coneOuterAngle panner) cone-outer-angle))

(defn get-cone-outer-gain
  "Is a double value describing the amount of volume reduction outside the cone
  defined by the coneOuterAngle attribute. Its default value is 0, meaning that
  no sound can be heard."
  [panner]
  (.-coneOuterGain panner))

(defn set-cone-outer-gain
  "Is a double value describing the amount of volume reduction outside the cone
  defined by the coneOuterAngle attribute. Its default value is 0, meaning that
  no sound can be heard."
  [panner cone-outer-gain]
  (set! (.-coneOuterGain panner) cone-outer-gain))

; --------
; Methods:
; --------

(defn set-position
  "Defines the position of the audio source relative to the listener
  (represented by an AudioListener object stored in the AudioContext.listener
  attribute.)"
  [panner x y z]
  (.setPosition panner x y z))

(defn set-orientation
  "Defines the direction the audio source is playing in."
  [panner x y z]
  (.setOrientation x y z))

(defn set-velocity
  "Defines the velocity vector of the audio source — how fast it is moving and
  in what direction."
  [panner x y z]
  (.setVelocity x y z))
