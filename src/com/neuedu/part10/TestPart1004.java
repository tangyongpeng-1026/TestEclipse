package com.neuedu.part10;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//��Ҫ��ʼ��һ����Ź�˾����Ա���ļ���
//Ӧ���и�ȷ��Ա����Ϣ��¼�Ļ���
//Ա����ǩ����ǩ����ϢҪ��������������һ�������У��Ƿ�򿨣���¼��ʱ�䣬���Բ�ѯ7�죬һ��ǩ��ǩ��Ϊһ�죩
//ǩ��ǩ��֮���˳�����¼����




public class TestPart1004 {

	public static void main(String[] args) {
		HashMap<String,Employee> employees = getAllEmployee();//��ʼ����˾Ա��
		outer:while(true){
			Scanner scanner= new Scanner(System.in);
			System.out.println("����������Ա�����");
			String checkId = scanner.nextLine();
			//Ա��У��
			Employee employee = employees.get(checkId);
			if(employee == null){
				System.out.println("�޴�Ա�������ܵ���");
				continue outer;
			}else{				
				//���й��ܴ���
				String msg = operationSystem(employee);
				System.out.println(msg);
				if(msg.contains("�Ѿ�ǩ��")){
					continue outer;
				}else if(msg.contains("�Ѿ�ǩ��")){
					continue outer;
				}else if(msg.equals("��Ա����δǩ��������ǩ��")){
					String msg2 = operationSystem(employee);
					if(msg2.equals("��Ա����δǩ��������ǩ��")){
						System.out.println("�쳣�����ǳ�");
						continue outer;
					}else{
						if(msg2.contains("�Ѿ�ǩ��")){
						     continue outer;
					    }else if(msg2.contains("�Ѿ�ǩ��")){
						     continue outer;
					    }else if(msg2.equals("�˳���¼")){
						     continue outer;
					    }else if(msg2.contains("�˳�ϵͳ")){
						     break outer;
					    }					
					}
				}else if(msg.equals("�˳���¼")){
					continue outer;
				}else if(msg.contains("�����˳�ϵͳ")){
					break outer;
				}
				
			}
						
		}
		





	}
	private static String operationSystem(Employee employee){
		Scanner sc= new Scanner(System.in);
		System.out.println("1-----------ǩ��");
		System.out.println("2-----------ǩ��");
		System.out.println("3-----------��ѯ����Ϣ");
		System.out.println("4-----------�˳�");
		String type = sc.nextLine();
		String msg ="";//��Ϣ�����ʶ
		ArrayList<CheckInRecord> arrayList = employee.getArrayList();
		int size = arrayList.size();
		
		if("1".equals(type)){//ǩ��			
			//ȡ����һ���ļ�¼���ж��Ƿ�ǩ��
			if(size == 0){//û�м�¼
				arrayList.add(new CheckInRecord("ǩ��", getNowTime(), null));//�½�һ��ǩ����¼
				msg="��Ա���Ѿ�ǩ��";
				return msg;
			}else{//�м�¼
				  //�����7����¼
			    if(size == 7){//������ϳ��ȵ���7��ȥ����һ������
			    	arrayList.remove(0);
			    }	
				CheckInRecord checkInRecord = arrayList.get(arrayList.size()-1);//��ȡ����һ����¼����
				String checkFlag = checkInRecord.getCheckFlag();
				
				if("ǩ��".equals(checkFlag)){//�Ѿ�ǩ�õ��������ٴ�ǩ��
					msg ="��Ա���Ѿ�ǩ���������ٴ�ǩ��";
					return msg;
				}else if("δǩ��".equals(checkFlag)){
					//�½�һ��ǩ����¼
					arrayList.add(new CheckInRecord("ǩ��", getNowTime(), null));
					msg="��Ա���Ѿ�ǩ��";
					return msg;
				}
			}			
		}else if("2".equals(type)){//ǩ��
			if(size == 0){//û�м�¼��ʱ��
				msg ="��Ա����δǩ��������ǩ��";
				return msg;
			}else{//�м�¼��ʱ��
				CheckInRecord checkInRecord = arrayList.get(size-1);
				String checkFlag = checkInRecord.getCheckFlag();
				
				if("ǩ��".equals(checkFlag)){//�Ѿ�ǩ�õ�������ǩ��
					checkInRecord.setCheckOutTime(getNowTime());
					checkInRecord.setCheckFlag("δǩ��");
					msg ="��Ա���Ѿ�ǩ��";
					return msg;
				}else if("δǩ��".equals(checkFlag)){
					//�Ѿ�ǩ������
					msg ="��Ա���Ѿ�ǩ�ˣ������ٴ�ǩ��";
					return msg;
				}				
			}			
		}else if("3".equals(type)){
			System.out.println("Ա����Ϣ�� ������ "+employee.getName()+"���Ϊ�� "+employee.getId()+"�򿨼�¼");
			System.out.println();
			if(arrayList.size() == 0){
				System.out.println("��");
			}else{
				arrayList.forEach(item ->{
					String checkOut = "";
					if(item.getCheckOutTime() == null){
						checkOut = "����ǩ�˼�¼";
					}else{
						checkOut= item.getCheckOutTime();
					}
					System.out.println(item.getCheckInTime().substring(0, 11)+"ǩ��ʱ��Ϊ�� "+item.getCheckInTime()+"ǩ��ʱ��Ϊ�� "+checkOut);			
				});					
			}
			Scanner scanner= new Scanner(System.in);
			System.out.println("������һ������1���˳�����¼��������2");
			
			String operation = scanner.nextLine();	
			if("1".equals(operation)){
				msg = operationSystem(employee);
			}else if("2".equals(operation)){
				return "�˳���¼";
			}else{
				System.out.println("�޴˹���");
			}			
		}else if("4".equals(type)){
			msg ="�����˳�ϵͳ";			
		}else{
			System.out.println("�޴˹���");
			operationSystem(employee);
		}
		return msg;	
	}
	
