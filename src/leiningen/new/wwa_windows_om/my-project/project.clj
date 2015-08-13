(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.58"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.omcljs/om "0.9.0"]]

  :plugins [[lein-cljsbuild "1.0.6"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "{{name}}"
              :source-paths ["src"]
              :compiler {
                :output-to "{{sanitized}}.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
