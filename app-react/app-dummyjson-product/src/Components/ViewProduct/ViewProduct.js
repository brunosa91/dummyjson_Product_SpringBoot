import styled from "styled-components";
import { colors } from "../../Style/GlobalStyle.js";

export const Card = styled.div`
  justify-self: center;
  transition: 0.3s;
  overflow: hidden;
  cursor: pointer;
  display: flex;
  flex-direction: column;
  align-items: center;
  color: ${colors.black};

  > img {
    margin-top: 5px;
    width: 300px;
    height: 300px;
    object-fit: cover;
    border-radius: 5px;
    box-shadow: 10px 5px 10px ${colors.black}90;
  }

  .titulo {
    font-family: ${colors.titles};
    font-weight: 300;
    font-size: 18px;
    line-height: 24px;
    width: 170px;
    word-break: break-word;
    text-align: center;
  }

  > p {
    margin-top: 10px;
    font-weight: bold;
    font-family: ${colors.text};
    font-size: 14px;
    text-align: center;
  }
`;