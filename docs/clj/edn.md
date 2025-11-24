# EDN (clojure.edn)

## `clojure.edn/read-string`

**Signature**: `(read-string s) (read-string opts s)`

**Docstring**:
Reads one object from the string s. Returns nil when s is nil or empty.

**Examples**:

```clojure
;; Example 1: Read a map
(clojure.edn/read-string "{:a 1 :b 2}")
;; Returns: {:a 1, :b 2}
```

```clojure
;; Example 2: Read a set
(clojure.edn/read-string "#{1 2 3}")
;; Returns: #{1 3 2}
```

---
**Source Code**: https://github.com/clojure/clojure
