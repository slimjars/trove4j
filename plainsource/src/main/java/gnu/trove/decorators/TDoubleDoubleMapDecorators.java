///////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2009, Rob Eden All Rights Reserved.
// Copyright (c) 2009, Jeff Randall All Rights Reserved.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
///////////////////////////////////////////////////////////////////////////////

package gnu.trove.decorators;

//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////

import gnu.trove.decorator.TDoubleDoubleMapDecorator;
import gnu.trove.map.TDoubleDoubleMap;

import java.util.Map;


public class TDoubleDoubleMapDecorators {

    // Disallow creation of instances of this class
    private TDoubleDoubleMapDecorators() { }

    /**
     * Wrap the given map in a decorator that uses the standard {@link java.util.Map Map}
     * interface.
     *
     * @param map the <tt>TDoubleDoubleObjectMap</tt> to be wrapped
     * @return the wrapped map.
     */
    public static Map<Double,Double> wrap( TDoubleDoubleMap map ) {
        return new TDoubleDoubleMapDecorator( map );
    }
}
