import React from "react";
import "./header.css";
import { header } from "../../constants/constants";
import { Link } from "react-router-dom";

const Header = () => {
  return (
    <header className='header-contaier'>
      <ul className='header-element'>
        {header &&
          header.map((item) => (
            <li key={item?.id}>
              <Link to={`/${item?.id}`}>
                <span className='header-element-title'>{item?.title}</span>
              </Link>
            </li>
          ))}
      </ul>
    </header>
  );
};

export default Header;
