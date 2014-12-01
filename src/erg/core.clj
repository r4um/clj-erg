(ns erg.core
  (:require [clj-http.client :as http])
  (:import [java.net URLEncoder])
  (:gen-class))

(defn range_url
  "Build range URL"
  [server port range]
  (str "http://" server ":" port "/range/list?"
       (URLEncoder/encode range "UTF-8")))

(defn remove-empty-string
  "Drop empty string from a sequence"
  [s]
  (remove #(= "" %1) s))

(defn expand
  "Expand range"
  [range & {:keys [range-server range-port conn-timeout sock-timeout]
                       :or {range-server "range" range-port "8080"
                            conn-timeout 30000 sock-timeout 30000}}]
  (-> (range_url range-server range-port range)
      (http/get {:conn-timeout conn-timeout :socket-timeout sock-timeout})
      (:body)
      (clojure.string/split-lines)
      (remove-empty-string)
      (vec)))
