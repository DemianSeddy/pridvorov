<?php



 Function Connect($ip,$user,$pass,$namebase)
 {
   $mysqli=new mysqli($ip,$user,$pass,$namebase) or die ("Не удалось поцепиться к базе");
   if ($mysqli->connect_errno) {
   printf("Соединение не удалось: %s\n", $mysqli->connect_error);
   exit();
 }
   if (!$mysqli->set_charset("utf8")) {
        printf("Ошибка при загрузке набора символов utf8: %s\n", $mysqli->error);
       } else {
      printf("Текущий набор символов: %s\n", $mysqli->character_set_name());
   }
   return $mysqli;
 }

Function mainpage($sql_img="SELECT path,id_feature from horses"){

    echo($sql_img);
    $dir = "images";
    $mysqli=Connect("192.168.100.99","root","SQLbase123","tbase");
    echo("<table id=" . "main>");
    echo("<tr colspan=" . "2>");
    if ($result = $mysqli->query($sql_img))
        $i = 1;
        $flag = 0;
      while ($row = $result->fetch_assoc()) {
          $dir_path = $dir . "/" . $row["path"];
          if (((($i) % 5 === 0)) and $flag === 0) {
            $flag = 1;
          }
           echo("<" . "td>");
           echo("<img src='" . $dir_path . "'>" . "<ol type=" . "square>");
        /* подготавливаемый запрос, первая стадия: подготовка */
        if (!($stmt = $mysqli->prepare("SELECT name FROM feature where id=?"))) {
            echo "Не удалось подготовить запрос: (" . $mysqli->errno . ") " . $mysqli->error;
        }
        $id = $row["id_feature"];
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
        echo("<li" . ">");
        print_r($name);
        echo("</" . "li>");
        $stmt->close();
        echo("</" . "ol>");
        echo("</" . "td>");
        if ((($i) % 5 === 0) and $flag === 1) {
            echo("</" . "tr> <tr colspan='2'>");
            $flag = 0;
        }
        $i++;
    }
    $mysqli->close();
    echo("<"."/table>");
  return 1;
}
?>

