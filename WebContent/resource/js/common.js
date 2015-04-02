/**
 * 公共常用js方法块
 */
function setElementId(id, idValue) {
	document.getElementById(id).value = idValue;
}

function setElementClassById(id, idClass) {
	document.getElementById(id).className = idClass;
}

function setElementInnerHTML(id, idValue) {
	document.getElementById(id).innerHTML = idValue;
}

function setElementBeVisible(id) {
	document.getElementById(id).style.visibility='visible';
}

function sumbitForm(formId) {
	turnon("loading");
	document.getElementById(formId).submit();
}

function turnoff(obj) {
	document.getElementById(obj).style.display = "none";
}
function turnon(obj) {
	document.getElementById(obj).style.display = "block";
}

function turnoffVisible(obj) {
	document.getElementById(obj).style.visibility = "hidden";
}
function turnonVisible(obj) {
	document.getElementById(obj).style.visibility = "visible";
}


function getFocus(id) {
	document.getElementById(id).focus();
}

function doAlert(message){
	window.alert(message);
}