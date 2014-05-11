/*
 * This file is part of React.
 *
 * Copyright (c) 2013 Spout LLC <http://www.spout.org/>
 * React is licensed under the Spout License Version 1.
 *
 * React is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * React is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license, including
 * the MIT license.
 */
package org.spout.physics.constraint;

import org.spout.physics.body.RigidBody;

/**
 * This is the base class of a constraint in the physics engine. A constraint can be a collision contact or a joint for instance.
 */
public class Constraint {
    protected final RigidBody mBody1;
    protected final RigidBody mBody2;
    protected final boolean mActive;
    protected final ConstraintType mType;

    /**
     * Constructs a new constraint from the two bodies, the activity status and the type of constraint.
     *
     * @param body1 The first body
     * @param body2 The second body
     * @param active True if this constraint is active, false if not
     * @param type The type of this constraint
     */
    public Constraint(RigidBody body1, RigidBody body2, boolean active, ConstraintType type) {
        mBody1 = body1;
        mBody2 = body2;
        mActive = active;
        mType = type;
    }

    /**
     * Gets the first body.
     *
     * @return The first body
     */
    public RigidBody getBody1() {
        return mBody1;
    }

    /**
     * Gets the second body.
     *
     * @return The second body
     */
    public RigidBody getBody2() {
        return mBody2;
    }

    /**
     * Returns true if the constraint is active, false if not.
     *
     * @return Whether or not the constraint is active
     */
    public boolean isActive() {
        return mActive;
    }

    /**
     * Gets the type of constraint.
     *
     * @return The constraint type
     */
    public ConstraintType getType() {
        return mType;
    }

    /**
     * An enumeration of the possible constraint types (contact).
     */
    public static enum ConstraintType {
        CONTACT,
        BALL_SOCKET_JOINT
    }
}
