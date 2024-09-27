import React from "react";
import "./card.css";

const Card = ({ product }) => {
  return (
    product && (
      <div className='product-container'>
        <h2 className='product-title'>{product.title}</h2>
        <p className='product-contents'>{product.contents}</p>
      </div>
    )
  );
};

export default Card;
