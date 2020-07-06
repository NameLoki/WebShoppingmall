import React, {Component} from 'react';
import axios from 'axios';

import {Container, Col, Row, Media} from "react-bootstrap";

const {useState, useRef} = React;

const ProductDetaileComponent = ({match}) => {

    const [id, setId] = useState('');
    const [name, setName] = useState('');
    const [price, setPrice] = useState('');
    const [menuId, setMenuId] = useState('');
    const [details, setDetails] = useState('');
    const [factory, setFactory] = useState('');
    const [sale, setSale] = useState('');
    const [release, setRelease] = useState('');
    const [hit, setHit] = useState('');

    const getProduct = () => {
        axios.get('/api/product/id?id=' + match.params.id)
        .then(res => {
            console.log(res);
            let product = res.data;
            setName('이름 : ' + product.name);
            setId('상품 번호 : ' + product.id);
            setPrice('가격 : ' + product.price + '원');
            setFactory('제조사 : ' + product.factory);
            setRelease('발행일 : ' + product.releaseDate);
            setDetails(product.details);

        })
        .catch(res => {
            console.error(res);
        })
    }

    getProduct();
    
    return (
    <>
    <Media>
        <img
        width={256}
        height={256}
        className="align-self-start mr-3"></img>
        <Media.Body>
            <Container>
                <Row>
                    <Col>{name}</Col>
                </Row>
                <Row>
                    <Col>{id}</Col>
                </Row>
                <Row>
                    <Col>{price}</Col>
                </Row>
                <Row>
                    <Col>{factory}</Col>
                </Row>
                <Row>
                    <Col>{release}</Col>
                </Row>
                <Row>
                    <Col>{details}</Col>
                </Row>
            </Container>
        </Media.Body>
    </Media>
    </>
    );
}

export default ProductDetaileComponent;