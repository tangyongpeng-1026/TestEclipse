package com.company;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * ����һ����˾��,����Ա���ļ���,����ÿ�쿼�ڵļ���
 * Created by ttc on 2017/6/30.
 */
public class Company {
	    private  Map<Integer,Emp> mapEmp = new HashMap<>();
	    //Map�е�KEYΪǩ��������
	    private Map<String,List<KaoqinRecord>> map = new HashMap<>();
	    //����һ�����Ա���ķ���
	    public Map<Integer,Emp> addEmp(int id,String name,int age,char sex){
	        mapEmp.put(id,new Emp(id,name,age,sex));
	        return mapEmp;
	    }
	    //��ʾ���ڹ�˾Ա������Ϣ
	    public void showEmp(){
	        for(Map.Entry<Integer,Emp> m :mapEmp.entrySet()){
	            System.out.println("����:"+m.getValue().getId()+" ����:"+m.getValue().getName()+" ����"+m.getValue().getAge()+" �Ա�"+m.getValue().getSex());
	        }
	    }
	    //����ɾ��Ա���ķ���
	    public void deleteEmp(int id){
	        mapEmp.remove(id);
	    }
	    //�����ѯԱ���ķ���
	    public void selectEmp(int id){
	        System.out.println("����:"+mapEmp.get(id).getId()+" ����:"+mapEmp.get(id).getName()+" ����"+mapEmp.get(id).getAge()+" �Ա�"+mapEmp.get(id).getSex());
	    }
	    //���幫˾��ǩ������
	    public void qiandao(){
	        Date date = new Date();
	        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
	        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
	        String qiandaoDate = sdfDate.format(date);
	        String kaoqinTime = sdfTime.format(date);
	        System.out.println("������Ҫǩ����Ա������");
	        Scanner sc = new Scanner(System.in);
	        int inputId = sc.nextInt();
	        if(!mapEmp.containsKey(inputId)){
	            System.out.println("�����ڸ�Ա��");
	            return;
	        }
	        List<KaoqinRecord> listKaoQin = null;
	        if(!map.containsKey(qiandaoDate)){
	            //��һ��ǩ����Ա��
	            listKaoQin = new ArrayList<>();
	            KaoqinRecord kq = new KaoqinRecord();
	            kq.setName(mapEmp.get(inputId).getName());
	            kq.setStratTime(kaoqinTime);
	            kq.setEndTime("");
	            listKaoQin.add(kq);
	            map.put(qiandaoDate,listKaoQin);
	            System.out.println("ǩ���ɹ�!");
	        }else {//˵��֮ǰ,�����Ѿ�����ǩ������
	            listKaoQin = map.get(qiandaoDate);
	            //�ж��Ƿ��Ѿ�ǩ����
	            boolean bIsFind = false;
	            for (KaoqinRecord kr : listKaoQin) {
	                if (kr.getName() == mapEmp.get(inputId).getName()) {
	                    System.out.println("�Ѿ�ǩ������");
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
	                System.out.println("ǩ���ɹ�!");
	            }
	        }
	    }
	    public void qiantui(){
	        System.out.println("������Ҫǩ�˵�Ա��ID");
	        Scanner sc = new Scanner(System.in);
	        int inputId = sc.nextInt();
	        String s = sc.nextLine();
	        if(!mapEmp.containsKey(inputId)){
	            System.out.println("Ա��������");
	            return;
	        }
	        Date date = new Date();
	        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
	        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
	        String qiandaoDate = sdfDate.format(date);
	        String kaoqinTime = sdfTime.format(date);
	        if(!map.containsKey(qiandaoDate)){
	            System.out.println("��ûǩ��,����ǩ��!");
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
	                System.out.println("��ûǩ��,����ǩ��");
	            }else{
	                System.out.println("ǩ�˳ɹ�!");
	            }
	        }
	    }
	    public void showAttendence(){
	        System.out.println("������Ҫ��ѯ�����ڣ�yyyy-MM-dd��");
	        Scanner sc = new Scanner(System.in);
	        String qiandaoDate = sc.nextLine();
	        List<KaoqinRecord> listKaoQin = map.get(qiandaoDate);
	        for(KaoqinRecord kr : listKaoQin){
	            System.out.println(kr.getName()+" ǩ��ʱ��Ϊ:"+kr.getStratTime()+" ǩ��ʱ��Ϊ:"+kr.getEndTime());
	        }
    }
}
