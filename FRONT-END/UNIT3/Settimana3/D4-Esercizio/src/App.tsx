import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import MyNav from "./components/MyNav";
import "bootstrap/dist/css/bootstrap.min.css";
import AreaArticle from "./components/AreaArticle";
import Details from "./components/Details";

function App() {
  return (
    <BrowserRouter>
      <div className="bg-dark">
        <header>
          <MyNav />
        </header>
        <Routes>
          <Route path="/" element={<AreaArticle />} />
          <Route path="/details/:id" element={<Details />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;
