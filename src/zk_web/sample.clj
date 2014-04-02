(ns zk-web.sample
  (:require [zk-web.zk :as zk]
            [zk-web.conf :as conf]
            [clojure.string :as str])
  (:use [zk-web.util]
        ))

(defonce conf (conf/load_conf_strait))
(defonce zookeeper-address (get conf :default-node))

(defn zk-cli-create [address]
  (zk/mk-zk-cli address))

(defn- zk-cli-local []
  (zk-cli-create zookeeper-address))

(defn node-stat [path]
  (println (str "Going to use PATH:" path))
  (zk/stat (zk/mk-zk-cli zookeeper-address) path)
  )

(println conf)
(println (get conf :default-node))

;(println
;  (node-stat "/baloo/services/HYPERGATE.ADDRESS"))

(println
  (str (node-stat "/baloo/services/HYPERGATE.ADDRESS") "")
  )