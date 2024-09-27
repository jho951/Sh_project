import { Routes, Route } from "react-router-dom";

import Home from "./page/Home";
import Product from "./page/Product";

import "./style/App.css";

function App() {
  return (
    <div className='App'>
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/product' element={<Product />} />
      </Routes>
    </div>
  );
}

export default App;
