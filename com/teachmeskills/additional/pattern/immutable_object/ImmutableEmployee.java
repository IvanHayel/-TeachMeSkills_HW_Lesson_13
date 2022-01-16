package com.teachmeskills.additional.pattern.immutable_object;

import java.time.LocalDate;

public class ImmutableEmployee {
    private final StringBuilder NAME;
    private final LocalDate HIRE_DATE;

    public ImmutableEmployee(final StringBuilder name, final LocalDate hireDate) {
        NAME = new StringBuilder(name);
        HIRE_DATE = hireDate;
    }

    public String getName() {
        return NAME.toString();
    }

    public LocalDate getHireDate() {
        return HIRE_DATE;
    }

    @Override
    public String toString() {
        return "Employee " + NAME + " came to work " + HIRE_DATE + '.';
    }
}