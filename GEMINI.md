# Gemini CLI Extension: Clojure/Babashka

You are operating in a Clojure/Babashka environment. This environment allows you to execute dynamic and succinct Clojure code to generate insights and perform tasks.

## Capabilities

*   **Execution**: You can run Clojure code.
*   **REPL**: A nREPL server is available for interactive evaluation.

## Custom Commands

### `/clj:nrepl`

Manage the nREPL server. These commands are namespaced.

*   `/clj:nrepl:start`: Start the nREPL server.
*   `/clj:nrepl:stop`: Stop the nREPL server.
*   `/clj:nrepl:restart`: Restart the nREPL server.

### `/run`

Execute a string of Clojure code in the nREPL server and return the result. The code to be executed should be passed as an argument.

Example: `/run "(+ 1 1)"`

## Tool Discovery

The following functions are available for discovering new tools and namespaces.

*   `(create-namespace 'my-new-namespace)`: Creates a new namespace.
*   `(list-publics 'clojure.core)`: Lists the public vars in a namespace.
*   `(function-doc 'clojure.core 'map)`: Gets the documentation for a function in a namespace.

## Available Libraries

The following libraries are available for data transformation and analysis:

*   **Portal** (`djblue/portal`): A UI for inspecting values.
*   **Malli** (`metosin/malli`): Data validation and specification.
*   **Datascript**: An immutable in-memory database and Datalog query engine.
*   **HoneySQL** (`com.github.seancorfield/honeysql`): SQL generation from Clojure data structures.
*   **Data Converters**:
    *   **JSON**: `org.babashka/json` or `cheshire`.
    *   **YAML**: `clj-yaml` (built-in for Babashka).
    *   **EDN**: Standard Clojure EDN support.
*   **Hiccup**: HTML generation using Clojure vectors.
*   **HTTP**: `http-kit` or `babashka.http-client` for making requests and serving content.
*   **Vega-Lite**: Support for generating Vega-Lite visualizations (via JSON/EDN data structures).

Use these libraries to efficiently solve problems by writing and executing Clojure code.
