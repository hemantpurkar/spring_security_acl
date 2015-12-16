<html>
<body>
<head>
<style>
#login_form {
    position: absolute;
    top: 20%;
    left: 30%;
    right: 30%;
    bottom: 20%;
    font-size: 18px;
}

#f1 {
    background-color: #ccc;
    border-style: solid;
    border-width: 1px;
}
.f1_label {
    white-space: nowrap;
}

</style>
</head>
<div id="login_form">
    <form action="postlogin" method="post"> 
        <table>
            <tr>
                <td class="f1_label">User Name </td><td>: <input type="text" name="j_username" value="" />
                </td>
            </tr>
            <tr>
                <td class="f1_label">Password  </td><td>: <input type="password" name="j_password" value=""  />
                </td>
            </tr>
            <tr>
            	<td class="f1_label"></td>
                <td>
                    <input type="submit" name="login" value="Log In" style="font-size:18px; " />
                </td>
            </tr>
        </table>
    </form> 
</div>
</body>
</html>