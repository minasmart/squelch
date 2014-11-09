(ns squelch.audio-node)

; -----------
; Properties:
; -----------

(defn get-context
  "Read only.
  Returns the associated AudioContext, that is the object representing the
  processing graph the node is participating in."
  [node]
  (.-context node))

(defn get-number-of-inputs
  "Read only.
  Returns the number of inputs feeding the node. Source nodes are defined as
  nodes having a numberOfInputs property with a value of 0."
  [node]
  (.-numberOfInputs node))

(defn get-number-of-outputs
  "Read only.
  Returns the number of outputs coming out of the node. Destination nodes — like
  AudioDestinationNode — have a value of 0 for this attribute."
  [node]
  (.-numberOfOutputs node))

(defn get-channel-count
  "Represents an integer used to determine how many channels are used when
  up-mixing and down-mixing connections to any inputs to the node. Its usage and
  precise definition depend on the value of AudioNode.channelCountMode."
  [node]
  (.-channelCountMode node))

(defn set-channel-count
  "Represents an integer used to determine how many channels are used when
  up-mixing and down-mixing connections to any inputs to the node. Its usage and
  precise definition depend on the value of AudioNode.channelCountMode."
  [node channel-count]
  (set! (.-channelCountMode node) channel-count))

(defn get-channel-count-mode
  "Represents an enumerated value describing the way channels must be matched
  between the node's inputs and outputs."
  [node]
  (.-channelCountMode node))

(defn set-channel-count-mode
  "Represents an enumerated value describing the way channels must be matched
  between the node's inputs and outputs."
  [node mode]
  (set! (.-channelCountMode node) mode))

(defn get-channel-interpretation
  "Represents an enumerated value describing the meaning of the channels. This
  interpretation will define how audio up-mixing and down-mixing will happen.
  The possible values are \"speakers\" or \"discrete\"."
  [node]
  (.-channelInterpretation node))

(defn set-channel-interpretation
  "Represents an enumerated value describing the meaning of the channels. This
  interpretation will define how audio up-mixing and down-mixing will happen.
  The possible values are \"speakers\" or \"discrete\"."
  [node interpretation]
  (set! (.-channelInterpretation node) interpretation))

; --------
; Methods:
; --------

(defn connect
  "Allows us to connect one output of this node to one input of another node."
  [src dest]
  (.connect src dest))

(defn disconnect
  "Allows us to disconnect the current node from another one it is already
  connected to."
  [node]
  (.disconnect node))
