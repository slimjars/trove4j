///////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2008, Robert D. Eden All Rights Reserved.
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

package com.slimjars.dist.gnu.trove.impl.unmodifiable;


//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////

////////////////////////////////////////////////////////////
// THIS IS AN IMPLEMENTATION CLASS. DO NOT USE DIRECTLY!  //
// Access to these methods should be through TCollections //
////////////////////////////////////////////////////////////


import com.slimjars.dist.gnu.trove.iterator.*;
import com.slimjars.dist.gnu.trove.procedure.*;
import com.slimjars.dist.gnu.trove.set.*;
import com.slimjars.dist.gnu.trove.function.*;
import com.slimjars.dist.gnu.trove.map.*;
import com.slimjars.dist.gnu.trove.collections.*;
import com.slimjars.dist.gnu.trove.sets.*;
import com.slimjars.dist.gnu.trove.*;

import java.util.Map;
import java.io.Serializable;


public class TUnmodifiableShortCharMap implements TShortCharMap, Serializable {
	private static final long serialVersionUID = -1034234728574286014L;

	private final TShortCharMap m;

	public TUnmodifiableShortCharMap( TShortCharMap m ) {
		if ( m == null )
			throw new NullPointerException();
		this.m = m;
	}

	public int size()                       { return m.size(); }
	public boolean isEmpty()                { return m.isEmpty(); }
	public boolean containsKey( short key )   { return m.containsKey( key ); }
	public boolean containsValue( char val ) { return m.containsValue( val ); }
	public char get( short key)                { return m.get( key ); }

	public char put( short key, char value ) { throw new UnsupportedOperationException(); }
	public char remove( short key ) { throw new UnsupportedOperationException(); }
	public void putAll( TShortCharMap m ) { throw new UnsupportedOperationException(); }
	public void putAll( Map<? extends Short, ? extends Character> map ) { throw new UnsupportedOperationException(); }
	public void clear() { throw new UnsupportedOperationException(); }

	private transient TShortSet keySet = null;
	private transient TCharCollection values = null;

	public TShortSet keySet() {
		if ( keySet == null )
			keySet = TUnmodifiableShortSets.wrap( m.keySet() );
		return keySet;
	}
	public short[] keys() { return m.keys(); }
	public short[] keys( short[] array ) { return m.keys( array ); }

	public TCharCollection valueCollection() {
		if ( values == null )
			values = TUnmodifiableCharCollections.wrap( m.valueCollection() );
		return values;
	}
	public char[] values() { return m.values(); }
	public char[] values( char[] array ) { return m.values( array ); }

	public boolean equals(Object o) { return o == this || m.equals(o); }
	public int hashCode()           { return m.hashCode(); }
	public String toString()        { return m.toString(); }
	public short getNoEntryKey()      { return m.getNoEntryKey(); }
	public char getNoEntryValue()    { return m.getNoEntryValue(); }

	public boolean forEachKey( TShortProcedure procedure ) {
		return m.forEachKey( procedure );
	}
	public boolean forEachValue( TCharProcedure procedure ) {
		return m.forEachValue( procedure );
	}
	public boolean forEachEntry( TShortCharProcedure procedure ) {
		return m.forEachEntry( procedure );
	}

	public TShortCharIterator iterator() {
		return new TShortCharIterator() {
			TShortCharIterator iter = m.iterator();

			public short key() { return iter.key(); }
			public char value() { return iter.value(); }
			public void advance() { iter.advance(); }
			public boolean hasNext() { return iter.hasNext(); }
			public char setValue( char val ) { throw new UnsupportedOperationException(); }
			public void remove() { throw new UnsupportedOperationException(); }
		};
	}

	public char putIfAbsent( short key, char value ) { throw new UnsupportedOperationException(); }
	public void transformValues( TCharFunction function ) { throw new UnsupportedOperationException(); }
	public boolean retainEntries( TShortCharProcedure procedure ) { throw new UnsupportedOperationException(); }
	public boolean increment( short key ) { throw new UnsupportedOperationException(); }
	public boolean adjustValue( short key, char amount ) { throw new UnsupportedOperationException(); }
	public char adjustOrPutValue( short key, char adjust_amount, char put_amount ) { throw new UnsupportedOperationException(); }
}