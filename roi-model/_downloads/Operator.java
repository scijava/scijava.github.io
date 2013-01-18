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
 * Created by rleigh via genspec on 2013-01-18 16:59:32.293559
 *
 *─────────────────────────────────────────────────────────────────────────────
 */

package scijava.roi.types;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Operator
{
  // Equals (=)
  EQ("EQ", 0),
  // Not equals (≠)
  NE("NE", 1),
  // Less than (<)
  LT("LT", 2),
  // Less than or equal to (≤)
  LE("LE", 3),
  // Greater than (>)
  GT("GT", 4),
  // Greater than or equal to (≥)
  GE("GE", 5);

  private Operator(String str, int value)
  {
    this.str = str;
    this.value = value;
  }

  public static Operator get(String str)
  {
      Operator ret = strLookup.get(str);
      if (ret == null)
        throw new RuntimeException("Operator: Invalid enum string '" + str + "'");
      return ret;
  }

  public static Operator get(int value)
  {
      Operator ret = intLookup.get(value);
      if (ret == null)
        throw new RuntimeException("Operator: Invalid enum value " + value);
      return ret;
  }

  @Override
  public String toString()
  {
    return str;
  }

  private String str;
  private int value;

  private static Map<String,Operator> strLookup = new HashMap<String,Operator>();
  private static Map<Integer,Operator> intLookup = new HashMap<Integer,Operator>();

  static
  {
      for (Operator e : EnumSet.allOf(Operator.class))
      {
        strLookup.put(e.str, e);
        intLookup.put(e.value, e);
      }
  }
}
