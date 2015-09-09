package test.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;

import test.dto.Student;

public class StudentDao {
	private Session session;

	public StudentDao() {
	};

	public boolean add(Student student) {
		try {
			Configuration configuration = new Configuration().configure();

			// 以下这两句就是4.3的新用法
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			StandardServiceRegistryImpl registry = (StandardServiceRegistryImpl) builder
					.build();

			SessionFactory sessionFactory = configuration
					.buildSessionFactory(registry);
			session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();

			session.save(student);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// 回滚事务
			session.getTransaction().rollback();
			return false;
		} finally {
			if (session != null) {
				if (session.isOpen()) {
					// 关闭session
					session.close();
				}
			}
		}
	}
}
