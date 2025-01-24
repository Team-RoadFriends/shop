        document.querySelector("#logInForm").addEventListener("submit", (event) => {
            event.preventDefault();
            const email = document.getElementById("insert_email").value;
            const password = document.getElementById("insert_pw").value;
            const data = {
                email: email,
                password: password
            }
            fetch("/user/login", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(data)
            }).then((response) => {
                if (response.ok) {
                    alert("로그인 성공");
                    location.href = "/user";
                } else {
                    alert("로그인 실패");
                }
            }).catch((error) => {
                console.error("로그인 중 에러 발생");
            });
        });