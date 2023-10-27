import React from "react";
import * as S from "./ViewProduct.js";

function ViewProduct(props) {
  return (
    <S.Card>
      <img src={props.imagem} alt="" />
      <p className=".titulo">{props.nome}</p>
      <p>{props.description}</p>
    </S.Card>
  );
}

export default ViewProduct;