import java.util.*;
import java.io.*;
// ver1
public class Test {
	public static void main(String[] args) {
		List<TempDto> list = new ArrayList<TempDto>();
		
		TempDto dto1 = new TempDto();
		dto1.id = "aa"; dto1.pw="aa1";
		list.add(dto1);

		TempDto dto2 = new TempDto();
		dto2.id = "bb"; dto2.pw="bb1";
		list.add(dto2);
		
		System.out.println("size ==> " + list.size());
	}
}


class TempDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2255251052363638417L;
	
	public String id = "";
	public String pw = "";
	
	
}