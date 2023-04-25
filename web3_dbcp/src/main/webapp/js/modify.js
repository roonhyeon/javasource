/**submit 버튼 눌렀을 때 newaddr, newmobile 둘 중에 하나는 값이 있어야 한다.
 * 둘 다 빈칸일 때 submit을 막고, 메시지 띄우기
 */
document.querySelector(".btn-primary").addEventListener("click",()=>{
	location.href="listPro.jsp";
})

const newaddr=document.getElementById("newaddr");
const newmobile=document.getElementById("newmobile");

document.querySelector(".btn-success").addEventListener("click",(e)=>{
	e.preventDefault();
	
	if(newaddr.value.length > 0 || newmobile.value.length > 0){
		document.querySelector("form").submit();
		return;
	} else{
		alert("변경할 값을 입력하거나 수정을 취소하려면 목록으로 버튼 클릭");
	}
})