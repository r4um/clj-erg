(ns erg.core
  (:require [clj-http.client :as http])
  (:import [java.net URLEncoder])
  (:gen-class))

(defn range_url
  "Build range URL"
  [server port range ssl?]
  (str (if ssl? "https://" "http://")
       server ":"
       port
       "/range/list?"
       (URLEncoder/encode range "UTF-8")))

(defn remove-empty-string
  "Drop empty string from a sequence"
  [s]
  (remove #(= "" %1) s))

(defn expand
  "Expand range"
  [range & {:keys [range-server range-port ssl?]
            :or {range-server "range" range-port "8080" ssl? false}
            :as r}]
  (-> (range_url range-server range-port range ssl?)
      (http/get r)
      (:body)
      (clojure.string/split-lines)
      (remove-empty-string)
      (vec)))
