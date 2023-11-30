package example.hibernate.pyme.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import example.hibernate.pyme.App;
import example.hibernate.pyme.config.DBConfig;
import example.hibernate.pyme.models.Empleado;

public abstract class AbstractJpaDAO< T extends Serializable > {

	   private Class< T > clazz;
	   
	   public final void setClazz( Class< T > clazzToSet ){
		  this.clazz = clazzToSet;
	   }
	   
	   EntityManager entityManager = null;

	   public T findOne( int id ){
		  entityManager = DBConfig.getEntityManager();
	      return entityManager.find( clazz, id );
	   }
	   public List< T > findAll(){
		   entityManager = DBConfig.getEntityManager();
	      return entityManager.createQuery( "from " + clazz.getName() )
	       .getResultList();
	   }

	   public void create( T entity ){
		   entityManager = DBConfig.getEntityManager();
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
		    entityManager.persist( entity );
		    tx.commit();
	   }

	   public T update( T entity ){
		   entityManager = DBConfig.getEntityManager();
		   EntityTransaction tx = entityManager.getTransaction();
		   tx.begin();
		   T entityMerged = entityManager.merge( entity );
		   tx.commit();
		   return entityMerged;
	   }

	   public void delete( T entity ){
		   entityManager = DBConfig.getEntityManager();
		  EntityTransaction tx = entityManager.getTransaction();
		  tx.begin();
		  entityManager.remove( entity );
	      tx.commit();
	   }
	   
	}