; Regex patterns are supported with a special reader macro.
;
; http://www.4clojure.com/problem/37

(def solution "ABC")

(= solution (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

