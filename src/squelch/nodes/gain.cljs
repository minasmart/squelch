(ns squelch.nodes.delay)

; -----------
; Properties:
; -----------

(defn get-delay-time
  "Read only.
  Is an a-rate AudioParam representing the amount of delay to apply."
  [delay-node]
  (.-delayTime delay-node))
