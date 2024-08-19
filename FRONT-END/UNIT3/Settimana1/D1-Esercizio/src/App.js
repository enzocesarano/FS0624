import logo from "./logo.svg";
import "./App.css";

import ButtonComponent from "./components/ButtonComponent";
import ButtonComponentClass from "./components/ButtonComponentsClass";
import ImageComponent from "./components/ImageComponent";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <div id="buttonContainer">
          <ButtonComponent title="Invia" css="button green" />
          <ButtonComponentClass title="Reset" css="button gray" />
        </div>
        <div>
        <ImageComponent src="https://cdn.pixabay.com/photo/2022/08/03/13/09/moon-7362632_1280.jpg" css="imgSize" alt="LUNA"/>
        </div>
      </header>
    </div>
  );
}

export default App;
