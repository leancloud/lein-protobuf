(defproject leancloud-lein-protobuf "0.5.2"
  :description "Leiningen plugin for compiling protocol buffers."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/leancloud/lein-protobuf"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [fs "1.2.0"]
                 [conch "0.2.0"]
                 [leinjacker "0.4.3"]]
  :eval-in-leiningen true
  ;; Bug in the current 1.x branch of Leiningen causes
  ;; jar to implicitly clean no matter what, wiping stuff.
  ;; This prevents that.
  :disable-implicit-clean true
  :deploy-repositories {"releases" :clojars}
  :checksum-deps true)
