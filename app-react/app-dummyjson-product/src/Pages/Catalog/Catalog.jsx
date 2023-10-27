import React, { useEffect, useState } from "react";
import Input from "../../Components/InputCatalog/Input.jsx";
import ViewProduct from "../../Components/ViewProduct/ViewProduct.jsx";

import * as S from "./catalog.js";
import { Link } from "react-router-dom";
import { api } from "../../Server/Api.js";



const Catalog = () => {
    const [produtos, setProdutos] = useState([]);
  //  const [input, setInput] = useState("");
    useEffect(() => {
      api.get("http://localhost:8080/produto").then((response) => {
        setProdutos(response.data);
        console.log(produtos);
      });
    }, []);
  
    return (
      <>
        <S.Container>
          <S.Caixa>
            <Input
              onChange={(e) => {
             //   setInput(e.target.value);
              }}
            />
            <S.Grid>
            {produtos.map((item) => {
                  return (
                    <Link
                      key={item.id}
                      to={`http://localhost:8080/produto/${item.id}`}
                      className="link"
                    >
                      <ViewProduct
                        imagem={item.images}
                        nome={item.title}
                        description={item.description}

                       

                       

                      />
                    </Link>
                  );
                })}
            </S.Grid>
          </S.Caixa>
        </S.Container>
       
      </>
    );
};

export default Catalog;