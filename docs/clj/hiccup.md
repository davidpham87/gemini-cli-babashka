# Hiccup

## `hiccup.core/html`

**Signature**: `(html & content)`

**Docstring**:
Render Clojure data structures to a string of HTML.

**Examples**:

```clojure
;; Example 1: Render a simple div
(hiccup.core/html [:div "Hello world"])
;; Returns: "<div>Hello world</div>"
```

```clojure
;; Example 2: Render with attributes and nesting
(hiccup.core/html [:div {:id "main"} [:span "Content"]])
;; Returns: "<div id=\"main\"><span>Content</span></div>"
```

---
**Source Code**: https://github.com/weavejester/hiccup
