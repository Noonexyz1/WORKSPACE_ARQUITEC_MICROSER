package org.example.infraestructure.db;

import org.example.application.dto.AbogadoDTO;
import org.example.application.useCase.AbogadoPersistence;

import org.example.infraestructure.db.entity.AbogadoEntity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;


public class RepoHibernateMariaDB implements AbogadoPersistence {

    private final SessionFactory sessionFactory;

    public RepoHibernateMariaDB(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<AbogadoDTO> getAllAbogados() {
        try (Session session = sessionFactory.openSession()) {
            List<AbogadoEntity> listAboEntity = session.createQuery("from AbogadoEntity", AbogadoEntity.class).list();
            List<AbogadoDTO> aboDto;

            aboDto = listAboEntity.stream()
                    .map(x -> new AbogadoDTO(x.getId(), x.getNombre(), x.getEmail())).toList();

            return aboDto;

        } catch (Exception e) {
            e.printStackTrace();
            // Maneja la excepción según sea necesario

            return List.of();
        }
    }

    @Override
    public void saveNewAbogado(AbogadoDTO nuevoAbogado) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                AbogadoEntity abogadoEntity = new AbogadoEntity();
                abogadoEntity.setId(nuevoAbogado.getId());
                abogadoEntity.setNombre(nuevoAbogado.getNombre());
                abogadoEntity.setEmail(nuevoAbogado.getEmail());

                session.save(abogadoEntity);
                transaction.commit();

            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
                // Maneja la excepción según sea necesario
            }
        }
    }
}
