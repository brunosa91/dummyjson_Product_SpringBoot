import styled from "styled-components";
import { colors } from "../../Style/GlobalStyle";

export const Header = styled.header`
  width: 100%;
  height: 75px;
  background-color: ${colors.white};
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 5px;
  position: sticky;
  z-index: 2;

 

  

  .nav_link {
    color: ${colors.black};
    font-family: ${colors.text};
    text-decoration: none;
    font-size: 16px;
  }

  .nav_link:hover {
    color: ${colors.red};
    transition: all 0.5s;
  }

  .active {
    font-weight: 600;
    color: ${colors.black};
  }
`;

export const Logo = styled.div`
  width: 50%;
  height: 75px;
  background-color: ${colors.orange};

  color: ${colors.blue};
  font-family: ${colors.white};
  font-size: 13px;
  display: flex;
  justify-content:  space-around;
  align-items: center;

  `;

  export const Principal = styled.div`
  width: 50%;
  height: 75px;
  color: ${colors.white};
  font-family: ${colors.white};
  background-color: ${colors.contrast};
  font-size: 13px;
  display: flex;
  justify-content: space-around;
  align-items: center;
  `;

  