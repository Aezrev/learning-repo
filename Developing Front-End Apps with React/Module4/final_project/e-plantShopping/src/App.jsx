import React, { useState } from "react";
import ProductList from "./ProductList";
import CartItem from "./CartItem";
import './App.css';

function App() {

  const [showCart, setShowCart] = useState(false);

  return (

    <div>

      {showCart ? (
        <CartItem onContinueShopping={() => setShowCart(false)} />
      ) : (
        <ProductList onViewCart={() => setShowCart(true)} />
      )}

    </div>

  );
}

export default App;