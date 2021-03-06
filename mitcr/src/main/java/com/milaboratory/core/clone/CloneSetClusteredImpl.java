/*
 * MiTCR <http://milaboratory.com>
 *
 * Copyright (c) 2010-2013:
 *     Bolotin Dmitriy     <bolotin.dmitriy@gmail.com>
 *     Chudakov Dmitriy    <chudakovdm@mail.ru>
 *
 * MiTCR is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.milaboratory.core.clone;

import com.milaboratory.core.segment.SegmentGroupType;

import java.util.Collection;

/**
 * An implementation of {@link CloneSet} for clone clusters
 *
 * @author Bolotin Dmitriy (bolotin.dmitriy@gmail.com)
 * @author Shugay Mikhail (mikhail.shugay@gmail.com)
 */
public class CloneSetClusteredImpl extends CloneSetImpl<CloneCluster> implements CloneSetClustered {
    private final CloneSet parent;

    /**
     * Creates a set of clone clusters
     *
     * @param parent parent (unclustered) clone set
     * @param clones clustered clones
     */
    public CloneSetClusteredImpl(CloneSet parent, Collection<? extends CloneCluster> clones) {
        super(clones, parent.getGene(), parent.getSpecies(), parent.getSegmentGroupContainer(SegmentGroupType.Variable),
                parent.getSegmentGroupContainer(SegmentGroupType.Joining),
                parent.getSegmentGroupContainer(SegmentGroupType.Diversity));
        this.parent = parent;
    }

    @Override
    public CloneSet getParentCloneSet() {
        return parent;
    }
}
