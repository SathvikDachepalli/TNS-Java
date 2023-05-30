Hash Table:
Hash class is used to generate hash code of the key.
Hash code is used to find the index of the key in the array.

Hash Table is a data structure which uses hash function to generate index of the key and stores the key-value pair in the array.

Hash Table is also known as Hash Map or Dictionary.

Hash Table is a data structure which uses hash function to generate index of the key and stores the key-value pair in the array.

1. Hash table is the array of the list and each list is known as bucket. This position of bucket is identified by calling the hashcode() method. Hash table contains the unique element.
2. Doesnt store any duplicate key-value pair.
3. Doesnt allow null key but allow multiple null values.
4. Insertion order is not preserved.

Hash Table is the implementation of a map interface. It is synchronized. It stores the key-value pair on the basis of hashing algorithm. It contains only unique elements.
Constructor of Hashtable class:
1. Hashtable(): is used to create a Hashtable object which is empty. It is used to call the default constructor of Hashtable class.
2. Hashtable(int capacity): is used to create a Hashtable object which has the specified capacity. It is used to call the constructor of Hashtable class and int capacity is used to specify the initial capacity of Hashtable. The capacity grows automatically as elements are added to the Hashtable.
3. Hashtable(int capacity, float fillRatio): is used to create a Hashtable object which has the specified capacity and fill ratio. It is used to call the constructor of Hashtable class and int capacity is used to specify the initial capacity of Hashtable and float fillRatio is used to specify the load factor. The load factor determines at what level Hashtable capacity should be increased.

Methods of Hashtable class:
1. void clear(): is used to remove all the key-value pair from the hash table.
2. Object clone(): is used to create the shallow copy of the hashtable.
3. boolean contains(Object value): is used to check whether some value is associated with a key or not.
4. boolean containsKey(Object key): is used to check whether some key is present in a hash table or not.
5. boolean containsValue(Object value): is used to check whether some value is present in a hash table or not.
6. void put(Object key, Object value): is used to insert an entry in the hashtable.