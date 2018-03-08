var arr = ["black", "white"];

/*function getRandomArbitrary(min, max) {
  return Math.random() * (max - min) + min;
}

var timerId = setTimeout(function tick() {
	var xy = Math.round(getRandomArbitrary(11,88)+11);
	el=document.getElementById("cell"+xy); 
	console.log("cell"+xy+":"+arr[(xy)%2]);
	el.style.background=arr[(xy)%2];
	timerId = setTimeout(tick, 2000);
}, 2000);*/
 
 var row=8;
 for(j=row;j>0;j--)
   {
    document.write('<div class = "parent_header">');
    document.write('<div class = "child_header_char"><h5>'+j+'</h5></div>');
    col=row+1;
    for(i=1;i<col;i++){
          document.write('<div id="cell'+j+i+'" class="child_header"><h5>'+(j+i)%2+'</h5/></div>');
       }
     document.write('<div class = "child_header_char mirrorY"><h5>'+j+'</h5></div>');
     document.write('</div>');
				  
	 }
	 
	


	for(j=row;j>0;j--){ 
		 for(i=1;i<col;i++){
		     el=document.getElementById("cell"+j+i); 
			 el.style.border="double";
			 if ((j+i)%2==0) {
				  el.style.background=arr[0];
				  el.style.fontcolor=arr[1];}
				 else 
				 {
                  el.style.background=arr[1];
				  el.style.fontcolor=arr[0];
				  }					 
			 if (j==2) {el.h5.text="&#9823";}	  
			}
		}
		
	 






