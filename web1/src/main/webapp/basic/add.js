/**
 * scriptsource-form3 참고
 * add.html 사용자 입력 값 검증하기(숫자인지 아닌지)
 * num1, num2 숫자인지 확인하기
 * 
 * submit 버튼이므로 폼 전송 못하게 막기
 * 둘 다 숫자가 아니하면 경고창 띄우기
 * 둘 다 숫자라면 submit
 * 
 */
document.querySelector("form").addEventListener("submit",(e)=>{
	e.preventDefault();
const num1=document.getElementById("num1");
const num2=document.getElementById("num2");
if(num1.value=="" || isNaN(num1.value)){
	alert("num1 입력값을 확인해주세요.")
	num1.select();
	return; // document.querySelector("form").submit(); 을 실행시키지 않고 다시 돌아가라! 라는 의미
}else if(isNaN(num2.value) || num2.value==""){
	alert("num2 입력값을 확인해주세요.")
	num2.select();
	return;
}
document.querySelector("form").submit();
});