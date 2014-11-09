(ns squelch.nodes.delay)

; -----------
; Properties:
; -----------

(defn get-threshold
  "Read only.
  Is a k-rate AudioParam representing the decibel value above which the
  compression will start taking effect."
  [compressor]
  (.-threshold compressor))

(defn get-knee
  "Read only.
  Is a k-rate AudioParam containing a decibel value representing the range above
  the threshold where the curve smoothly transitions to the compressed portion."
  [compressor]
  (.-knee compressor))

(defn get-ratio
  "Read only.
  Is a k-rate AudioParam representing the amount of change, in dB, needed in the
  input for a 1 dB change in the output."
  [compressor]
  (.-ratio compressor))

(defn get-reduction
  "Read only.
  Is a k-rate AudioParam representing the amount of gain reduction currently
  applied by the compressor to the signal."
  [compressor]
  (.-reduction compressor))

(defn get-attack
  "Read only.
  Is a k-rate AudioParam representing the amount of time, in seconds, required
  to reduce the gain by 10 dB."
  [compressor]
  (.-attack compressor))

(defn get-release
  "Read only.
  Is a k-rate AudioParam representing the amount of time, in seconds, required
  to increase the gain by 10 dB."
  [compressor]
  (.-release compressor))
