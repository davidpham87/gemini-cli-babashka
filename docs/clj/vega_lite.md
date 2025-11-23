# Vega-Lite

## Usage

Vega-Lite visualizations are created by generating a Clojure map that conforms to the Vega-Lite JSON specification. This map can then be converted to JSON using the JSON library or inspected using Portal.

**Docstring**:
(Implicit) Generate a map structure matching the Vega-Lite schema.

**Examples**:

```clojure
;; Example 1: Simple Bar Chart
(def bar-chart
  {:$schema "https://vega.github.io/schema/vega-lite/v5.json"
   :data {:values [{:a "A" :b 28} {:a "B" :b 55} {:a "C" :b 43}]}
   :mark "bar"
   :encoding {:x {:field "a" :type "ordinal"}
              :y {:field "b" :type "quantitative"}}})
;; Usage: Convert to JSON or send to Portal
```

```clojure
;; Example 2: Line Chart with embedded data
(def line-chart
  {:data {:values [{:x 1 :y 10} {:x 2 :y 20} {:x 3 :y 15}]}
   :mark "line"
   :encoding {:x {:field "x" :type "quantitative"}
              :y {:field "y" :type "quantitative"}}})
```

---
**Source Code**: https://github.com/vega/vega-lite
