(set-env!
 :source-paths #{"src"}
 :dependencies '[[adzerk/boot-cljs "1.7.228-1" :scope "test"]
                 [adzerk/boot-cljs-repl   "0.3.0"] ;; latest release
                 [org.clojure/clojure         "1.8.0"]
                 [org.clojure/clojurescript   "1.8.40"]
                 [com.cemerick/piggieback "0.2.1"  :scope "test"]
                 [weasel                  "0.7.0"  :scope "test"]
                 [org.clojure/tools.nrepl "0.2.12" :scope "test"]])

(require '[adzerk.boot-cljs :refer [cljs]])
(require '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]])

(deftask dev []
  (comp (watch)
        (cljs-repl)
        (cljs)))
