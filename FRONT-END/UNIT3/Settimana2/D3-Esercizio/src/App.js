import "./App.css";

import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap-icons/font/bootstrap-icons.css";

import MyNav from "./components/MyNav";
import MyFooter from "./components/MyFooter";
import MyFakeHero from "./components/MyFakeHero";
import FilmArea from "./components/FilmArea";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import MovieDetails from "./components/MovieDetails";

function App() {
  return (
    <BrowserRouter>
      <div className="bg-dark">
        <MyNav />
        <main>
          <Routes>
            <Route path='/' element={<MyFakeHero /> && <FilmArea />} />
            <Route path='/details/:id' element={<MovieDetails />} />
          </Routes>
        </main>
        <MyFooter />
      </div>
    </BrowserRouter>
  );
}

export default App;
