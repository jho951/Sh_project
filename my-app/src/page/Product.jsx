import React from "react";
import Card from "../components/card/Card";

import { dummy } from "../dummy";
import "../style/Product.css";

const Product = () => {
  return (
    <section className='card-wrap'>
      {dummy && dummy.map((item) => <Card key={item?.id} product={item} />)}
    </section>
  );
};

export default Product;
