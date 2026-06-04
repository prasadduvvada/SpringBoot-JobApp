<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Login | Prasad Job Portal</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
}

body{
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#0f172a,#1e293b,#2563eb);
    background-size:400% 400%;
    animation:gradientMove 10s ease infinite;
    font-family:'Segoe UI',sans-serif;
}

@keyframes gradientMove{
    0%{background-position:0% 50%;}
    50%{background-position:100% 50%;}
    100%{background-position:0% 50%;}
}

.login-card{
    width:420px;
    padding:40px;
    border-radius:20px;
    background:rgba(255,255,255,0.08);
    backdrop-filter:blur(15px);
    border:1px solid rgba(255,255,255,0.1);
    box-shadow:0 15px 35px rgba(0,0,0,0.3);
}

.login-title{
    color:white;
    text-align:center;
    margin-bottom:30px;
    font-weight:bold;
}

.form-label{
    color:white;
}

.form-control{
    background:rgba(255,255,255,0.1);
    border:1px solid rgba(255,255,255,0.2);
    color:white;
}

.form-control:focus{
    background:rgba(255,255,255,0.15);
    color:white;
    border-color:#38bdf8;
    box-shadow:none;
}

.btn-login{
    width:100%;
    background:linear-gradient(45deg,#3b82f6,#06b6d4);
    border:none;
    padding:12px;
    border-radius:10px;
    color:white;
    font-weight:600;
}

.btn-login:hover{
    transform:translateY(-2px);
}

.error-msg{
    color:#ff6b6b;
    text-align:center;
    margin-bottom:15px;
}

.success-msg{
    color:#51cf66;
    text-align:center;
    margin-bottom:15px;
}
</style>

</head>
<body>

<div class="login-card">

```
<h2 class="login-title">🚀 Prasad Job Portal</h2>

<% if(request.getParameter("error") != null){ %>
    <div class="error-msg">
        Invalid Username or Password
    </div>
<% } %>

<% if(request.getParameter("logout") != null){ %>
    <div class="success-msg">
        Logged out Successfully
    </div>
<% } %>

<form action="${pageContext.request.contextPath}/login" method="post">

    <div class="mb-3">
        <label class="form-label">Username</label>
        <input type="text"
               name="username"
               class="form-control"
               required>
    </div>

    <div class="mb-3">
        <label class="form-label">Password</label>
        <input type="password"
               name="password"
               class="form-control"
               required>
    </div>

    <button type="submit" class="btn btn-login">
        Sign In
    </button>

</form>
```

</div>

</body>
</html>
