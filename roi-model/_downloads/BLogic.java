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
 * Created by rleigh via genspec on 2013-01-18 16:59:32.293859
 *
 *─────────────────────────────────────────────────────────────────────────────
 */

package scijava.roi.types;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum BLogic
{
  // And (AND)
  AND("AND", 0),
  // Or (OR)
  OR("OR", 1),
  // Not (NOT)
  NOT("NOT", 2),
  // Exclusive or (XOR)
  XOR("XOR", 3);

  private BLogic(String str, int value)
  {
    this.str = str;
    this.value = value;
  }

  public static BLogic get(String str)
  {
      BLogic ret = strLookup.get(str);
      if (ret == null)
        throw new RuntimeException("BLogic: Invalid enum string '" + str + "'");
      return ret;
  }

  public static BLogic get(int value)
  {
      BLogic ret = intLookup.get(value);
      if (ret == null)
        throw new RuntimeException("BLogic: Invalid enum value " + value);
      return ret;
  }

  @Override
  public String toString()
  {
    return str;
  }

  private String str;
  private int value;

  private static Map<String,BLogic> strLookup = new HashMap<String,BLogic>();
  private static Map<Integer,BLogic> intLookup = new HashMap<Integer,BLogic>();

  static
  {
      for (BLogic e : EnumSet.allOf(BLogic.class))
      {
        strLookup.put(e.str, e);
        intLookup.put(e.value, e);
      }
  }
}
