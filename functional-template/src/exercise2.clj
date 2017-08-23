(ns exercise2)

(defn only-greater-than-five
  "Filter elements less or equal to five from a list."
  [list]
  (filter (fn [x] (> x 5)) list)
)





