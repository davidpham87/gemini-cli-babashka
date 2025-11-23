# Portal

## `portal.api/open`

**Signature**: `(open) (open options)`

**Docstring**:
Opens the portal UI. Returns the portal session.

**Examples**:

```clojure
;; Example 1: Open portal with default options
(portal.api/open)
;; Returns: {:session-id ...} (Map representing the session)
```

```clojure
;; Example 2: Open portal with custom theme
(portal.api/open {:theme :portal.colors/zerodark})
;; Returns: {:session-id ...}
```

## `portal.api/tap`

**Signature**: `(tap value)`

**Docstring**:
Add value to the portal. Returns the value.

**Examples**:

```clojure
;; Example 1: Tap a simple map
(portal.api/tap {:hello "world"})
;; Returns: {:hello "world"}
```

```clojure
;; Example 2: Tap a list of numbers
(portal.api/tap [1 2 3 4 5])
;; Returns: [1 2 3 4 5]
```

## `portal.api/clear`

**Signature**: `(clear)`

**Docstring**:
Clears all values from the portal window.

**Examples**:

```clojure
;; Example 1: Clear the portal
(portal.api/clear)
;; Returns: nil
```

```clojure
;; Example 2: Clear (no other arguments)
(portal.api/clear)
;; Returns: nil
```

---
**Source Code**: https://github.com/djblue/portal
