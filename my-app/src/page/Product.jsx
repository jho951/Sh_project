import React from "react";
import Card from "../components/card/Card";

import { dummy } from "../dummy";
import "../style/Product.css";

const Product = () => {
  return (
    <main className='product-page-container'>
      <section className='card-wrap'>
        {dummy.map((item) => (
          <Card product={item} />
        ))}
      </section>
    </main>
  );
};

export default Product;
