package org.picketlink.idm.jpa.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Marks a property of an entity bean as storing a particular type of Identity Management state.
 * 
 * @author Shane Bryzak
 */
@Target({METHOD, FIELD})
@Documented
@Retention(RUNTIME)
@Inherited
public @interface IDMProperty {
    PropertyType value();
}
