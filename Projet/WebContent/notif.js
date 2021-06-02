/**
 * 
 */
window.onload = setInterval(checkForNotifications, 10000);
function checkForNotifications(){
    $.ajax({
        url: "http://localhost:8080/Proj_app/Session?num=3&op=consulter&mail=sa1", 
        type: "GET",
        success: function( notification ) {
            //Check if any notifications are returned - if so then display alert
        },
        error: function(data){
            //handle any error 
        }
    });
}