import { Routes, Route } from "react-router-dom";

import Header from "./components/header/Header";

import Home from "./page/Home";
import Product from "./page/Product";

import "./style/App.css";

function App() {
  return (
    <div className='App'>
      <Header />
      <main className='page-container'>
        <Routes>
          <Route path='/' element={<Home />} />
          <Route path='/product' element={<Product />} />
        </Routes>
      </main>
    </div>
  );
}

export default App;
