(ns erg.core-test
  (:require [clojure.test :refer :all]
            [erg.core :refer :all]))

(deftest erg-expand-test
  (testing "range expansion"
    (let [e #{"erg1" "erg2" "erg3"}
          re (set (expand "erg1..3" :range-server "127.0.0.1")) ]
      (is (= e re)))))

(deftest erg-empty-test
  (testing "non existent expansion should return empty vector"
    (let [re (expand "%does_not_exist" :range-server "127.0.0.1")]
      (is (empty? re)))))
