package ru.madzi.dao.model.auth;

import ru.madzi.dao.model.JpaEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Пользователь системы.
 */
@Entity
@Table(name = "users")
public class User extends JpaEntity {

    private static final String SEQ_NAME = "seq_users_uid";

    /** Идентификатор */
    private Long uid;

    /** Электронная почта */
    private String email;

    /** Пароль */
    private String password;

    /**
     * Возвращает идентификатор.
     *
     * @return идентификатор
     */
    @Id
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    @GeneratedValue(generator = SEQ_NAME, strategy = GenerationType.SEQUENCE)
    public Long getUid() {
        return uid;
    }

    /**
     * Устанавливает идентификатор.
     *
     * @param uid идентификатор
     * @return текущий объект
     */
    public User setUid(final Long uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Возвращает электронную почту.
     *
     * @return электронная почта
     */
    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    /**
     * Устанавливает электронную почту.
     *
     * @param email электронная почта
     * @return текущий объект
     */
    public User setEmail(final String email) {
        this.email = email;
        return this;
    }

    /**
     * Возвращает пароль.
     *
     * @return пароль
     */
    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    /**
     * Устанавливает пароль.
     *
     * @param password пароль
     * @return текущий объект
     */
    public User setPassword(final String password) {
        this.password = password;
        return this;
    }

}
