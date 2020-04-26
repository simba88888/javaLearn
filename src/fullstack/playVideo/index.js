var myVideo = document.getElementById("videoSrc");
var pause = document.getElementById("pause");
var play = document.getElementById("play");
var addVoice = document.getElementById("addVoice");
var lowerVoice = document.getElementById("lowerVoice");
var stopa = document.getElementById("stop");
var mutea = document.getElementById("mute");
var unmute = document.getElementById("unmute");
var likeNum = document.getElementById("likeNum");
var unlikeNum = document.getElementById("unlikeNum");

function playVid() {
    if (myVideo.played) {
        myVideo.play();
        play.src = "./icons/play-fill.svg"
        pause.src = "./icons/pause.svg";
        play.disabled = 'disabled';
        stopa.src = "./icons/stop.svg";
    }
}
function pauseVid() {
    if (myVideo.paused) {
        myVideo.play();
        pause.src = "./icons/pause.svg";
        stopa.src = "./icons/stop.svg";
    } else {
        myVideo.pause();
        pause.src = "./icons/pause-fill.svg";
    }
}
function volumeUp() {
    myVideo.volume = myVideo.volume + 0.1;
    lowerVoice.src = "./icons/volume-down.svg";

    addVoice.src = "./icons/volume-up-fill.svg";
}
function volumeDown() {
    myVideo.volume = myVideo.volume - 0.1;
    lowerVoice.src = "./icons/volume-up.svg";
    lowerVoice.src = "./icons/volume-down-fill.svg";
}
function stop() {
    myVideo.currentTime = myVideo.duration;
    play.disabled = '';
    pause.disabled = 'disabled';
    stopa.src = "./icons/stop-fill.svg";
    pause.src = "./icons/pause-fill.svg";
}
function mute() {
    if (myVideo.muted) {
        myVideo.muted = false;
        mutea.src = "./icons/volume-mute.svg";
    } else {
        myVideo.muted = true;
        mutea.src = "./icons/volume-mute-fill.svg";

    }
}
function likeMe()
{
	if(typeof(Storage)!=="undefined")
	{
		if (localStorage.like)
		{
			localStorage.like=Number(localStorage.like)+1;
		}
		else
		{
			localStorage.like=1;
		}
		 likeNum.innerHTML=localStorage.like;
	}
}
function unlikeMe(){
    if(typeof(Storage)!=="undefined")
	{
		if (localStorage.unlike)
		{
			localStorage.unlike=Number(localStorage.unlike)+1;
		}
		else
		{
			localStorage.unlike=1;
		}
		 unlikeNum.innerHTML=localStorage.unlike;
	}
}
function selectChange(v){
    var myselect=document.getElementById("select");
    var index=myselect.selectedIndex ; // selectedIndex代表回的是你所选中项的index
    myVideo.src = myselect.options[index].value;
    myVideo.load();
    play.src = "./icons/play.svg"
    pause.src = "./icons/pause-fill.svg";
    stopa.src = "./icons/stop.svg";
    lowerVoice.src = "./icons/volume-up.svg";
    lowerVoice.src = "./icons/volume-down.svg";
}
function openLocalVideo(){
    
}