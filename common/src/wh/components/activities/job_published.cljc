(ns wh.components.activities.job-published
  (:require [wh.components.activities.components :as components]
            [wh.components.activities.job :as job]))

(defn card [job actor type opts]
  [components/card type
   [components/header
    [components/company-info actor]
    [components/entity-description :job type]]

   [components/description {:type :cropped} (:tagline job)]

   [job/base-card job actor type opts]])
