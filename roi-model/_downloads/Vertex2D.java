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
 * Created by rleigh via genspec on 2013-01-18 17:28:28.987234
 *
 *─────────────────────────────────────────────────────────────────────────────
 */

package scijava.roi.types;

public class Vertex2D
{

  /*
   * Members (static definitions)
   */

  /// 2D vertex
  public double[] vertex = new double[2];


  /*
   * Constructors (static definitions)
   */

  public Vertex2D()
  {
      this.vertex[0] = this.vertex[1] = 0;
  }
  
  public Vertex2D(double x, double y)
  {
      this.vertex[0] = x;
      this.vertex[1] = y;
  }
  
  public Vertex2D(double x)
  {
      this.vertex[0] = x;
      this.vertex[1] = 0;
  }
  
  public Vertex2D(Vertex2D vertex)
  {
      this.vertex[0] = vertex.vertex[0];
      this.vertex[1] = vertex.vertex[1];
  }
  
  public Vertex2D(Vertex1D vertex)
  {
      this.vertex[0] = vertex.vertex[0];
      this.vertex[1] = 0;
  }

  /*
   * Methods (static definitions)
   */

  public String toString()
  {
      return '(' + Double.toString(vertex[0]) + ',' + Double.toString(vertex[1]) + ')';
  }

  // TODO: Add methods defined elsewhere.

}
