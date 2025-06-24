package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import persistencia.exceptions.NonexistentEntityException;
import logica.Datos;

public class DatosJpaController implements Serializable {

    public DatosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManagerFactory emf = null;
    
     public DatosJpaController() {
        emf = Persistence.createEntityManagerFactory("DialifePU");
    }
    

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Datos datos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(datos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Datos datos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            datos = em.merge(datos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            int id = datos.getId(); 
            if (findDatos(id) == null) {
                throw new NonexistentEntityException("El dato con ID " + id + " no existe.");
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Datos datos;
            try {
                datos = em.getReference(Datos.class, id);
                datos.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("El dato con ID " + id + " no existe.", enfe);
            }
            em.remove(datos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Datos> findDatosEntities() {
        return findDatosEntities(true, -1, -1);
    }

    public List<Datos> findDatosEntities(int maxResults, int firstResult) {
        return findDatosEntities(false, maxResults, firstResult);
    }

    private List<Datos> findDatosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Datos.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Datos findDatos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Datos.class, id);
        } finally {
            em.close();
        }
    }

    public int getDatosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Datos> rt = cq.from(Datos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}

