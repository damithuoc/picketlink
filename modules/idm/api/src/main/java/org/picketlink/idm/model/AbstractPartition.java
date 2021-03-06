/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.picketlink.idm.model;

import org.picketlink.idm.model.annotation.AttributeProperty;

/**
 * <p>Base class for {@link Partition} implementations.</p>
 *
 * @author Pedro Silva
 *
 */
public abstract class AbstractPartition extends AbstractAttributedType implements Partition {

    private static final long serialVersionUID = -6899014824481928333L;

    private String name;

    public AbstractPartition(String name) {
        this.name = name;
    }

    @Override
    @AttributeProperty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!getClass().isInstance(obj)) {
            return false;
        }

        Partition other = (Partition) obj;

        return (getId() != null && other.getId() != null && getId().equals(other.getId()))
            || (getName() != null && other.getName() != null && getName().equals(other.getName()));
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getId();
    }
}
