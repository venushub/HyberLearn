package g.venu.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import g.venu.hyber.data.Address;
import g.venu.hyber.data.UserData;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserData user = new UserData();
		/*user.setUserId(1);*/
		user.setUserName("User first");
/*		user.setAddress("first user address");
		user.setJoinedDate(new Date());
		user.setDescription("Description of user one");*/
				
		Address addr = new Address();
		
		addr.setStreet("street 1");
		addr.setCity("city 1");
		
		user.setAddress(addr);
	
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
				
/*		user = (UserData) session.get(UserData.class, 1);
		System.out.println("user name retrived is: " + user.getUserName());*/
		
	}

}
