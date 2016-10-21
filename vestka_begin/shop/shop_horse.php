<?php
/*Оформить как фукцию в отдельный файл*/
$result = array();
$dir = "images";
$mysqli=new mysqli("192.168.100.99","root","SQLbase123","tbase") or die ("Не удалось поцепиться к базе");
if ($mysqli->connect_errno) {
    printf("Соединение не удалось: %s\n", $mysqli->connect_error);
    exit();
}

if (!$mysqli->set_charset("utf8")) {
    printf("Ошибка при загрузке набора символов utf8: %s\n", $mysqli->error);
} else {
    printf("Текущий набор символов: %s\n", $mysqli->character_set_name());
}
?>




<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" type="text/css" href="styles/main.css"/>
    <title>Лошади и кони</title>
</head>
<br />
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
<table id="main">
    <tr colspan="2">
     <?php
     $query = "SELECT path,id_feature from horses";
        if ($result = $mysqli->query($query)) {
        $i=1;
        $flag=0;
        while ($row = $result->fetch_assoc()) {
              $dir_path=$dir."/".$row["path"];
              if (((($i) % 5 === 0)) and $flag===0)  {  $flag=1;}
                echo("<"."td>");
                echo("<img src='".$dir_path."'>"."<ol type="."square>");
                /* подготавливаемый запрос, первая стадия: подготовка */
                if (!($stmt = $mysqli->prepare("SELECT name FROM feature where id=?"))) {
                    echo "Не удалось подготовить запрос: (" . $mysqli->errno . ") " . $mysqli->error;
                }
                $id=$row["id_feature"];
                if (!$stmt->bind_param("i", $id)) {
                    echo "Не удалось привязать параметры: (" . $stmt->errno . ") " . $stmt->error;
                }
                if (!$stmt->execute()) {
                    echo "Не удалось выполнить запрос: (" . $stmt->errno . ") " . $stmt->error;
                }
                /* привязываем результаты к переменным */
                $stmt->bind_result($name);
                /* выбираем данные из результата */
                $stmt->fetch();
                        echo("<li".">");
                        print_r($name);
                        echo("</"."li>");
                $stmt->close();
                echo("</"."ol>");
                echo("</"."td>");
                if ((($i) % 5===0) and $flag===1) {echo("</"."tr> <tr colspan='2'>");
                                     $flag=0;
                                     }
            $i++;}
                                                 }
       $mysqli->close();
     ?>


</table>
</html>

