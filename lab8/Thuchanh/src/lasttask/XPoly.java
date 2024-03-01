package lasttask;

public final class XPoly {
	private XPoly() {
		
	}
	
	public static double sum(double... s) {
		double sum = 0;
		for(double a : s) {
			sum += a;
		}
		return sum;
	}
	
	public static double max(double... s) {
		double sum = s[0];
		for(double a : s) {
			if(a>sum)
			sum = a;
		}
		return sum;
	}
	public static double min(double... s) {
		double sum = s[0];
		for(double a : s) {
			if(a<sum)
			sum = a;
		}
		return sum;
	}
	
	public static String toUpperFirstChar(String s) {
        if (s == null || s.isEmpty()) {
            return s; // Trả về ngay nếu chuỗi null hoặc rỗng
        }

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true; // Biến cờ để chỉ định ký tự tiếp theo cần viết hoa

        for (char ch : s.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                capitalizeNext = true; // Ký tự tiếp theo của từ tiếp theo cần viết hoa
                result.append(ch); // Bao gồm dấu cách trong kết quả
            } else {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(ch)); // Viết hoa ký tự đầu tiên của từ
                    capitalizeNext = false; // Đặt cờ về false để không viết hoa các ký tự tiếp theo trong từ
                } else {
                    result.append(Character.toLowerCase(ch)); // Giữ nguyên ký tự khác
                }
            }
        }

        return result.toString();
    }
}
