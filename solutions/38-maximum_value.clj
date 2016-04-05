; Write a function which takes a variable number of parameters
; and returns the maximum value.
;
; http://www.4clojure.com/problem/38

(fn max-val [& xs]
  {:pre [(< 0 (count xs))]}
  (reduce #(if (> %1 %2) %1 %2) xs))

(= (max-val 1 8 3 4) 8)
(= (max-val 30 20) 30)
(= (max-val 45 67 11) 67)


