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
import com.slimjars.dist.gnu.trove.sets.*;

import java.util.*;
import java.io.Serializable;


public class TUnmodifiableByteObjectMap<V> implements TByteObjectMap<V>, Serializable {
	private static final long serialVersionUID = -1034234728574286014L;

	private final TByteObjectMap<V> m;

	public TUnmodifiableByteObjectMap( TByteObjectMap<V> m ) {
		if ( m == null )
			throw new NullPointerException();
		this.m = m;
	}

	public int size()                       { return m.size(); }
	public boolean isEmpty()                { return m.isEmpty(); }
	public boolean containsKey( byte key )   { return m.containsKey( key ); }
	public boolean containsValue( Object val ) { return m.containsValue( val ); }
	public V get( byte key)                  { return m.get( key ); }

	public V put( byte key, V value ) { throw new UnsupportedOperationException(); }
	public V remove( byte key ) { throw new UnsupportedOperationException(); }
	public void putAll( TByteObjectMap<? extends V> m ) { throw new UnsupportedOperationException(); }
	public void putAll( Map<? extends Byte, ? extends V> map ) { throw new UnsupportedOperationException(); }
	public void clear() { throw new UnsupportedOperationException(); }

	private transient TByteSet keySet = null;
	private transient Collection<V> values = null;

	public TByteSet keySet() {
		if ( keySet == null )
			keySet = TUnmodifiableByteSets.wrap( m.keySet() );
		return keySet;
	}
	public byte[] keys() { return m.keys(); }
	public byte[] keys( byte[] array ) { return m.keys( array ); }

	public Collection<V> valueCollection() {
		if ( values == null )
			values = Collections.unmodifiableCollection( m.valueCollection() );
		return values;
	}
	public Object[] values() { return m.values(); }
	public V[] values( V[] array ) { return m.values( array ); }

	public boolean equals(Object o) { return o == this || m.equals(o); }
	public int hashCode()           { return m.hashCode(); }
	public String toString()        { return m.toString(); }
	public byte getNoEntryKey()      { return m.getNoEntryKey(); }

	public boolean forEachKey( TByteProcedure procedure ) {
		return m.forEachKey( procedure );
	}
	public boolean forEachValue( TObjectProcedure<? super V> procedure ) {
		return m.forEachValue( procedure );
	}
	public boolean forEachEntry( TByteObjectProcedure<? super V> procedure ) {
		return m.forEachEntry( procedure );
	}

	public TByteObjectIterator<V> iterator() {
		return new TByteObjectIterator<V>() {
			TByteObjectIterator<V> iter = m.iterator();

			public byte key() { return iter.key(); }
			public V value() { return iter.value(); }
			public void advance() { iter.advance(); }
			public boolean hasNext() { return iter.hasNext(); }
			public V setValue( V val ) { throw new UnsupportedOperationException(); }
			public void remove() { throw new UnsupportedOperationException(); }
		};
	}

	public V putIfAbsent( byte key, V value ) { throw new UnsupportedOperationException(); }
	public void transformValues( TObjectFunction<V,V> function ) { throw new UnsupportedOperationException(); }
	public boolean retainEntries( TByteObjectProcedure<? super V> procedure ) { throw new UnsupportedOperationException(); }
}