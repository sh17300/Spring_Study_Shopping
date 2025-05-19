CREATE TABLE product{
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2)NOT NULL,
    stock_quantity NOT NULL
};

CREATE TABLE cart_item{
    id BIGINT AUTO_INCREMENT PRIMAY KEY,
    product_id BIGINT NOT NULL,
    quantity INT NOT NULL,
    FOREIGN KEY (product_id) REFERENCE product(id)
    };

CREATE TABLE orders{
    id BIGINT AUTO_INCREMENT PRIMAY KEY,
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total_price DECIMAL(10, 2) NOT NULL
    };

CREATE TABLE order_item{
    id BIGINT AUTO_INCREMENT PRIMAY KEY,
    order_id BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    quantity INT NOT NULL,
    price DECIMAL(10, 2)NOT NULL,
    FOREIGN KEY (order_id) REFERENCE orders(id),
    FOREIGN KEY (product_id) REFERENCE product(id)
    }



