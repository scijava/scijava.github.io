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
 * Created by rleigh via genspec on 2013-01-18 17:28:28.991856
 *
 *─────────────────────────────────────────────────────────────────────────────
 */

package scijava.roi.types;

import scijava.roi.types.Vertex3D;

public class LinePoints3D
{

  /*
   * Members (static definitions)
   */

  // Array of points
  public Vertex3D points[];

  /*
   * Constructors (static definitions)
   */

  public LinePoints3D()
  {
      this.points = null;
  }
  
  public LinePoints3D(Vertex3D points[])
  {
      this.points = null;
      if (points != null)
          {
              this.points = new Vertex3D[points.length];
              for (int i = 0; i < points.length; i++)
                  {
                      this.points[i] = new Vertex3D(points[i]);
                  }
          }
  }
  
  public LinePoints3D(LinePoints3D linepoints)
  {
      this.points = null;
      Vertex3D points[] = linepoints.points;
      if (points != null)
          {
              this.points = new Vertex3D[linepoints.points.length];
              for (int i = 0; i < linepoints.points.length; i++)
                  {
                      this.points[i] = new Vertex3D(linepoints.points[i]);
                  }
          }
  }


  // TODO: Add methods defined elsewhere.

}
