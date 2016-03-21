; Sets are collections of unique values.
;
; http://www.4clojure.com/problem/8

(def solution #{:a :b :c :d})
(= solution (set '(:a :a :b :c :c :c :c :d :d)))
(= solution (clojure.set/union #{:a :b :c} #{:b :c :d}))
