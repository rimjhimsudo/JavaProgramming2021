/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMaps;

/**
 *
 * @author lenovo
 */
public class HashTable<K,V> {
    private class HTPair{
        K key;
        V value;
        HTPair(K key,V value){
            this.key=key;
            this.value=value;
        }
        //compares to HTPair , overrides the compare fuuncion of object class
        //equals normally compares on th ebasis of addresses because  but we want now on basis of keys
        public boolean equals(Object other){
            HTPair op=(HTPair) other;
            return (this.key.equals(op.key));
        }
        
    }
}
