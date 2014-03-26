package ru.madzi.dao.repo;

import ru.madzi.dao.model.JpaEntity;

import java.io.Serializable;

/**
 * Базовый интерфейс репозитория.
 *
 * @param <E> хранимая сущность
 * @param <S> тип идентификатора
 */
public interface IJpaRepo<E extends JpaEntity, S extends Serializable> {
}
