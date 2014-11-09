(ns squelch.nodes.biquad-filter)

; -----------
; Properties:
; -----------

(defn get-frequency
  "Read only.
  Is a k-rate AudioParam, a double representing a frequency in the current
  filtering algorithm measured in hertz (Hz)."
  [biquad-filter]
  (.-frequency biquad-filter))

(defn get-detune
  "Read only.
  Is an a-rate AudioParam representing detuning of the frequency in cents."
  [biquad-filter]
  (.-detune biquad-filter))

(defn get-Q
  "Read only.
  Is a k-rate AudioParam, a double representing a Q factor, or quality factor."
  [biquad-filter]
  (.-Q biquad-filter))

(defn get-gain
  "Read only.
  Is a k-rate AudioParam, a double representing the gain used in the current
  filtering algorithm."
  [biquad-filter]
  (.-gain biquad-filter))

(defn get-type
  "Is a string value defining the kind of filtering algorithm the node is
  implementing. Available types are lowpass, highpass, bandpass, lowshelf,
  highshelf, peaking, notch, allpass"
  [biquad-filter]
  (.-type biquad-filter))

(defn set-type
  "Is a string value defining the kind of filtering algorithm the node is
  implementing. Available types are lowpass, highpass, bandpass, lowshelf,
  highshelf, peaking, notch, allpass"
  [biquad-filter filter-type]
  (set! (.-type biquad-filter) filter-type))

; --------
; Methods:
; --------

(defn get-frequency-response
  "From the current filter parameter settings this method calculates the
  frequency response for frequencies specified in the provided array of
  frequencies."
  [biquad-filter frequency-array]
  (let [size (.-length frequency-array)
        mag-response (js/Float32Array. size)
        phase-response (js/Float32Array. size)]

    (.getFrequencyResponse biquad-filter
                           frequency-array
                           mag-response
                           phase-response)
    {:mag-response mag-response :phase-response phase-response}))
