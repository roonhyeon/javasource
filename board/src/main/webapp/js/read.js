/**
 * 
 */
document.querySelector(".btn-success").addEventListener("click",()=>location.href="list.do");

const form=document.querySelector("form");
form.addEventListener("submit",(e)=>{
    // 수정 클릭시 submit 기능 중지
	e.preventDefault();
	
    // readForm을 가져온 후 readForm을 modify.do로 전송
	const readForm=document.querySelector("#readForm");
	readForm.action="modify.do";
	readForm.submit();
})