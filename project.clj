(defproject re-native/action-sheet "0.3.0"
  :dependencies [[org.clojure/clojure "1.9.0-alpha10"]
                 [org.clojure/clojurescript "1.9.473"]
                 [reagent "0.6.0" :exclusions [cljsjs/react cljsjs/react-dom cljsjs/react-dom-server]]
                 [re-frame "0.9.1"]]
  :plugins [[lein-cljsbuild "1.1.4"]])
