/**
 *  검색 버튼 클릭 시 검색 기준 value, keyword 입력 여부 확인
 *  없으면 submit 막기
 */

const form=document.querySelector("form");
form.addEventListener("submit",(e)=>{
	e.preventDefault();
	const keyword=document.querySelector("[name='keyword']");
	const criteria=document.querySelector("[name='criteria']");
	
	if(keyword.value===""){
		alert("검색어를 확인해주세요.");
		keyword.focus();
		return;
	}else if(criteria.value==="n"){
		alert("검색기준을 확인해주세요.")
		criteria.focus();
		return;
	}
	form.submit();
})
