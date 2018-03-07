var arr = ["black", "white"];
 
 var row=8;
 for(j=row;j>0;j--)
   {
    document.write('<div class = "parent_header">');
    document.write('<div class = "child_header_char"><h5>'+j+'</h5></div>');
    col=row+1;
    for(i=1;i<col;i++)
       {if ((j+i)%2==1) {
               var img="boxchessblack.png";
				  }
          else { 
               var img="boxchesswhite.png";
          }
          //document.write('<div name="cell'+j+i+'" class="child_header"><h5>'+(j+i)%2+'</h5/></div>');
		  //Вообще хотел вот так
		  //document.getElementById("cell12").style.background="+arr[(j+i)%2]+";
		  
          document.write('<div id="cell'+j+i+'" name="cell'+j+i+'" class="child_header"><img src="img/chess/'+img+'"/></div>');
		  
          //if (j==2){
          //    var imgfig='wP.png';
          //    document.write('<div id="cell'+j+i+'" class="child_header"><img src="img/chess/'+imgfig+'"/></div>');
          //}
       }
     document.write('<div class = "child_header_char mirrorY"><h5>'+j+'</h5></div>');
     document.write('</div>');
				  
	 }
      	 console.log(document.getElementById("cell12").style.border); 
	 






