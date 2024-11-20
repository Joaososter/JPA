package dao;

import model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProdutoDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");

    public void salvar(Produto produto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        em.close();
    }

    public List<Produto> listar() {
        EntityManager em = emf.createEntityManager();
        List<Produto> produtos = em.createQuery("from Produto", Produto.class).getResultList();
        em.close();
        return produtos;
    }

    public void atualizar(Produto produto) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(produto);
        em.getTransaction().commit();
        em.close();
    }

    public void deletar(int id) {
        EntityManager em = emf.createEntityManager();
        Produto produto = em.find(Produto.class, id);
        if (produto != null) {
            em.getTransaction().begin();
            em.remove(produto);
            em.getTransaction().commit();
        }
        em.close();
    }
}
