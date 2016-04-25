(ns edfp.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn -main [& args]
  (println "FOO")
  (println args))

(set! *main-cli-fn* -main)
