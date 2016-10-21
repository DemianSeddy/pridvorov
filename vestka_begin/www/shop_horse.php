<?php include "main_shop.html"?>
 <body>
 <form action="handler.php" method="post">
    <p><select size="5" multiple name="hero">
            <option selected>Выберите себе коня</option>
            <option value="1">Сильный</option>
            <option value="2">Скаковой</option>
            <option value="3">Лучший</option>
        </select></p>
    <input type="submit" value="ВВОД">
</form>
<br />
    <?php
        include "connect_basa.php";
        $sql="SELECT path,id_feature from horses";
        mainpage($sql);
     ?>
 </body>
</html>

