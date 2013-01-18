/*
 * #%L
 * SciJava ROI Model.
 * %%
 * Copyright © 2012 Open Microscopy Environment:
 *   - Board of Regents of the University of Wisconsin-Madison
 *   - Glencoe Software, Inc.
 *   - University of Dundee
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */


/*─────────────────────────────────────────────────────────────────────────────
 *
 * THIS IS AUTOMATICALLY GENERATED CODE.  DO NOT MODIFY.
 * Created by rleigh via genspec on 2013-01-18 16:59:32.294313
 *
 *─────────────────────────────────────────────────────────────────────────────
 */

package scijava.roi.shape;

import scijava.roi.Serialisable;
import scijava.roi.types.Vertex3D;

public interface PhysicalShape extends Serialisable
{

  /*
   * Methods (static definitions)
   */

  /**
   * Determine if a point is contained within the region of interest.
   *
   * @param position the point position
   * @return true if within or false if without
   */
  public boolean contains(Vertex3D position);


  // TODO: Add methods defined elsewhere.

}
