package codingtext.week05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EX0501 {
	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String, Object> map = new HashMap<>();
		map.put("no", 1);
		map.put("title", "제목1");
		map.put("cn","내용2");
		map.put("cnt", 1);
		
		list.add(map);
		
		map= new HashMap<>();
		map.put("no", 2);
		map.put("title", "제목2");
		map.put("cn", "내용2");
		map.put("cnt", 2);
		
		list.add(map);
		
//		map.put("A", 1);
//		map.put("B", 2);
//		map.put("C", 3);
//		map.put("A", 10);
		System.out.println(list.toString());
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			Map<String, Object> rs = list.get(i);
			int no = (int) rs.get("no");
			String title =(String) rs.get("title");
			String cn = (String) rs.get("cn");
			int cnt= (int) rs.get("cnt");
			System.out.printf("번호 : %d, 제목: %s, 내용: %s, 조회수: %d\n", no, title, cn, cnt);
		}
	}
}
