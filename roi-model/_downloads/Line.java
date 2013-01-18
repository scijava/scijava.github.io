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
 * Created by rleigh via genspec on 2013-01-18 16:59:48.313085
 *
 *─────────────────────────────────────────────────────────────────────────────
 */

package scijava.roi.shape;

import scijava.roi.types.LinePoints3D;
import scijava.roi.measurement.Length;
import scijava.roi.shape.PhysicalShape;
import java.lang.IllegalArgumentException;
import scijava.roi.types.Vertex3D;

public class Line implements PhysicalShape, Length
{
  /*
   * Members (shape definitions)
   */

  /// Canonical representation
  LinePoints3D rep_canonical;

  /// Generic representation
  Object rep_generic;

  /*
   * Constructors (static definitions)
   */

  public Line()
  {
      Vertex3D v = new Vertex3D(0,0,0);
      Vertex3D list[] = {v, v};
      this.rep_canonical = new LinePoints3D(list);
      this.rep_generic = null;
  }
  
  public Line(LinePoints3D points)
  {
      if (points == null || points.points == null || points.points.length != 2)
          throw new java.lang.IllegalArgumentException("scijava.roi.shape.Line requires 2 points");
  
      this.rep_canonical = new LinePoints3D(points);
      this.rep_generic = null;
  }
  
  public Line(Vertex3D point1, Vertex3D point2)
  {
      Vertex3D list[] = {point1, point2};
      this.rep_canonical = new LinePoints3D(list);
      this.rep_generic = null;
  }
  
  public Line(Line line)
  {
      this.rep_canonical = new LinePoints3D(line.rep_canonical);
      this.rep_generic = null;
  
      // TODO: Copy generic representation.
      // if (line.rep_generic instanceof Cloneable)
      //     {
      //         this.rep_generic = line.rep_generic.clone();
      //     }
  }

  /*
   * Methods (static definitions)
   */

  public boolean contains(Vertex3D position)
  {
  	return false;
  }
  
  public double length()
  {
      double dx = this.rep_canonical.points[0].vertex[0] - this.rep_canonical.points[1].vertex[0];
      double dy = this.rep_canonical.points[0].vertex[1] - this.rep_canonical.points[1].vertex[1];
      double dz = this.rep_canonical.points[0].vertex[2] - this.rep_canonical.points[1].vertex[2];
  
      return Math.sqrt((dx*dx) + (dy*dy) + (dz*dz));
  }
  
  public final LinePoints3D getPoints()
  {
      return this.rep_canonical;
  }
  
  public String toString()
  {
      return "(" + this.rep_canonical.points[0] + ',' + this.rep_canonical.points[1] + ")";
  }

  // TODO: Add methods defined elsewhere.

}
