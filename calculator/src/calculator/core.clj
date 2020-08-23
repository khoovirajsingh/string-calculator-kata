(ns calculator.core
  (:gen-class))
(require '[clojure.string :as str])


(defn parse-numbers [numbers]
  (str/split numbers #","))
  

(defn add [numbers]
  (if (empty? numbers) 0
    (reduce + (map #(Integer/parseInt %) (parse-numbers numbers)))))


