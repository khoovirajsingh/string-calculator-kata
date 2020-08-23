(ns calculator.core
  (:gen-class))
(require '[clojure.string :as str])


(defn parse-numbers [numbers]
  (mapcat #(str/split % #"\n") (str/split numbers #",")))
  


(defn add [numbers]
  (if (empty? numbers) 0
    (->> numbers
         (parse-numbers)
         (map #(Integer/parseInt %))
         (reduce +))))



