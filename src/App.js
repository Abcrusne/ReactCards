import logo from "./logo.svg";
import "./App.css";
import Data from "./data.json";
import Card from "./components/ProductCard";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
      <main className="container">
        <div className="row">
          {/* get data which you need, unique keys for list  are must!
          */}
          {Data.map((post) => {
            return (
              <div className="col" key={post.id}>
                <Card title={post.title} text={post.text} />
              </div>
            );
          })}
        </div>
      </main>
    </div>
  );
}

export default App;
