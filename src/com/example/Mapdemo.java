package com.example;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> map=new HashMap<>();
map.put(1, "A");
map.put(2, "B");
map.put(3, "C");
map.put(4, "D");
System.out.println(map.get(3));
map.remove(3);
System.out.println(map.get(3));
System.out.println(map.size());
System.out.println(map);
System.out.println(map.containsKey(2));
System.out.println(map.keySet());
System.out.println(map.values());
Set<Integer> s=map.keySet();
for(int x:s)
{
	System.out.print(x);
	}
Iterator itr=s.iterator();
while(itr.hasNext()) {
	System.out.print(itr.next());
}
s.forEach(x->{
	System.out.print(x);
});
for(HashMap.Entry<Integer, String> m:map.entrySet())
{
	System.out.println(m.getKey()+" "+m.getValue());
}
HashMap<CompanyBean,EmployeeBean> hm=new HashMap<CompanyBean,EmployeeBean>();
hm.put(new CompanyBean("UST", 101, "Trivandrum"), new EmployeeBean(101, "Karthik", 45000));
hm.put(new CompanyBean("TCS", 102, "Chennai"), new EmployeeBean(102, "Praveen", 55000));
hm.put(new CompanyBean("UST", 103, "Bangalore"), new EmployeeBean(103, "Vijay", 65000));
hm.put(new CompanyBean("TCS", 104, "Bangalore"), new EmployeeBean(104, "Pavan", 75000));
hm.put(new CompanyBean("Wipro", 105, "Chennai"), new EmployeeBean(105, "Gokul", 56000));
for(Map.Entry m:hm.entrySet())
{
	CompanyBean cmp=(CompanyBean)m.getKey();
	EmployeeBean emp=(EmployeeBean)m.getValue();
	
//	if(cmp.getCmpName().equals("UST"))
//	{
//		System.out.println(emp.getEmpname());
//	}
	if(emp.getEmpsal()>=40000)
	{
		System.out.println(emp.getEmpname());
	}
	
}
	}
}
