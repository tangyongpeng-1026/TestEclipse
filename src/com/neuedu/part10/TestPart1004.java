package com.neuedu.part10;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//需要初始化一个存放公司现有员工的集合
//应该有个确认员工信息登录的环节
//员工的签到和签退信息要存起来，存在另一个集合中（是否打卡，记录打卡时间，可以查询7天，一次签到签退为一天）
//签到签退之后退出到登录界面




public class TestPart1004 {

	public static void main(String[] args) {
		HashMap<String,Employee> employees = getAllEmployee();//初始化公司员工
		outer:while(true){
			Scanner scanner= new Scanner(System.in);
			System.out.println("请输入您的员工编号");
			String checkId = scanner.nextLine();
			//员工校验
			Employee employee = employees.get(checkId);
			if(employee == null){
				System.out.println("无此员工，不能登入");
				continue outer;
			}else{				
				//进行功能处理
				String msg = operationSystem(employee);
				System.out.println(msg);
				if(msg.contains("已经签到")){
					continue outer;
				}else if(msg.contains("已经签退")){
					continue outer;
				}else if(msg.equals("该员工还未签到，不能签退")){
					String msg2 = operationSystem(employee);
					if(msg2.equals("该员工还未签到，不能签退")){
						System.out.println("异常操作登出");
						continue outer;
					}else{
						if(msg2.contains("已经签到")){
						     continue outer;
					    }else if(msg2.contains("已经签退")){
						     continue outer;
					    }else if(msg2.equals("退出登录")){
						     continue outer;
					    }else if(msg2.contains("退出系统")){
						     break outer;
					    }					
					}
				}else if(msg.equals("退出登录")){
					continue outer;
				}else if(msg.contains("您已退出系统")){
					break outer;
				}
				
			}
						
		}
		





	}
	private static String operationSystem(Employee employee){
		Scanner sc= new Scanner(System.in);
		System.out.println("1-----------签到");
		System.out.println("2-----------签退");
		System.out.println("3-----------查询打卡信息");
		System.out.println("4-----------退出");
		String type = sc.nextLine();
		String msg ="";//信息处理标识
		ArrayList<CheckInRecord> arrayList = employee.getArrayList();
		int size = arrayList.size();
		
		if("1".equals(type)){//签到			
			//取最新一条的记录，判断是否签到
			if(size == 0){//没有记录
				arrayList.add(new CheckInRecord("签到", getNowTime(), null));//新建一条签到记录
				msg="该员工已经签到";
				return msg;
			}else{//有记录
				  //如果有7条记录
			    if(size == 7){//如果集合长度等于7就去掉第一条数据
			    	arrayList.remove(0);
			    }	
				CheckInRecord checkInRecord = arrayList.get(arrayList.size()-1);//获取最新一条记录处理
				String checkFlag = checkInRecord.getCheckFlag();
				
				if("签到".equals(checkFlag)){//已经签好到，不能再次签到
					msg ="该员工已经签到，不能再次签到";
					return msg;
				}else if("未签到".equals(checkFlag)){
					//新建一条签到记录
					arrayList.add(new CheckInRecord("签到", getNowTime(), null));
					msg="该员工已经签到";
					return msg;
				}
			}			
		}else if("2".equals(type)){//签退
			if(size == 0){//没有记录的时候
				msg ="该员工还未签到，不能签退";
				return msg;
			}else{//有记录的时候
				CheckInRecord checkInRecord = arrayList.get(size-1);
				String checkFlag = checkInRecord.getCheckFlag();
				
				if("签到".equals(checkFlag)){//已经签好到，可以签退
					checkInRecord.setCheckOutTime(getNowTime());
					checkInRecord.setCheckFlag("未签到");
					msg ="该员工已经签退";
					return msg;
				}else if("未签到".equals(checkFlag)){
					//已经签完退了
					msg ="该员工已经签退，不能再次签退";
					return msg;
				}				
			}			
		}else if("3".equals(type)){
			System.out.println("员工信息： 姓名： "+employee.getName()+"编号为： "+employee.getId()+"打卡记录");
			System.out.println();
			if(arrayList.size() == 0){
				System.out.println("空");
			}else{
				arrayList.forEach(item ->{
					String checkOut = "";
					if(item.getCheckOutTime() == null){
						checkOut = "暂无签退记录";
					}else{
						checkOut= item.getCheckOutTime();
					}
					System.out.println(item.getCheckInTime().substring(0, 11)+"签到时间为： "+item.getCheckInTime()+"签退时间为： "+checkOut);			
				});					
			}
			Scanner scanner= new Scanner(System.in);
			System.out.println("返回上一层输入1，退出到登录界面输入2");
			
			String operation = scanner.nextLine();	
			if("1".equals(operation)){
				msg = operationSystem(employee);
			}else if("2".equals(operation)){
				return "退出登录";
			}else{
				System.out.println("无此功能");
			}			
		}else if("4".equals(type)){
			msg ="您已退出系统";			
		}else{
			System.out.println("无此功能");
			operationSystem(employee);
		}
		return msg;	
	}
	
	private static String getNowTime() {//获取日期的工具方法
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
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
	
	//存放员工打卡记录的属性
	//最多存7条，超过7条，时间依次顶掉
	private ArrayList<CheckInRecord> arrayList;
	
    public Employee() {//Employee的无参构造方法
		
	}
		
	public Employee(int id,String name){//Employee的有参构造方法
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
	
	private String checkFlag;//默认是未签到状态，员工签到后改为签到；签退之后改为未签到
	
	private String checkInTime;
	
	private String checkOutTime;
	
	public  CheckInRecord(String checkInTime,String checkOutTime){
		this.checkFlag="未签到";
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

