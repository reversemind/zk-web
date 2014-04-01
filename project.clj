(defproject zk-web "0.1.1-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [noir "1.3.0"]
                           [org.apache.curator/curator-framework "2.4.1"]
                           [org.apache.curator/curator-test "2.4.1"]]
            :main zk-web.server)
