import { Routes, Route } from "react-router-dom";

import Main from "./page/main";
import Product from "./page/Product";

import "./App.css";

function App() {
  return (
    <div className='App'>
      <Routes>
        <Route path='/' element={<Main />} />
        <Route path='/product' element={<Product />} />
      </Routes>
    </div>
  );
}

export default App;
