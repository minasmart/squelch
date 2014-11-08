(ns squelch.nodes.gain)

; -----------
; Properties:
; -----------

(defn get-gain
  "Read only.
  Is an a-rate AudioParam representing the amount of gain to apply."
  [gain-node]
  (.-gain gain-node))
