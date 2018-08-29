<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/29
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>保存商品页面</h1>
        <form action="product_save" method="post">
            <table>
                <tr>
                    <td>商品名称:</td>
                    <td><input type="text" name="pname"></td>
                </tr>
                <tr>
                    <td>商品价格:</td>
                    <td><input type="text" name="price"></td>
                </tr>
                <tr>
                    <td colspan="1">
                        <input type="submit" value="提交">
                    </td>
                </tr>
            </table>
        </form>
</body>
</html>
