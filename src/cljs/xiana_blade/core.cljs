(ns xiana-blade.core
  (:require
    [goog.dom :as gdom]
    [reagent.core :as r]
    [reagent.dom.client :as client]))


(defonce root (client/create-root (gdom/getElement "root")))


(defn ^:dev/after-load render!
  "New react18 render"
  []
  (.render root (r/as-element [:h3 "XIANA-BLADE"])))


(defn init
  []
  (render!))
