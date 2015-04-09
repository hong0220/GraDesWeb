/**
 * 翻页相关的js
 * @param pageNo
 * @return
 */
function jumpFront(pageNo){
    if(pageNo=="1"){
    	setElementId("pageNo",pageNo);
    	return;
    }else {
    	setElementId("pageNo",(pageNo-1));
    }
    sumbitForm("searchForm");
}

function jumpNext(pageNo,totalPages){
	if(pageNo==totalPages){
		return;
	}else {
		setElementId("pageNo",(pageNo+1));
	}
	sumbitForm("searchForm");
}

function jumpPage(pageNo) {
	setElementId("pageNo",pageNo);
	sumbitForm("searchForm");
}
