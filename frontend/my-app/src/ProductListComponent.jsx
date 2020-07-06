import React, {Component} from 'react';

import ProductInfo from './ProductInfoComponent';

class ProductListComponent extends Component {
    static defaultProps = {
        products:[]
    }

    render() {
        const { products } = this.props;

        const list = products.map(
            info => (
                <ProductInfo info={info}></ProductInfo>
            )
        );

        return(
            <>
            {list}
            </>
        );
    }
}

export default ProductListComponent;