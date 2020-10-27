package sub4;

import java.io.FileReader;
import java.util.Properties;

/*
 * ��¥ : 2020/05/21
 * �̸� : �Ǳ��
 * ���� : ������Ƽ �÷��� �ǽ��ϱ� ���� p748
 */

public class PropertyTest {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		prop.setProperty("101", "����");
		prop.setProperty("102", "����");
		prop.setProperty("103", "�뱸");
		prop.setProperty("104", "�λ�");
		prop.setProperty("105", "����");
		
		
		System.out.println("101�� ������ : "+prop.getProperty("101"));
		System.out.println("104�� ������ : "+prop.getProperty("104"));
		
		
		// ��Ʈ���� ���� ������ �Է�
		String file = "C:\\Users\\bigdata\\Desktop\\Workspace\\file\\country.properties";
				
		FileReader fr = new FileReader(file);
		
		Properties country = new Properties();
		country.load(fr);
		
		System.out.println("101�� ���� : "+country.getProperty("101"));
		System.out.println("102�� ���� : "+country.getProperty("102"));
		System.out.println("103�� ���� : "+country.getProperty("103"));
		System.out.println("104�� ���� : "+country.getProperty("104"));
		System.out.println("105�� ���� : "+country.getProperty("105"));
	}
}