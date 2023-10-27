import React from 'react';
import { NavLink, useNavigate } from "react-router-dom";


import * as S from "./header.js"

const Header = () => {
    return (
        <S.Header>
            
            <S.Logo>
            <NavLink  to="/"
             className={({ isActive }) => `nav_link${isActive ? " active" : ""}`}>dummyjson-project</NavLink>
              </S.Logo>
              <S.Principal>
            <NavLink to="/"
             className={({ isActive }) => `nav_link${isActive ? " active" : ""}`}>CATÁLOGO</NavLink>
            </S.Principal>
            
        </S.Header>
    );
};

export default Header;