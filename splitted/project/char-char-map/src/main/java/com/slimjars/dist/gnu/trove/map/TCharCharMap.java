///////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2009, Rob Eden All Rights Reserved.
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

package com.slimjars.dist.gnu.trove.map;


//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////

import com.slimjars.dist.gnu.trove.function.*;
import com.slimjars.dist.gnu.trove.iterator.*;
import com.slimjars.dist.gnu.trove.procedure.*;
import com.slimjars.dist.gnu.trove.set.*;
import com.slimjars.dist.gnu.trove.TCharCollection;

import java.util.Map;


/**
 * Interface for a primitive map of char keys and char values.
 */
public interface TCharCharMap {
    /**
     * Returns the value that will be returned from {@link #get} or {@link #put} if no
     * entry exists for a given key. The default value is generally zero, but can be
     * configured during construction of the collection.
     *
     * @return the value that represents a null key in this collection.
     */
    public char getNoEntryKey();


    /**
     * Returns the value that will be returned from {@link #get} or {@link #put} if no
     * entry exists for a given key. The default value is generally zero, but can be
     * configured during construction of the collection.
     *
     * @return the value that represents a null value in this collection.
     */
    public char getNoEntryValue();


    /**
     * Inserts a key/value pair into the map.
     *
     * @return the previous value associated with <tt>key</tt>, or the "no entry" value
     *         if none was found (see {@link #getNoEntryValue}).
     */
    public char put( char key, char value );


    /**
     * Inserts a key/value pair into the map if the specified key is not already
     * associated with a value.
     *
     * @return the previous value associated with <tt>key</tt>, or the "no entry" value
     *         if none was found (see {@link #getNoEntryValue}).
     */
    public char putIfAbsent( char key, char value );


    /**
     * Put all the entries from the given Map into this map.
     *
     * @param map The Map from which entries will be obtained to put into this map.
     */
    public void putAll( Map<? extends Character, ? extends Character> map );


    /**
     * Put all the entries from the given map into this map.
     *
     * @param map   The map from which entries will be obtained to put into this map.
     */
    public void putAll( TCharCharMap map );


    /**
     * Retrieves the value for <tt>key</tt>.
     *
     * @return the previous value associated with <tt>key</tt>, or the "no entry" value
     *         if none was found (see {@link #getNoEntryValue}).
     */
    public char get( char key );


    /**
     * Empties the map.
     */
    public void clear();


    /**
      * Returns <tt>true</tt> if this map contains no key-value mappings.
      *
      * @return <tt>true</tt> if this map contains no key-value mappings
      */
     public boolean isEmpty();


    /**
     * Deletes a key/value pair from the map.
     *
     * @param key an <code>char</code> value
     *
     * @return the previous value associated with <tt>key</tt>, or the "no entry" value
     *         if none was found (see {@link #getNoEntryValue}).
     */
    public char remove( char key );


    /**
     * Returns an <tt>int</tt> value that is the number of elements in the map.
     *
     * @return an <tt>int</tt> value that is the number of elements in the map.
     */
    public int size();


    /**
     * Returns the keys of the map as a <tt>TCharSet</tt>
     *
     * @return the keys of the map as a <tt>TCharSet</tt>
     */
    public TCharSet keySet();


    /**
     * Returns the keys of the map as an array of <tt>char</tt> values.
     *
     * @return the keys of the map as an array of <tt>char</tt> values.
     */
    public char[] keys();


    /**
     * Returns the keys of the map.
     *
     * @param array   the array into which the elements of the list are to be stored,
     *                if it is big enough; otherwise, a new array of the same type is
     *                allocated for this purpose.
     * @return the keys of the map as an array.
     */
    public char[] keys( char[] array );


    /**
     * Returns the values of the map as a <tt>TCharCollection</tt>
     *
     * @return the values of the map as a <tt>TCharCollection</tt>
     */
    public TCharCollection valueCollection();


    /**
     * Returns the values of the map as an array of <tt>#e#</tt> values.
     *
     * @return the values of the map as an array of <tt>#e#</tt> values.
     */
    public char[] values();


    /**
     * Returns the values of the map using an existing array.
     *
     * @param array   the array into which the elements of the list are to be stored,
     *                if it is big enough; otherwise, a new array of the same type is
     *                allocated for this purpose.
     * @return the values of the map as an array of <tt>#e#</tt> values.
     */
    public char[] values( char[] array );


    /**
     * Checks for the presence of <tt>val</tt> in the values of the map.
     */
    public boolean containsValue( char val );


    /**
     * Checks for the present of <tt>key</tt> in the keys of the map.
     */
    public boolean containsKey( char key );


    /**
     * @return a TCharCharIterator with access to this map's keys and values
     */
    public TCharCharIterator iterator();


    /**
     * Executes <tt>procedure</tt> for each key in the map.
     *
     * @param procedure a <code>TCharProcedure</code> value
     * @return false if the loop over the keys terminated because
     *               the procedure returned false for some key.
     */
    public boolean forEachKey( TCharProcedure procedure );


    /**
     * Executes <tt>procedure</tt> for each value in the map.
     *
     * @param procedure a <code>T#F#Procedure</code> value
     * @return false if the loop over the values terminated because
     *               the procedure returned false for some value.
     */
    public boolean forEachValue( TCharProcedure procedure );


    /**
     * Executes <tt>procedure</tt> for each key/value entry in the
     * map.
     *
     * @param procedure a <code>TOCharCharProcedure</code> value
     * @return false if the loop over the entries terminated because
     *               the procedure returned false for some entry.
     */
    public boolean forEachEntry( TCharCharProcedure procedure );


    /**
     * Transform the values in this map using <tt>function</tt>.
     *
     * @param function a <code>TCharFunction</code> value
     */
    public void transformValues( TCharFunction function );


    /**
     * Retains only those entries in the map for which the procedure
     * returns a true value.
     *
     * @param procedure determines which entries to keep
     * @return true if the map was modified.
     */
    public boolean retainEntries( TCharCharProcedure procedure );


    /**
     * Increments the primitive value mapped to key by 1
     *
     * @param key the key of the value to increment
     * @return true if a mapping was found and modified.
     */
    public boolean increment( char key );


    /**
     * Adjusts the primitive value mapped to key.
     *
     * @param key the key of the value to increment
     * @param amount the amount to adjust the value by.
     * @return true if a mapping was found and modified.
     */
    public boolean adjustValue( char key, char amount );


    /**
     * Adjusts the primitive value mapped to the key if the key is present in the map.
     * Otherwise, the <tt>put_amount</tt> is put in the map.
     *
     * @param key the key of the value to increment
     * @param adjust_amount the amount to adjust the value by
     * @param put_amount the value put into the map if the key is not present
     *
     * @return the value present in the map after the adjustment or put operation
     */
    public char adjustOrPutValue( char key, char adjust_amount, char put_amount );
}
