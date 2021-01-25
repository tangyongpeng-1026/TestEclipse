package com.company;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 定义一个公司类,包括员工的集合,还有每天考勤的集合
 * Created by ttc on 2017/6/30.
 */
public class Company {
	    private  Map<Integer,Emp> mapEmp = new HashMap<>();
	    //Map中的KEY为签到的日期
	    private Map<String,List<KaoqinRecord>> map = new HashMap<>();
	    //定义一个添加员工的方法
	    public Map<Integer,Emp> addEmp(int id,String name,int age,char sex){
	        mapEmp.put(id,new Emp(id,name,age,sex));
	        return mapEmp;
	    }
	    //显示现在公司员工的信息
	    public void showEmp(){
	        for(Map.Entry<Integer,Emp> m :mapEmp.entrySet()){
	            System.out.println("工号:"+m.getValue().getId()+" 姓名:"+m.getValue().getName()+" 年龄"+m.getValue().getAge()+" 性别"+m.getValue().getSex());
	        }
	    }
	    //定义删除员工的方法
	    public void deleteEmp(int id){
	        mapEmp.remove(id);
	    }
	    //定义查询员工的方法
	    public void selectEmp(int id){
	        System.out.println("工号:"+mapEmp.get(id).getId()+" 姓名:"+mapEmp.get(id).getName()+" 年龄"+mapEmp.get(id).getAge()+" 性别"+mapEmp.get(id).getSex());
	    }
	    //定义公司的签到方法
	    public void qiandao(){
	        Date date = new Date();
	        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
	        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
	        String qiandaoDate = sdfDate.format(date);
	        String kaoqinTime = sdfTime.format(date);
	        System.out.println("请输入要签到的员工号码");
	        Scanner sc = new Scanner(System.in);
	        int inputId = sc.nextInt();
	        if(!mapEmp.containsKey(inputId)){
	            System.out.println("不存在该员工");
	            return;
	        }
	        List<KaoqinRecord> listKaoQin = null;
	        if(!map.containsKey(qiandaoDate)){
	            //第一个签到的员工
	            listKaoQin = new ArrayList<>();
	            KaoqinRecord kq = new KaoqinRecord();
	            kq.setName(mapEmp.get(inputId).getName());
	            kq.setStratTime(kaoqinTime);
	            kq.setEndTime("");
	            listKaoQin.add(kq);
	            map.put(qiandaoDate,listKaoQin);
	            System.out.println("签到成功!");
	        }else {//说明之前,今天已经有人签到过了
	            listKaoQin = map.get(qiandaoDate);
	            //判断是否已经签到过
	            boolean bIsFind = false;
	            for (KaoqinRecord kr : listKaoQin) {
	                if (kr.getName() == mapEmp.get(inputId).getName()) {
	                    System.out.println("已经签到过了");
	                    bIsFind = true;
	                    break;
	                }
	            }
	            if (!bIsFind) {
	                KaoqinRecord kr = new KaoqinRecord();
	                kr.setName(mapEmp.get(inputId).getName());
	                kr.setStratTime(kaoqinTime);
	                kr.setEndTime("");
	                listKaoQin.add(kr);
	                System.out.println("签到成功!");
	            }
	        }
	    }
	    public void qiantui(){
	        System.out.println("请输入要签退的员工ID");
	        Scanner sc = new Scanner(System.in);
	        int inputId = sc.nextInt();
	        String s = sc.nextLine();
	        if(!mapEmp.containsKey(inputId)){
	            System.out.println("员工不存在");
	            return;
	        }
	        Date date = new Date();
	        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
	        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
	        String qiandaoDate = sdfDate.format(date);
	        String kaoqinTime = sdfTime.format(date);
	        if(!map.containsKey(qiandaoDate)){
	            System.out.println("您没签到,不能签退!");
	        }else{
	            List<KaoqinRecord> listKaoQin = map.get(qiandaoDate);
	            boolean bIsFind = false;
	            for(KaoqinRecord kr : listKaoQin){
	                if(kr.getName().equals(mapEmp.get(inputId).getName())){
	                    kr.setEndTime(kaoqinTime);
	                    bIsFind = true;
	                    break;
	                }
	            }
	            if(!bIsFind){
	                System.out.println("您没签到,不能签退");
	            }else{
	                System.out.println("签退成功!");
	            }
	        }
	    }
	    public void showAttendence(){
	        System.out.println("请输入要查询的日期（yyyy-MM-dd）");
	        Scanner sc = new Scanner(System.in);
	        String qiandaoDate = sc.nextLine();
	        List<KaoqinRecord> listKaoQin = map.get(qiandaoDate);
	        for(KaoqinRecord kr : listKaoQin){
	            System.out.println(kr.getName()+" 签到时间为:"+kr.getStratTime()+" 签退时间为:"+kr.getEndTime());
	        }
    }
}
