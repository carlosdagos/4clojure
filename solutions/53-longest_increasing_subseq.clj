; Given a vector of integers, find the longest consecutive sub-sequence of
; increasing numbers. If two sub-sequences have the same length,
; use the one that occurs first. An increasing sub-sequence must
; have a length of 2 or greater to qualify.
;
; http://www.4clojure.com/problem/53

(fn longest-increasing-subseq
  [xs]
  (->>
     xs
     ; Build lists of strictly increasing values
     ((fn [coll]
       (let [switch (reductions = true (map < coll (rest coll)))]
         (map (partial map first) (partition-by second (map list coll switch))))))
     ; Filter out single lists
     (filter #(< 1 (count %)))
     ; Keep the first occurrence
     (reduce #(if (< (count %) (count %2)) %2 %) [])
     ; Transform to vector
     (vec)))

(= (longest-increasing-subseq [1 0 1 2 3 0 4 5]) [0 1 2 3])
(= (longest-increasing-subseq [5 6 1 3 2 7]) [5 6])
(= (longest-increasing-subseq [2 3 3 4 5]) [3 4 5])
(= (longest-increasing-subseq [7 6 5 4]) [])
