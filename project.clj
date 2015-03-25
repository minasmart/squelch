(defproject squelch "0.1.3-SNAPSHOT"
  :description "Squelch: A clojurescript web audio wrapper"
  :url "https://github.com/minasmart/squelch"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [com.cemerick/piggieback "0.1.3"]]

  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :plugins [[lein-cljsbuild "1.0.6-SNAPSHOT"]
            [codox "0.8.10"]]

  :source-paths ["--cljs-only--"]

  :codox {:language :clojurescript
          :sources ["src"]}

  :cljsbuild {
    :builds [{:id "squelch"
              :source-paths ["src"]
              :jar true
              :compiler {
                :output-to "squelch.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]}

  :hooks [leiningen.cljsbuild]

  :scm {:name "git"
        :url "https://github.com/minaminamina/squelch"}

  :signing {:gpg-key "F6DC191D7745EF83"}
  :deploy-repositories [["clojars" {:creds :gpg}]]

  :pom-addition [:developers [:developer
                              [:name "Mina Smart"]
                              [:url "http://github.com/minasmart"]
                              [:email "m.d.smart@gmail.com"]
                              [:timezone "-5"]]])
