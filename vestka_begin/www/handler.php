<?php include "main_shop.html";
    echo("<body>");
    include "connect_basa.php";
    $sql="SELECT path,id_feature FROM `horses` where id_feature=".$_REQUEST["hero"];
    mainpage($sql);
    echo("</body></html>");
?>
