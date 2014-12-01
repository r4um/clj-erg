# clj-erg [![Build Status](https://travis-ci.org/r4um/clj-erg.svg)](https://travis-ci.org/r4um/clj-erg)

Clojure [grange](https://github.com/xaviershay/grange-server) client library.

## Leiningen

!["Leiningen version"](https://clojars.org/erg/latest-version.svg)

## Usage

```clojure
user=> (require '[erg.core :as e])
nil
user=> (e/expand "test1..3" :range-server "127.0.0.1")
["test1" "test2" "test3"]
```

## License

Copyright © 2014 Pranay Kanwar

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
