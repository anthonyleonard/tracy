(ns tracy.test
  (:require [tracy.core :refer :all]))

(defn add1 [x] (+ x 1))

(defn times2 [x] (* x 2))

(defn squared [x] (* x x))

(-> 4
    add1
    times2
    squared)

(trace-ns-starts-with "tracy.test")

(untrace-ns-starts-with "tracy.test")
