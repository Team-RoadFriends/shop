document.getElementById('productForm').addEventListener('submit', function(e) {
    e.preventDefault();

    const product = {
        productName: document.getElementById('product_name').value,
        categoryId: document.getElementById('category_id').value,
        price: parseFloat(document.getElementById('price').value),
        stockQuantity: parseInt(document.getElementById('stock_quantity').value),
        description: document.getElementById('description').value,
        createAt: document.getElementById('created_at').value
    };


    fetch("/products", {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'  // JSON 형식으로 보내기
        },
        body: JSON.stringify(product)  // 상품 객체를 JSON 문자열로 변환하여 전송
    })
    .then(response => {
        if (response.ok) {
            alert('상품이 성공적으로 생성되었습니다.');
            document.getElementById('productForm').reset();
        } else {
            alert('상품 생성에 실패했습니다.');
        }
    })
    .catch(error => {
        console.error('Error:', error);
        alert('오류가 발생했습니다.');
    });
});
