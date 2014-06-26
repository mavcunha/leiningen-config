{:user
 {:jvm-opts ["-Dapple.awt.UIElement=true"]          ; this doesn't work, LEIN_JVM_OPTS env variable works though.
 :plugins [[cider/cider-nrepl "0.7.0-SNAPSHOT"]     ; repl for vim-fireplace
           [lein-pprint "1.1.1"]]}}                 ; pretty prints stuff, like 'lein with-profile user pprint'
