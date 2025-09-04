package com.orion.orion.config;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CustomPhysicalNamingStrategy  implements PhysicalNamingStrategy {

    @Override
    public Identifier toPhysicalCatalogName(Identifier name, JdbcEnvironment context) {
        return applyCustomNamingStrategy(name);
    }

    @Override
    public Identifier toPhysicalSchemaName(Identifier name, JdbcEnvironment context) {
        return applyCustomNamingStrategy(name);
    }

    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        return applyCustomNamingStrategy(name);
    }

    @Override
    public Identifier toPhysicalSequenceName(Identifier name, JdbcEnvironment context) {
        return applyCustomNamingStrategy(name);
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
        return applyCustomNamingStrategy(name);
    }

    private Identifier applyCustomNamingStrategy(Identifier name) {
        if (name == null) {
            return null;
        }

        // Exemplo de conversão para snake_case
        String newName = name.getText().replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();

        return Identifier.toIdentifier(newName);
    }
}
