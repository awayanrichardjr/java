# ArrayList Methods

## Adding Elements

    add(E e)
    add(int index, E element)
    addAll(Collection<? extends E> c)
    addAll(int index, Collection<? extends E> c)

## Removing Elements

    remove(int index)
    remove(Object o)
    removeAll(Collection<?> c)
    removeIf(Predicate<? super E> filter)
    clear()

## Accessing Elements

    get(int index)
    set(int index, E element)
    indexOf(Object o)
    lastIndexOf(Object o)
    subList(int fromIndex, int toIndex)
    
## Checking and Querying

    contains(Object o)
    isEmpty()
    size()

## Iteration and Traversal

    iterator()
    listIterator()
    listIterator(int index)
    forEach(Consumer<? super E> action)
    spliterator()

## Conversion and Cloning

    toArray()
    toArray(T[] a)
    clone()

## Modification and Sorting

    replaceAll(UnaryOperator<E> operator)
    sort(Comparator<? super E> c)
    
## Capacity and Performance

    ensureCapacity(int minCapacity)
    trimToSize()
