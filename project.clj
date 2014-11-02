(defproject squelch "0.1.0-SNAPSHOT"
  :description "Squelch: A clojurescript web audio wrapper"
  :url "https://github.com/minasmart/squelch"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "squelch"
              :source-paths ["src"]
              :compiler {
                :output-to "squelch.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
