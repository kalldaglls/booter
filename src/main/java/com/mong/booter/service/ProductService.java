package com.mong.booter.service;


import com.mong.booter.entities.Product;
import com.mong.booter.repostitories.ProductRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
        private ProductRep productRep;

        @Autowired
        public void setProductRep(ProductRep productRep) {
                this.productRep = productRep;
        }

        public Product getProductById(int id) {
                return productRep.findOneById(id);
        }

        public ProductRep getProductRep() {
                return productRep;
        }

        public ProductService() {

        }
}

