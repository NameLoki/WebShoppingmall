import React, {Component} from 'react';
import axios from 'axios';

import ProductList from './ProductListComponent';

const {useState, useRef} = React;

const ProductComponent = ({match}) => {

    const [products, setProducts] = useState([]);
    
    const api = '/api/product/menuId?menuId=' + match.params.menuId;

    const getProduct = () => {

        axios.get(api)
        .then(res => {
            setProducts(res.data);
        })
        .catch(res => {
            console.log('실행실패');
        })
    } 

    getProduct();

    return (
        <>
            <ProductList products={products}></ProductList>
        </>
    )
}

export default ProductComponent;