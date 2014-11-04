(ns squelch.audio-context)

; -------------
; Constructors:
; -------------

(defn new-audio-context
  "Create a new audio context"
  []
  (let [ctor (or (.-AudioContext js/window) (.-webkitAudioContext js/window))]
    (ctor.)))

; -----------
; Properties:
; -----------

(defn get-current-time
  "Read only.
  Returns a double representing an ever-increasing hardware time in seconds
  used for scheduling. It starts at 0 and cannot be stopped, paused or reset."
  [ctx]
  (.-currentTime ctx))

(defn get-destination
  "Read only.
  Returns an AudioDestinationNode representing the final destination of all
  audio in the context. It can be thought of as the audio-rendering device."
  [ctx]
  (.-currentTime ctx))

(defn get-listener
  "Read only.
  Returns the AudioListener object, used for 3D spatialization."
  [ctx]
  (.-listener ctx))

(defn get-sample-rate
  "Read only.
  Returns a float representing the sample rate (in samples per second) used by
  all nodes in this context. The sample-rate of an AudioContext cannot be
  changed."
  [ctx]
  (.-sampleRate ctx))

(defn get-moz-audio-channel-type
  "Read only.
  Used to return the audio channel that the sound playing in an AudioContext
  will play in, on a Firefox OS device."
  [ctx]
  (.-mozAudioChannelType ctx))

; --------
; Methods:
; --------

(defn create-buffer
  "Creates a new, empty AudioBuffer object, which can then be populated by data
  and played via an AudioBufferSourceNode."
  [ctx number-of-channels length sample-rate]
  (.createBuffer ctx number-of-channels length sample-rate))

(defn create-buffer-source
  "Creates an AudioBufferSourceNode, which can be used to play and manipulate
  audio data contained within an AudioBuffer object. AudioBuffers are created
  using AudioContext.createBuffer or returned by AudioContext.decodeAudioData
  when it successfully decodes an audio track."
  [ctx]
  (.createBufferSource ctx))

(defn create-media-element-source
  "Creates a MediaElementAudioSourceNode associated with an HTMLMediaElement.
  This can be used to play and manipulate audio from <video> or <audio>
  elements."
  [ctx media-element]
  (.createMediaElementSource ctx media-element))

(defn create-media-stream-source
  "Creates a MediaStreamAudioSourceNode associated with a MediaStream
  representing an audio stream which may come from the local computer microphone
  or other sources."
  [ctx media-stream]
  (.createMediaStreamSource ctx media-stream))

(defn create-media-stream-destination
  "Creates a MediaStreamAudioDestinationNode associated with a MediaStream
  representing an audio stream which may be stored in a local file or sent to
  another computer."
  [ctx]
  (.createMediaStreamDestination ctx))

(defn create-script-processor
  "Creates a ScriptProcessorNode, which can be used for direct audio processing
  via JavaScript."
  ([ctx]
   (.createScriptProcessor ctx))

  ([ctx buffer-size]
   (.createScriptProcessor ctx buffer-size))

  ([ctx buffer-size number-of-input-channels]
   (.createScriptProcessor ctx buffer-size number-of-input-channels))

  ([ctx buffer-size number-of-input-channels number-of-output-channels]
   (.createScriptProcessor
     ctx buffer-size number-of-input-channels number-of-output-channels)))

(defn create-analyser
  "Creates an AnalyserNode, which can be used to expose audio time and frequency
  data and for example to create data visualisations."
  [ctx]
  (.createAnalyser ctx))

(defn create-biquad-filter
  "Creates a BiquadFilterNode, which represents a second order filter
  configurable as several different common filter types: high-pass, low-pass,
  band-pass, etc."
  [ctx]
  (.createBiquadFilter ctx))

(defn create-channel-merger
  "Creates a ChannelMergerNode, which is used to combine channels from multiple
  audio streams into a single audio stream."
  ([ctx]
   (.createChannelMerger ctx))

  ([ctx number-of-inputs]
   (.createChannelMerger ctx number-of-inputs)))

(defn create-channel-splitter
  "Creates a ChannelSplitterNode, which is used to access the individual
  channels of an audio stream and process them separately."
  ([ctx]
   (.createChannelSplitter ctx))

  ([ctx number-of-outputs]
   (.createChannelSplitter ctx number-of-outputs)))

(defn create-convolver
  "Creates a ConvolverNode, which can be used to apply convolution effects to
  your audio graph, for example a reverberation effect."
  [ctx]
  (.createConvolver ctx))

(defn create-delay
  "Creates a DelayNode, which is used to delay the incoming audio signal by a
  certain amount. This node is also useful to create feedback loops in a Web
  Audio API graph."
  ([ctx]
   (.createDelay ctx))
  ([ctx max-delay-time]
   (.createDelay ctx max-delay-time)))

(defn create-dynamics-compressor
  [ctx]
  "Creates a DynamicsCompressorNode, which can be used to apply acoustic
  compression to an audio signal."
  (.createDynamicsCompressor ctx))

(defn decode-audio-data
  "Asynchronously decodes audio file data contained in an ArrayBuffer. In this
  case, the ArrayBuffer is usually loaded from an XMLHttpRequest's response
  attribute after setting the responseType to arraybuffer. This method only
  works on complete files, not fragments of audio files."
  ([ctx audio-data]
   (.decodeAudioData ctx audio-data))

  ([ctx audio-data success-fn]
   (.decodeAudioData ctx audio-data success-fn))

  ([ctx audio-data success-fn error-fn]
   (.decodeAudioData ctx audio-data success-fn error-fn)))

(defn create-gain
  "Creates a GainNode, which can be used to control the overall volume of the
  audio graph."
  [ctx]
  (.createGain ctx))

(defn create-oscillator
  "Creates an OscillatorNode, a source representing a periodic waveform. It
  basically generates a tone."
  [ctx]
  (.createOscillator ctx))

(defn create-panner
  "Creates a PannerNode, which is used to spatialise an incoming audio stream
  in 3D space."
  [ctx]
  (.createPanner ctx))

(defn create-periodic-wave
  "Creates a PeriodicWave, used to define a periodic waveform that can be used
  to determine the output of an OscillatorNode."
  [ctx real imag]
  (.createPeriodicWave ctx))

(defn create-wave-shaper
  "Creates a WaveShaperNode, which is used to implement non-linear distortion
  effects."
  [ctx]
  (.createWaveShaper ctx))
