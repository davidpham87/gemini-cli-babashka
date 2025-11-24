# Malli

## `malli.core/validate`

**Signature**: `(validate schema value)`

**Docstring**:
Returns true if the value is valid according to the schema, false otherwise.

**Examples**:

```clojure
;; Example 1: Validate a simple integer
(malli.core/validate :int 10)
;; Returns: true
```

```clojure
;; Example 2: Validate a map structure
(malli.core/validate [:map [:x :int] [:y :int]] {:x 10 :y 20})
;; Returns: true
```

## `malli.core/explain`

**Signature**: `(explain schema value)`

**Docstring**:
Returns an explanation of why the value is invalid, or nil if the value is valid.

**Examples**:

```clojure
;; Example 1: Explain an invalid integer
(malli.core/explain :int "not an int")
;; Returns: {:schema :int, :value "not an int", :errors ...}
```

```clojure
;; Example 2: Explain an invalid map
(malli.core/explain [:map [:x :int]] {:x "string"})
;; Returns: {:schema [:map [:x :int]], :value {:x "string"}, :errors ...}
```

---
**Source Code**: https://github.com/metosin/malli
