import React from "react";
import { Link } from "react-router-dom";

const Main = () => {
  return (
    <div>
      <Link to='/'>홈</Link>
      <Link to='/detail'>상세페이지</Link>
    </div>
  );
};

export default Main;
