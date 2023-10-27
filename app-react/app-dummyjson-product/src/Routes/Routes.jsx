import { BrowserRouter, Routes as Switch, Route } from "react-router-dom";
import { GlobalStyle } from "../Style/GlobalStyle";
import Header from "../Components/Header/Header.jsx";

import Catalog from "../Pages/Catalog/Catalog.jsx";

const Routes = () => {
 //   const [login, setLogin] = useState(false);
  
    return (
      <BrowserRouter>
        <GlobalStyle />
        <Header /* login={login} setLogin={setLogin} *//>
        <Switch>

          <Route path="/" element={<Catalog/>} />
      
          
        </Switch>
      </BrowserRouter>
    );
  };

  export default Routes