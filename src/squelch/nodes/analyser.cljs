(ns squelch.nodes.analyser)

; -----------
; Properties:
; -----------

(defn get-fft-size
  "Is an unsigned long value representing the size of the FFT (Fast Fourier
  Transform) to be used to determine the frequency domain."
  [analyser]
  (.-fftSize analyser))

(defn set-fft-size
  "Is an unsigned long value representing the size of the FFT (Fast Fourier
  Transform) to be used to determine the frequency domain."
  [analyser fft-size]
  (set! (.-fftSize analyser) fft-size))

(defn get-frequency-bin-count
  "Read only.
  Is an unsigned long value half that of the FFT size. This generally equates
  to the number of data values you will have to play with for the
  visualization."
  [analyser]
  (.-frequencyBinCount analyser))

(defn get-min-decibels
  "Is a double value representing the minimum power value in the scaling range
  for the FFT analysis data, for conversion to unsigned byte values — basically,
  this specifies the minimum value for the range of results when using
  getByteFrequencyData()."
  [analyser]
  (.-minDecibels analyser))

(defn set-min-decibels
  "Is a double value representing the minimum power value in the scaling range
  for the FFT analysis data, for conversion to unsigned byte values — basically,
  this specifies the minimum value for the range of results when using
  getByteFrequencyData()."
  [analyser min-decibels]
  (set! (.-minDecibels analyser) min-decibels))

(defn get-min-decibels
  "Is a double value representing the maximum power value in the scaling range
  for the FFT analysis data, for conversion to unsigned byte values — basically,
  this specifies the maximum value for the range of results when using
  getByteFrequencyData()."
  [analyser]
  (.-minDecibels analyser))

(defn set-min-decibels
  "Is a double value representing the maximum power value in the scaling range
  for the FFT analysis data, for conversion to unsigned byte values — basically,
  this specifies the maximum value for the range of results when using
  getByteFrequencyData()."
  [analyser max-decibels]
  (set! (.-minDecibels analyser) max-decibels))

(defn get-smoothing-time-constant
  "Is a double value representing the averaging constant with the last analysis
  frame — basically, it makes the transition between values over time smoother."
  [analyser]
  (.-smoothingTimeConstant analyser))

(defn set-smoothing-time-constant
  "Is a double value representing the averaging constant with the last analysis
  frame — basically, it makes the transition between values over time smoother."
  [analyser constant]
  (set! (.-smoothingTimeConstant analyser) constant))

; --------
; Methods:
; --------

(defn get-float-frequency-data
  "Copies the current frequency data into a Float32Array array passed into it."
  [analyser dest]

  (let [size (get-frequency-bin-count analyser)]

    (.getFloatFrequencyData analyser dest)
    dest))

(defn get-byte-frequency-data
  "Copies the current frequency data into a Uint8Array (unsigned byte array)
  passed into it."
  [analyser dest]

  (let [size (get-frequency-bin-count analyser)]

    (.getByteFrequencyData analyser dest)
    dest))

(defn get-float-time-domain-data
  "Copies the current waveform, or time-domain, data into a Float32Array array
  passed into it."
  [analyser dest]

  (let [size (get-fft-size analyser)]

    (.getFloatTimeDomainData analyser dest)
    dest))

(defn get-byte-time-domain-data
  "Copies the current waveform, or time-domain, data into a Uint8Array (unsigned
  byte array) passed into it."
  [analyser dest]

  (let [size (get-fft-size analyser)]

    (.getByteTimeDomainData analyser dest)
    dest))
