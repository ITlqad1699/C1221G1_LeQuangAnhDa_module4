<%--
  Created by IntelliJ IDEA.
  User: lqad1
  Date: 5/4/2022
  Time: 8:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
  <head>
    <title>calculator</title>
    <style>
      *{
        margin: 0;
        padding: 0;
        box-sizing: border-box;
      }
      body{
        background-color:rgb(13,0,31) ;
      }
      .container{
        margin: 10px auto;
        width: 200px;
      }
      .screen{
        background-color: azure;
        width: 100%;
        height: 50px;
        position: relative;
      }
      .keyboard{
        width: 100%;
        display: grid;
        grid-template-columns: 1fr 1fr 1fr 1fr ;
      }
      .item{
        height: 50px;
        outline: none;
        border: 0.1px solid rgb(212,212,212);
      }
      .item:hover{
        background: rgb(182,182,182);
        cursor: pointer;
      }
      .item1{
        grid-column: 1/span 2;
        background: #c63d83;
      }
      .item1:hover{
        background-color: #b83476;
      }
      .item2{
        background-color: #d57ca5;
      }
      .item2:hover{
        background-color: #b83476;
      }
      .screen .input{
        position: absolute;
        top: 0;
        right: 5px;
        font-size: 40px;
        coloer: rgb(63, 63, 63);
        z-index: 222;
      }
    </style>
  </head>
  <body>
      <div class="container">
        <div class="screen">
          <span class="overlay"></span>
          <span class="input" name="input"></span>
        </div>
        <div class="keyboard">
          <button class="item item1">AC</button>
          <button class="item item2">DEL</button>
          <button class="item item3" name="operator">+</button>
          <button class="item item4">7</button>
          <button class="item item5">8</button>
          <button class="item item6">9</button>
          <button class="item item7" name="operator">-</button>
          <button class="item item8">4</button>
          <button class="item item9">5</button>
          <button class="item item10">6</button>
          <button class="item item11" name="operator">*</button>
          <button class="item item12">1</button>
          <button class="item item13">2</button>
          <button class="item item14">3</button>
          <button class="item item15" name="operator">/</button>
          <button class="item item16">0</button>
          <button class="item item17">00</button>
          <button class="item item18">.</button>
          <button class="item item19">=</button>
        </div>
      </div>
  </body>
<script>

</script>
</html>
