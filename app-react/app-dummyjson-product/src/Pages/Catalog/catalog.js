import styled from "styled-components";
import { colors } from "../../Style/GlobalStyle.js";

export const Container = styled.main`
  width: 100%;
  height: auto;
  min-height: 180vh;
  display: flex;
  flex-direction: column;
  align-items: center;
`;

export const Caixa = styled.div`
  width: 90%;
  height: 100%;
  margin-top: 3%;
  margin-bottom: 3%;
  border-radius: 10px;
  display: flex;
  flex-direction: column;
  align-items: center;
`;

export const Catalogo = styled.div`
  width: 100%;
`;

export const Grid = styled.div`
  width: 85%;
  min-height: 150vh;
  display: grid;
  grid-template-columns: 25% 25% 25% 25%;

  grid-row-gap: 2%;
  margin-top: 7%;

  .link {
    text-decoration: none;
  }
`;
