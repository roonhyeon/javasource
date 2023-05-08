/**
 * 
 */
document.querySelector(".btn-success").addEventListener("click",()=>{
	modifyForm.action="list.do";
	modifyForm.submit();
});

// 삭제 버튼 클릭시 id=modifyForm 전송 to action=delete.do
const modifyForm=document.querySelector("#modifyForm");
document.querySelector(".btn-danger").addEventListener("click",()=>{
	// 비밀번호 입력 여부 확인
	const password=document.querySelector("#inputPassword");
	
	if(password.value==""){
		alert("비밀번호를 입력해주세요.");
		password.focus();
		return;
	}
	
	// 사용자가 입력한 비밀번호를 가져와서 id=password 요소의 value 값으로 세팅
	document.querySelector("#password").value=password.value;
	
	modifyForm.action="delete.do";
	modifyForm.method="post"; // 비밀번호이므로
	// console.log(modifyForm); // 내가 입력한 비밀번호가 제대로 입력되었는지 미리 콘솔에서 확인하는 코드
	modifyForm.submit();
})
