import React from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { addItem } from './CartSlice';
import './ProductList.css';

const plants = [
  {
    name: "Snake Plant",
    cost: "$10",
    image: "https://upload.wikimedia.org/wikipedia/commons/2/2b/Sansevieria_trifasciata.jpg"
  },
  {
    name: "Aloe Vera",
    cost: "$12",
    image: "https://upload.wikimedia.org/wikipedia/commons/c/cf/Aloe_vera_flower.JPG"
  },
  {
    name: "Peace Lily",
    cost: "$15",
    image: "https://upload.wikimedia.org/wikipedia/commons/3/3c/Spathiphyllum_cochlearispathum_RTBG.jpg"
  },
  {
    name: "Spider Plant",
    cost: "$8",
    image: "https://upload.wikimedia.org/wikipedia/commons/3/3e/Chlorophytum_comosum.jpg"
  },
  {
    name: "Fiddle Leaf Fig",
    cost: "$20",
    image: "https://upload.wikimedia.org/wikipedia/commons/6/6b/Ficus_lyrata.jpg"
  },
  {
    name: "Jade Plant",
    cost: "$14",
    image: "https://upload.wikimedia.org/wikipedia/commons/0/02/Crassula_ovata.jpg"
  }
];

const ProductList = ({ onViewCart }) => {
  const dispatch = useDispatch();
  const CartItems = useSelector((state) => state.cart.items);

  const handleAddToCart = (product) => {
    dispatch(addItem(product));
  };

  const calculateTotalQuantity = () => {
    return CartItems ? CartItems.reduce((total, item) => total + item.quantity, 0) : 0;
  };

  const isAddedToCart = (name) => {
    return CartItems.some(item => item.name === name);
  };

  return (
    <div className="product-grid">

      <h1 className="plantname_heading">Paradise Nursery 🌿</h1>

      <div className="cart">
        🛒 <span className="cart_quantity_count">{calculateTotalQuantity()}</span>
        <button className="product-button" onClick={onViewCart}>View Cart</button>
      </div>

      <div className="product-list">
        {plants.map((plant) => (
          <div key={plant.name} className="product-card">
            <img src={plant.image} alt={plant.name} className="product-image" />
            <h3 className="product-title">{plant.name}</h3>
            <p className="product-price">{plant.cost}</p>
            <button
              onClick={() => handleAddToCart(plant)}
              className={`product-button ${isAddedToCart(plant.name) ? 'added-to-cart' : ''}`}
              disabled={isAddedToCart(plant.name)}
            >
              {isAddedToCart(plant.name) ? "Added to Cart" : "Add to Cart"}
            </button>
          </div>
        ))}
      </div>

    </div>
  );
};

export default ProductList;