	private static String getNowTime() {//��ȡ���ڵĹ��߷���
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String format = simpleDateFormat.format(new Date());
		return format;
	}
	private static HashMap<String,Employee> getAllEmployee(){
		HashMap<String,Employee> map = new HashMap<>();
		map.put("1001",new Employee(1001, "Tom"));
		map.put("1002",new Employee(1002, "Mark"));
		map.put("1003",new Employee(1003, "Smith"));
		map.put("1004",new Employee(1004, "Jerry"));
		map.put("1005",new Employee(1005, "Bob"));
		return map;
	}

}



class Employee{
	
	private int id;
	
	private String name;
	
	//���Ա���򿨼�¼������
	//����7��������7����ʱ�����ζ���
	private ArrayList<CheckInRecord> arrayList;
	
    public Employee() {//Employee���޲ι��췽��
		
	}
		
	public Employee(int id,String name){//Employee���вι��췽��
		this.id = id;
		this.name = name;
		arrayList = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<CheckInRecord> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<CheckInRecord> arrayList) {
		this.arrayList = arrayList;
	}
	
	
		
}

class CheckInRecord{
	
	private String checkFlag;//Ĭ����δǩ��״̬��Ա��ǩ�����Ϊǩ����ǩ��֮���Ϊδǩ��
	
	private String checkInTime;
	
	private String checkOutTime;
	
	public  CheckInRecord(String checkInTime,String checkOutTime){
		this.checkFlag="δǩ��";
		this.checkInTime=checkInTime;
		this.checkOutTime=checkOutTime;
	}
	
	public  CheckInRecord(String checkFlag,String checkInTime,String checkOutTime){
		this.checkFlag=checkFlag;
		this.checkInTime=checkInTime;
		this.checkOutTime=checkOutTime;
	}

	public String getCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	
	
	
	
	
	
}

