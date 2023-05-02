package board.util;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

//  upload.jsp에서 했던 작업
public class BoardUploadUtils {
	public Map<String, String> uploadFile(HttpServletRequest request){
		
		Map<String, String> formData=new HashMap<>();
		
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		if (isMultipart) {
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			
			try {
				// Parse the request
				List<FileItem> items = upload.parseRequest(request);
				
				Iterator<FileItem> iter = items.iterator();
				
				String name=null, value=null;
				
				while (iter.hasNext()) {
					FileItem item = iter.next();
					
					// 필드명 가져오기
					name = item.getFieldName();
					
					// 일반요소-writeForm에서 name, password, content, title
					if (item.isFormField()) {
						value = item.getString("utf-8");
						
						formData.put(name, value);
					} else { // 파일요소
						value = item.getName();
						
						// 파일 저장
						if(!name.isEmpty() && item.getSize() > 0) {
							String path="c:\\upload"; // 저장할 기본 경로 지정
							
							// 고유값 생성
							UUID uuid=UUID.randomUUID();
							
							File f=new File(path+"\\"+uuid.toString()+"_"+value); // 파일 객체로 만들어 파일 형태로 저장하기 위해 => c:\\upload\\고유값_test.html 이런 식으로 뜰 거임
							
							formData.put(name, f.getName()); // 유효아이디값_파일명 형태
							
							item.write(f); // 파일이 실제로 저장되는 코드
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return formData;
	}
			
}
