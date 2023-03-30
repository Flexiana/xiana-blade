(ns xiana-blade.core
  (:require
    [goog.dom :as gdom]
    [reagent.core :as r]
    [reagent.dom.client :as client]
    ["/dark-nav" :as dark]
    ["/buttons" :as btns]))

(defonce root (client/create-root (gdom/getElement "root")))

(def dark-nav (r/adapt-react-class dark/default))
(def buttons (r/adapt-react-class btns/default))


(defn page
  []
  [dark-nav
   [buttons]])


(defn ^:dev/after-load render!
  "New react18 render"
  []
  (.render root (r/as-element [page])))


(defn init
  []
  (render!))
