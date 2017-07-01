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

import gnu.trove.decorator.TIntSetDecorator;
import gnu.trove.set.TIntSet;

import java.util.Set;


public class TIntSetDecorators {

    // Disallow creation of instances of this class
    private TIntSetDecorators() { }

    /**
     * Wrap the given set in a decorator that uses the standard {@link java.util.Set Set}
     * interface.
     *
     * @param set the <tt>TIntSet</tt> to be wrapped
     * @return the wrapped set.
     */
    public static Set<Integer> wrap( TIntSet set ) {
        return new TIntSetDecorator( set );
    }
}
