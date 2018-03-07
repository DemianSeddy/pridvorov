<?php

//<img src="http://www.cyberforum.ru/html/html/..." class="img-responsive" alt="Адаптивное изображение">
//<img src="http://www.cyberforum.ru/html/html/..." class="img-rounded" alt="Изображение со скруглёнными краями">
//<img src="http://www.cyberforum.ru/html/html/..." class="img-circle" alt="Круглое изображение">
//<img src="http://www.cyberforum.ru/html/html/..." class="img-thumbnail" alt="Миниатюра изображения">

echo '<html>';
    echo '<head>';
	   echo '<meta http-equiv="Content-Type" content="text/html; charset=utf-8">';
	   //<!-- Bootstrap CSS -->;
       echo ' <link href="css/bootstrap.min.css" rel="stylesheet">';
	   echo ' <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">';
	   echo '<title>Галлерея</title>';
	   echo '<style>';
	    echo 'body {background: #c7b39b url(img/1.jpg); color: #fff; /* Цвет текста }';
	   echo '</style>';
    echo '</head>';
    echo '<div class="container">';	
    echo '<body>';
				 $menupunkt=array("Главное меню","Мониторинг","Отчеты","Вход");
				 $color=array("btn btn-primary","btn btn-success","btn btn-info","btn btn-warning");
				 $menuitems=array("Новости","Правила"); 
				 
				 echo'<div class="container-fluid">';
				 for($i=0;$i<count($menupunkt);$i++){
							echo '<div class="btn-group">';
							echo '  <button type="button" class="'.$color[$i].' dropdown-toggle" data-toggle="dropdown">';
							echo $menupunkt[$i];
							echo '<span class="caret"></span></button>';
							for($j=0;$j<count($menuitems);$j++){
								echo '<ul class="dropdown-menu">';
								   echo '<li><a class="dropdown-item" href="#">'.$menuitems[i].'</a></li>';
								echo '</ul>';
							}
							echo '</div>';
				 }
				 echo '</div>';
				//echo '</nav>';
			//echo '</div>';
         echo '<div class="container">';            
	      for($i=2;$i<14;$i++)
		  {			  
		      echo '<img src=img/'.$i.'.jpg class="img-responsive" width="225" height="190" border="2"/>';
		  }
         echo '</div>';	
			
			
	   //<!-- Optional JavaScript -->
         //<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		     echo '<script src="http://code.jquery.com/jquery-latest.js"></script>';
             echo '<script src="js/bootstrap.min.js"></script>';
			
    echo '</body>';
	echo '</div>';
echo '</html>';
	   
	   
?>
