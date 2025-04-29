package ksmybatis.admin.product.service;

import java.util.List;

import ksmybatis.admin.product.domain.Product;

public interface ProductService {
	// 상품삭제
	boolean removeProductByCode(String productCode);
	
	// 상품 정보 수정
	void modifyProduct(Product product);
	
	// 상품 정보 조회
	Product getProductInfoByCode(String productCode);
	
	// 상품등록
	void addProduct(Product product);
	
	// 상품 목록 조회
	List<Product> getProductList();
}
