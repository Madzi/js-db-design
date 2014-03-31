package ru.madzi.designer.utils.dao;

import org.hibernate.annotations.common.util.StringHelper;
import org.hibernate.cfg.EJB3NamingStrategy;

/**
 * Created by de on 31.03.14.
 */
public class NamingStrategy extends EJB3NamingStrategy {

    public static final NamingStrategy INSTANCE = new NamingStrategy();

    @Override
    public String classToTableName(String className) {
        return addUnderscores(StringHelper.unqualify(className));
    }

    @Override
    public String propertyToColumnName(String propertyName) {
        return addUnderscores(StringHelper.unqualify(propertyName));
    }

    public String tableName(String tableName) {
        return addUnderscores(tableName);
    }
    public String columnName(String columnName) {
        return addUnderscores(columnName);
    }

    protected static String addUnderscores(String name) {
        StringBuilder buf = new StringBuilder(name.replace('.', '_'));
        for (int i = 1; i < buf.length() - 1; i++) {
            if (Character.isLowerCase(buf.charAt(i - 1))
                    && Character.isUpperCase(buf.charAt(i))
                    && Character.isLowerCase(buf.charAt(i + 1))) {
                buf.insert(i++, '_');
            }
        }
        return buf.toString().toLowerCase();
    }

}
