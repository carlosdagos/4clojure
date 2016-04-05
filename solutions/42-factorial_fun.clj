; Write a function which calculates factorials.
;
; http://www.4clojure.com/problem/42

; Shamelessly stolen from Structure and Interpretation of
; Computer Programs, with some tweaks for BigInt
(fn fac-n [n]
  ((fn [product counter max-count]
     (if (> counter max-count)
         product
         (recur (apply *' [counter product])
                (inc counter)
                max-count)))
   1 1 n))

(= (fac-n 1) 1)
(= (fac-n 3) 6)
(= (fac-n 5) 120)
(= (fac-n 8) 40320)
