import React, {Component} from 'react';
import axios from 'axios';

import {Container, Col, Row, Media} from "react-bootstrap";

const {useState, useRef} = React;

const ProductDetaileComponent = ({match}) => {

    const nameTag = '이름 : ';
    const idTag = '상품 번호 : ';
    const priceTag = '가격 : '
    const menuIdTag = '상품분류 : ';
    const detailsTag = '';
    const factoryTag = '제조사 : ';
    const releaseTag = '발행일 : ';

    const [id, setId] = useState(nameTag);
    const [name, setName] = useState(idTag);
    const [price, setPrice] = useState(priceTag);
    const [menuId, setMenuId] = useState(menuIdTag);
    const [details, setDetails] = useState(detailsTag);
    const [factory, setFactory] = useState(factoryTag);
    const [sale, setSale] = useState('');
    const [release, setRelease] = useState(releaseTag);
    const [hit, setHit] = useState('');

    const getProduct = () => {
        axios.get('/api/product/id?id=' + match.params.id)
        .then(res => {
            console.log(res);
            let product = res.data;
            setName(nameTag + product.name);
            setId(idTag + product.id);
            setPrice(priceTag + product.price + '원');
            setFactory(factoryTag + product.factory);
            setRelease(releaseTag + product.releaseDate);
            setDetails(detailsTag + product.details);
        })
        .catch(res => {
            console.error('로드실패');
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