/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function pq_maximizescreen(){
    //get the screen height
    var height = $(window).height();
    $('body').height(height);
}

//Make this call the last always!
$(document).ready(function(){
   //all init functions
    pq_maximizescreen();
    
    //if the window resizes
    $(window).resize(pq_maximizescreen);
});
