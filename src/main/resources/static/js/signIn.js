    document.getElementById("signInFrom").addEventListener("submit", (event) => {
        event.preventDefault();
        const email = document.getElementById("insert_email").value;
        const password = document.getElementById("insert_pw").value;
        const name = document.getElementById("insert_name").value;
        const phone = document.getElementById("insert_phone").value;
        const data = {
            email: email,
            password: password,
            name: name,
            phone: phone
        }
        fetch("/user/singUp", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(data)
        }).then((response) => {
            if (response.ok) {
                alert("회원가입 성공");
                location.href = "/user/signIn";
            } else {
                alert("회원가입 실패");
            }
        }).catch((error) => {
            console.error("회원가입 중 에러 발생");
        });
    });