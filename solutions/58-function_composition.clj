; Write a function which allows you to create function compositions.
; The parameter list should take a variable number of functions, and
; create a function that applies them from right-to-left.
;
; http://www.4clojure.com/problem/58

(fn compose [& fns]
  (fn [& args]
    (first
      (reduce #(vector (apply %2 %1)) args (reverse fns)))))

(= [3 2 1] ((compose rest reverse) [1 2 3 4]))
(= 5 ((compose (partial + 3) second) [1 2 3 4]))
(= true ((compose zero? #(mod % 8) +) 3 5 7 9))
(= "HELLO" ((compose #(.toUpperCase %) #(apply str %) take) 5 "hello world"))
