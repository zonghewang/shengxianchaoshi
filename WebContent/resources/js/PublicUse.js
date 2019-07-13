//加载时自动全屏
$(document).click(function(){
    launchFullScreen(document.getElementById('main'));
});

function launchFullScreen(element) {

    if (element.requestFullscreen) {

        element.requestFullscreen();

    } else if (element.mozRequestFullScreen) {

        element.mozRequestFullScreen();

    } else if (element.webkitRequestFullscreen) {

        element.webkitRequestFullscreen();

    } else if (element.msRequestFullscreen) {

        element.msRequestFullscreen();

    }

};
//退出全屏
function exit() {
    exitFullscreen(document);
}
// 退出 fullscreen 
function exitFullscreen(document) {
    if(document.exitFullscreen) {
        document.exitFullscreen();
    } else if(document.mozExitFullScreen) {
        document.mozExitFullScreen();
    } else if(document.webkitExitFullscreen) {
        document.webkitExitFullscreen();
    }
}
